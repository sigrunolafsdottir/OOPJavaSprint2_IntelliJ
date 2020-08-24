package VideoDemo;


public class Video {
    
    private int length;
    private int alreadyTaped;
    
    public Video(int len, int taped){
        length = len;
        alreadyTaped = taped;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAlreadyTaped() {
        return alreadyTaped;
    }

    public void setAlreadyTaped(int alreadyTaped) {
        this.alreadyTaped = alreadyTaped;
    }
    
    public int getLengthLeft(){
        return length-alreadyTaped;
    }

}
