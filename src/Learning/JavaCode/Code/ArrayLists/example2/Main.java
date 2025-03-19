package Learning.JavaCode.Code.ArrayLists.example2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food # " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println("Your fruits list: ");
        for(String food : foods){
            System.out.println("- " + food);
        }

        scanner.close();
    }
}
