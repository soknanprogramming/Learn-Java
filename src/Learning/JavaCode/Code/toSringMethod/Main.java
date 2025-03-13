package Learning.JavaCode.Code.toSringMethod;
class Main {
    public static void main(String[] args){
        /*
        .toString() = Method inherited from the Object class.
        Used to return a string representation of an object.
        By default, it returns a hash code ad a unique identifier
        It can be overridden to provide meaningful details.
         */
        Car car = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");
        System.out.println(car);
        System.out.println(car2);
    }
}