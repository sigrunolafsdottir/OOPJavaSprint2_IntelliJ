package Övningsuppgift6b;


public class Person {
    
    protected String name;
    protected String road;
    protected String postal;
    protected int weight;
    protected int length;
    protected int age;
    
    public Person (String name, String road, String postal, int age, int weight, int length ){
        this.name = name;
        this.road = road;
        this.postal = postal;
        this.weight = weight;
        this.length = length;
        this.age = age;
    }
    
    public int getLength(){
        return length;
    }
    
    public String getName(){
        return name;
    }
    
}
