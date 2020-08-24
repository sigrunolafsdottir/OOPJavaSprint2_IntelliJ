package ÖvnUppg1_TDD;

public class Square implements Figure {

    protected int length;
    protected int width;

    public Square(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getCircumference() {
        return length * 2 + width *2;
    }
}
