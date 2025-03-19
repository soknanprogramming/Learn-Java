package Learning.JavaCode.Code.ExceptionHandling.example2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number!");
        }
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            scanner.close();
            System.out.println("It's away running");
        }
    }
}
