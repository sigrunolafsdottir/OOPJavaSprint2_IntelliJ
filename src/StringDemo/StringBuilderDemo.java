package StringDemo;


public class StringBuilderDemo {
    
    public static void main(String[] args){
        
        double i = 3.14;
        
        StringBuilder sb = new StringBuilder("Laboration");
        sb.append(" idag kl ").append(i);
        
        System.out.println(sb);
 
    }

}
