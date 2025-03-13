package Learning.JavaCode.Code.toSringMethod;

public class Car{
    private final String make;
    private final String model;
    private final int year;
    private final String color;

    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}