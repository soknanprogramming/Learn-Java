package Learning.JavaCode.Code.GetterANDSetter;

public class Main {
    public static void main(String[] args){
        /*
        They help protect object data and add rules for accessing or modifying them.
        Getter = Methods that make a field Readable.
        Setter = Methods that make a field Writeable.
         */
        Car car = new Car("Charger", "Yellow", 10000);

        System.out.println(car);
    }
}
