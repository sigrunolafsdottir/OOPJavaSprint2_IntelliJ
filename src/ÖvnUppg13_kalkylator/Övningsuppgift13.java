package ÖvnUppg13_kalkylator;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Övningsuppgift13 {
    
    public Övningsuppgift13(){
        Calculator calculator = new Calculator();
        double firstNumber;
        double secondNumber;
        String operator ;
        double result;
        String indata;
        String resultString = "";

        while(true){
            indata = JOptionPane.showInputDialog(resultString + 
                    "Skriv ett uttryck");
            
            if (indata == null){
              System.exit(0);
            }
            Scanner sc = new Scanner(indata);
            try{
                firstNumber = sc.nextDouble();
                operator = sc.next();
                secondNumber = sc.nextDouble();
                result = calculator
                  .calculate(firstNumber, secondNumber, operator);
                resultString = "Svaret blev " +result+". " ;
            }
            catch (InputMismatchException e){
                resultString = "Fel format på indata. " ;
            }
            catch (NoSuchElementException  e){
                resultString = "Kunde inte läsa indata. " ;
            }
            catch (OperatorNotSupportedException   e){
                resultString = e.getMessage();
            }
        }
    }
    
    public static void main(String[] args){
        Övningsuppgift13 ö = new Övningsuppgift13();
        
    }
    
}
