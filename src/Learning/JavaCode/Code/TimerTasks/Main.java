package Learning.JavaCode.Code.TimerTasks;
import java.util.Timer;
import java.util.TimerTask;
public class Main {
    public static void main(String[] args){
        /*
        TimerTasks = Represents the task that will be executed by the timer
                     You will extend the TimeTask class to define your task
                     Create a subclass of TimerTasks and @Override run()
         */

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;
            @Override
            public void run(){
                System.out.println("Hello!");
                count--;
                if(count <= 0){
                    System.out.println("TASK COMPLETE!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task,3000, 1000);
    }


}
