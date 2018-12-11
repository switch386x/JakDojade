package jakDojade;

import java.util.ArrayList;


/*
 * Copyright (c) 2018. Schenker AG
 * All rights reserved.
 */

public class JakDojade {
    

    ArrayList<Lane> LineList = new ArrayList<>();
    
    private void showLaneInformation(int lane){
        for (int i = 0; i < LineList.size(); i++){
            if (LineList.get(i).getLaneNumber() == lane){
        System.out.println(LineList.get(i).getLaneNumber());
        System.out.println(LineList.get(i).getHandledStops());
        for (int j = 0; j < LineList.get(i).handledStops.size() - 1 ; j++){  // -1 is an index out of bounds protection due to addition to iterator in stop2
            System.out.println(LineList.get(i).getTimesOfTransit(LineList.get(i).handledStops.get(j), LineList.get(i).handledStops.get(j+1)));
        }
            }
        }
    }

    //creation of Lines available for handling
    
    private void addLane(Lane lane){
        LineList.add(lane);
    }
    

    public static void main(String[] args){
        
        ArrayList<Stop> stops = new ArrayList<>();
        stops.add(Stop.BOROWSKA);
        stops.add(Stop.BRZOZOWA);
        stops.add(Stop.KOMANDORSKA);
        
        ArrayList<Time> transitBorowska = new ArrayList<>();
        transitBorowska.add(new Time(12,15));
        transitBorowska.add(new Time(15,00));
        transitBorowska.add(new Time(16,30));
        
        ArrayList<Time> transitBrzozowa = new ArrayList<>();
        transitBrzozowa.add(new Time(13,15));
        transitBrzozowa.add(new Time(16,00));
        transitBrzozowa.add(new Time(18,00));
        
        
        ArrayList<Time> transitKomandorska = new ArrayList<>();
        transitKomandorska.add(new Time(10,00));
        transitKomandorska.add(new Time(16,00));
        transitKomandorska.add(new Time(18,00));
        
        
        
        JakDojade jakDojade = new JakDojade();
        
        Lane linia1 = new Lane(1); // kazda linia ma unikalny identyfikator int

        
        linia1.addHandledStops(stops);
        
        linia1.addTimeOfTransitforStop(Stop.BOROWSKA, transitBorowska);
        linia1.addTimeOfTransitforStop(Stop.BRZOZOWA, transitBrzozowa);
        linia1.addTimeOfTransitforStop(Stop.KOMANDORSKA, transitKomandorska);
        
        jakDojade.addLane(linia1);
        
        jakDojade.showLaneInformation(1);
        
    }
}
