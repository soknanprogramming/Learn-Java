package Learning.JavaCode.Code.RuntimePolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Runtime polymorphism = When the method that gets executed is decided
                               at runtime based on the actual type of the objects
         */
        Scanner scanner = new Scanner(System.in);

        Animal animal;
        System.out.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Car();
            animal.speak();
        }

    }
}
