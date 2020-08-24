package ÖvnUppg1_TDD;

public class Triangle implements Figure {

    protected int height;
    protected int base;

    public Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setBase(int newBase) {
        this.base = newBase;
    }

    @Override
    public double getArea() {
        return height * base / 2;
    }

    protected double lengthOfSide(){
        return Math.sqrt((base/2)*(base/2)+height*height);
    }

    @Override
    public double getCircumference() {
        return base+2*lengthOfSide();
    }
}
