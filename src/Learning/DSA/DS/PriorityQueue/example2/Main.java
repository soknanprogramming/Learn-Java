package Learning.DSA.DS.PriorityQueue.example2;
import java.util.Queue;
import java.util.PriorityQueue;

public class Main {
    /*
    Priority Queue = A FIFO data structure that serves elements
                     with the highest priorities first
                     before elements with lower priority
     */
    public static void main(String[] args){
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        Queue<String> queue1 = new PriorityQueue<>();

        queue1.offer("B");
        queue1.offer("C");
        queue1.offer("A");
        queue1.offer("F");
        queue1.offer("D");

        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }

    }

}
