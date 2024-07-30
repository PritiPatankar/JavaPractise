package com.ltimindtree.obs.model;

public class Flight {
    private int flightId;
    private String depCity;
    private String arrCity;
    private String time;

    public Flight(int flightId, String depCity, String arrCity, String time){
        this.flightId = flightId;
        this.depCity = depCity;
        this.arrCity = arrCity;
        this.time = time;
    }
    public int getFlightId() {
        return flightId;
    }
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
    public String getDepCity() {
        return depCity;
    }
    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }
    public String getArrCity() {
        return arrCity;
    }
    public void setArrCity(String arrCity) {
        this.arrCity = arrCity;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }  
}
