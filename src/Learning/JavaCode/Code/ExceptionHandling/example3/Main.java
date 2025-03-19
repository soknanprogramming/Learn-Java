package Learning.JavaCode.Code.ExceptionHandling.example3;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
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
            System.out.println("Finally away working");
        }
    }
}
