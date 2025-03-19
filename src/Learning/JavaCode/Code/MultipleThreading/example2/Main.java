package Learning.JavaCode.Code.MultipleThreading.example2;

public class Main {
    public static void main(String[] args){
        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interrupted");
        }


        System.out.println("GAME OVER!");
    }
}
