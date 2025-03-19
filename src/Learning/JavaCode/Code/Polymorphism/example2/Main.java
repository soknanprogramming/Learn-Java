package Learning.JavaCode.Code.Polymorphism.example2;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle boat = new Boat();

        bike.go();
        car.go();
        boat.go();
    }
}
