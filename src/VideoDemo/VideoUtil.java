package VideoDemo;

import java.time.Duration;
import java.time.LocalTime;


public class VideoUtil {
    
    public int getTVProgramLength(LocalTime tvStart, LocalTime tvSlut){
        Duration d = Duration.between(tvStart, tvSlut);
        return (int) d.getSeconds()/60;
    }
    
    public boolean willProgramFit(int programLength, int timeLeftOnVideoTape){
        if (timeLeftOnVideoTape >= programLength) {
            return true;
        }
        return false;
    }
    
    public String getMessage(boolean res){
        if (res) 
            return "Bandet räcker";
        else{
            return "Bandet räcker inte";
        }
    }
}
