package jakDojade;

/*
 * Copyright (c) 2018. Schenker AG
 * All rights reserved.
 */

public class Time {

   public int hour;
   public int minute;
   
   public Time(int hour, int minute){
       this.hour = hour;
       this.minute = minute;
   }
   
   @Override
   
   public String toString(){
       return new String() + hour + " " + "hour" + " " + minute + " " + "minute";
   }
   
   
   public Time getTimeDifference(Time time2){
     int firstTimeInMinutes = this.hour * 60 + this.minute;
     int secondTimeInMinutes = time2.hour * 60 + time2.minute;
     int timeDifference = Math.abs(firstTimeInMinutes - secondTimeInMinutes);
     return new Time(timeDifference/60, timeDifference%60);
   }
}


