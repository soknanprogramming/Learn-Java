package Learning.JavaCode.Code.Polymorphism.example1;

public class Main {
    public static void main(String[] args){
        /*
        Polymorphism = POLY = MANY
                       MORPH = SHAPE
                       Objects can identify as other objects.
                       Objects can be treated an objects of a common superclass
         */
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();


        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
