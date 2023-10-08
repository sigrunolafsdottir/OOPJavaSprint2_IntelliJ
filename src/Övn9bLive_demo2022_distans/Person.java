package Övn9bLive_demo2022_distans;

public class Person {

    //Person kortis = new Person("Kalle", "Xvägen", "12345 Ystad", 25, 80, 175);

    protected String name;
    protected String street;
    protected String city;
    protected int age;
    protected int weight;
    protected int length;

    public Person(String name, String street, String city, int age, int weight, int length) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
