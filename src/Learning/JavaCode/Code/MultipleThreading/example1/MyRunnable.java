package Learning.JavaCode.Code.MultipleThreading.example1;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i + ": " +Thread.currentThread().getName());
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }
}
