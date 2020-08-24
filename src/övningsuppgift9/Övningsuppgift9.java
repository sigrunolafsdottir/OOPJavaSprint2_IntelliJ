package övningsuppgift9;

import javax.swing.JOptionPane;

public class Övningsuppgift9 {
    
    DateProvider dp = new DateProvider();

    public Övningsuppgift9(){
        String vilkenStad = JOptionPane.showInputDialog("Vilken stad vill du veta tiden för?");
        boolean giltigStad = false;
        if(vilkenStad.toUpperCase().trim().equals("STOCKHOLM")){
            System.out.println(dp.getMessage("Stockholm" ));
        }
        else if(vilkenStad.toUpperCase().trim().equals("SHANGHAI")){
             System.out.println(dp.getMessage("Shanghai" ));
        }
        else if(vilkenStad.toUpperCase().trim().equals("TORONTO")){           
            System.out.println(dp.getMessage("Toronto"));
        }
        else dp.getErrorMessage();
    }
    
    

    public static void main(String[] args) {
        Övningsuppgift9 ö = new Övningsuppgift9();
    }
    
}
