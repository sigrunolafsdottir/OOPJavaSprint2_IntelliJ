package övningsuppgift7;

public class Cirkel extends Figur{
    
    private int radie;
    
    //startpunkten antas vara cirkelns mittpunkt
    public Cirkel (int startx, int starty, int radie){
        super(new Punkt(startx,starty));
        this.radie = radie;
    }
    
    public double area(){
        return Math.PI * radie * radie;
    }
    
    public double omkrets(){
        return Math.PI * (radie + radie);
    }

}