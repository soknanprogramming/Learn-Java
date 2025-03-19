package Learning.JavaCode.Code.ExceptionHandling.example1;

public class Main {
    public static void main(String[] args){
        /*
        Exception = An event that interrupts the normal flow of a program
                    (Dividing by zero, file not found, mismatch input type)
                    Surround any dangerous code with a try{} block
                    try{}, catch{}, finally{}
         */
        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
    }
}
