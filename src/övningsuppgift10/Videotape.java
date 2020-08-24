package övningsuppgift10;

import java.time.Duration;


public class Videotape {
     private int length;
     private int usedUpMinutes;
     
     public Videotape (int length, int usedUpMinutes){
         this.length = length;
         this.usedUpMinutes = usedUpMinutes;
     }
     
     protected int minutesLeft(){
         return length-usedUpMinutes;
     }
     
     protected boolean hasEnoughTime(long programTime){
         return minutesLeft() >= programTime;
     }
     
     public boolean hasEnoughTime(Duration d){
        long programTimeInMinutes = d.getSeconds()/60;
        if (hasEnoughTime(programTimeInMinutes)){
            return true;
        }
        else {
            return false;
        }
    }

}
