package com.ltimindtree.obs.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ltimindtree.obs.model.Flight;

@Service
public class FlightService{

    private final List<Flight> flights = new ArrayList<>();
    public List<Flight> getPrefFlight(String arr, String dep){
        List<Flight> prefFlight = new ArrayList<>();
        for(Flight flight: flights){
           if(flight.getArrCity().equalsIgnoreCase(arr) && flight.getDepCity().equalsIgnoreCase(dep)){
               prefFlight.add(flight);
           }
        }
       return prefFlight;
       }

       public boolean getFlightSearchStatus(String arr, String dep) {
        for(Flight flight: flights){
            if(flight.getArrCity().equalsIgnoreCase(arr) && flight.getDepCity().equalsIgnoreCase(dep)){
                return true;
            }
         }
        return false;
       }

       public Flight getFlightById(int flightId) {
        for(Flight flight: flights){
           if(flight.getFlightId() == flightId){
               return flight;
           }
        }
        return null;
       }

       public boolean getFlightByIdStatus(int flightId) {
        for(Flight flight: flights){
           if(flight.getFlightId()==flightId){
               return true;
           }
        }
        return false;
       }

       public void addFlight(Flight flight){
        flights.add(flight);
       }
}
