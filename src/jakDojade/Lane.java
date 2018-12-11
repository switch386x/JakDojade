package jakDojade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Copyright (c) 2018. Schenker AG
 * All rights reserved.
 */

public class Lane {

    public int laneNumber;
    public ArrayList<Stop> handledStops = new ArrayList<>();    // jesli jej nie przyrownam do niczego, czyli w tym przypadku do obietku ArrayList to jest to zmienna o referencji null
    public Map<Stop,ArrayList<Time>> timesOfTransit = new HashMap<Stop,ArrayList<Time>>();
    //public ArrayList<Time> timeOfDeparture;
   // ArrayList<Stop> handledStopsForParticularLane = new ArrayList<Stop>();
    //public Map<Stop,ArrayList<Integer>> timeOfDepartureFromStop = new HashMap<Stop,ArrayList<Integer>>(); //
   // single responsibility principle
    
    
    public int getLaneNumber() {
        return laneNumber;
    }

    public void setLaneNumber(int laneNumber) {
        this.laneNumber = laneNumber;
    }
    // constructor
    public Lane(int laneNumber){
        this.setLaneNumber(laneNumber);
    }
    
    public void addHandledStops(ArrayList<Stop> stops){
        handledStops.addAll(stops);      
    }
    
    public ArrayList<Stop> getHandledStops() {
        return handledStops;
    }
    
    public void addTimeOfTransitforStop(Stop stop, ArrayList<Time> transit){
        for (int i = 0; i < handledStops.size(); i++){
            timesOfTransit.put(stop, transit);
        }
    }
    
    public Time getTimesOfTransit(Stop stop1, Stop stop2) { 
        return timesOfTransit.get(stop1).get(0).getTimeDifference(timesOfTransit.get(stop2).get(0));   
    }
        
    
//    public ArrayList<Stop> createHandledStopsForLane1() {
//
//        handledStopsForParticularLane.add(Stop.BOROWSKA);
//        handledStopsForParticularLane.add(Stop.KAMIENNA);
//
//        return handledStopsForParticularLane;
//    }
//
//    public ArrayList<Stop> createHandledStopsForLane2() {
//
//        handledStopsForParticularLane.add(Stop.KOMANDORSKA);
//        handledStopsForParticularLane.add(Stop.KAMIENNA);
//        handledStopsForParticularLane.add(Stop.BRZOZOWA);
//        handledStopsForParticularLane.add(Stop.KSIECIA_WITOLDA);
//
//        return handledStopsForParticularLane;
//    }
//
//    public ArrayList<Stop> createHandledStopsForLane3() {
//
//        handledStopsForParticularLane.add(Stop.KOMANDORSKA);
//        handledStopsForParticularLane.add(Stop.BRZOZOWA);
//        handledStopsForParticularLane.add(Stop.KAMIENNA);
//
//        return handledStopsForParticularLane;
//    }
//
//    public ArrayList<Stop> createHandledStopsForLane4() {
//
//        handledStopsForParticularLane.add(Stop.BOROWSKA);
//        handledStopsForParticularLane.add(Stop.BRZOZOWA);
//        handledStopsForParticularLane.add(Stop.KSIECIA_WITOLDA);
//
//        return handledStopsForParticularLane;
//    }
//    
    
    
     
}

