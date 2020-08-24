package ÖvnUppg1_TDD;

public class Circle implements Figure{
    
    private int radius;
    
    //startpunkten antas vara cirkelns mittpunkt
    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newtRadius) {
        this.radius = newtRadius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference(){
        return Math.PI * (radius + radius);
    }

}