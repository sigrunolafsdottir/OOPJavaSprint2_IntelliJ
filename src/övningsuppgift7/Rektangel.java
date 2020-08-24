package övningsuppgift7;


public class Rektangel extends Figur{
    
    private int bredd;
    private int höjd;
    
    public Rektangel (int startx, int starty, int bredd, int höjd){
        super(new Punkt(startx,starty));
        this.bredd = bredd;
        this.höjd = höjd;
    }
    
    public double area(){
        return bredd*höjd;
    }
    
    public double omkrets(){
        return 2*bredd+2*höjd;
    }
    
    public String testString(){
        return "test";
    }

}
