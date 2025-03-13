package Learning.DSA.DS.PriorityQueue.example3;
import java.util.Collections;
import java.util.Queue;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());

        queue1.offer(3.0);
        queue1.offer(2.5);
        queue1.offer(4.0);
        queue1.offer(1.5);
        queue1.offer(2.5);

        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }

    }
}
