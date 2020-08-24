package LocaleDemo;

import java.time.LocalDate;
import java.util.Locale;


public class LocaleDemo {

    LocaleDemo(){
        System.out.println("Default locale: "+Locale.getDefault());
        System.out.println("Printing country: "+Locale.getDefault().getCountry());
        System.out.println("Printing language: "+Locale.getDefault().getLanguage());
        System.out.println("Print now " +LocalDate.now());
        
        Locale.setDefault(Locale.FRENCH);
        System.out.println("New locale: "+Locale.getDefault());
        
        Locale.setDefault(Locale.US);
        System.out.println("New locale: "+Locale.getDefault());
    }
    
    public static void main(String[] args){
        LocaleDemo g = new LocaleDemo();
    }
    
}
