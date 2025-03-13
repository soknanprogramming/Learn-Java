package Learning.DSA.DS.PriorityQueue.example1;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    /*
    Priority Queue = A FIFO data structure that severs elements with the highest priorities first
                     before elements with lower priority
     */

    public static void main(String[] args){
        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
