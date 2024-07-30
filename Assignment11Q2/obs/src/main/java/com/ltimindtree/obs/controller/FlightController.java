package com.ltimindtree.obs.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ltimindtree.obs.exception.flightNotFoundException;
import com.ltimindtree.obs.model.Flight;
import com.ltimindtree.obs.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController{
 
    @Autowired
    private FlightService flightService;

    @GetMapping("/search/{departureCity}/{arrivalCity}")
    public ResponseEntity<List<Flight>> searchFlights(@PathVariable String arrivalCity,@PathVariable String departureCity) throws flightNotFoundException{
        if(flightService.getFlightSearchStatus(arrivalCity, departureCity) == false){
            throw new flightNotFoundException("No Flight found for given Arrival and Departure City!");
        }
        else{
            List<Flight> flights = flightService.getPrefFlight(arrivalCity, departureCity);
            return new ResponseEntity<>(flights, HttpStatus.OK);
        }
        
    }
 
    @GetMapping("/{flightNumber}")
    public ResponseEntity<Flight> getFlightById(@PathVariable int flightNumber)
            throws flightNotFoundException{
        if(flightService.getFlightByIdStatus(flightNumber)==false){
            throw new flightNotFoundException("Flight for given Flight Number not found!");
        }
        else{
            return ResponseEntity.ok(flightService.getFlightById(flightNumber));
        }
    }

    @PostMapping
    public ResponseEntity<Flight> addEmployee(@RequestBody Flight flight){
        flightService.addFlight(flight);
        return new ResponseEntity<Flight>(flight, HttpStatus.OK);
    }
 
    @ExceptionHandler(flightNotFoundException.class)
    public ResponseEntity<String> handleNoFlightsFoundException(flightNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

}