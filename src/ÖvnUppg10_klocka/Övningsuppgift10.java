package ÖvnUppg10_klocka;

import javax.swing.JOptionPane;

public class Övningsuppgift10 {
    
    DateProvider dp = new DateProvider();

    public Övningsuppgift10(){
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
        else System.out.println(dp.getErrorMessage());
    }
    
    

    public static void main(String[] args) {
        Övningsuppgift10 ö = new Övningsuppgift10();
    }
    
}
