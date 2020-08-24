package JOptionDemo;

import javax.swing.JOptionPane;


public class JOptionDemo {
    
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Happy Birthday ");
        
        //Reading input
        String s = JOptionPane.showInputDialog(null, "Happy Birthday ");
        System.out.println(s);
    }
}
