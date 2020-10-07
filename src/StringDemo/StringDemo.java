package StringDemo;


public class StringDemo {
    
    public static void main(String[] args){
        String s1 = new String("hej");
        String s2 = new String("hej");
        String s3 = new String("HEJ");
        //s1 = s2;
/*
        //överlagrat, vi jämför strängarna själva
        System.out.println("s1 equals s2 "+s1.equals(s2));
        System.out.println("s2 equals s3 "+s2.equals(s3));
        System.out.println("s2 equals s3 "+s2.equals(s3.toLowerCase()));
        System.out.println("s2 equalsIgnoreCase s3 "+s2.equalsIgnoreCase(s3));

        //inte överlagrat, vi jämför referenser
        System.out.println("s1 == s2 " + (s1 == s2));
*/
/*
        //blanda inte ihop equals med compare, den är helt annorlunda
        System.out.println("s1.compareTo(s2) "+s1.compareTo(s2));
        System.out.println("s2.compareTo(s3) "+s2.compareTo(s3));
        System.out.println("comparetest "+"hejaaaA".compareTo("hej"));
        System.out.println("comparetest "+"HEJAfdsfsf".compareTo("Nej"));

*/

        String s4 = new String("varmluftsballong");
        System.out.println("s4.substing(9) " + s4.substring(9));
        System.out.println("s4.substing(4, 8) " + s4.substring(4,8));
        

    }
    
}
