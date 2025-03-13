package Learning.DSA.DS.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        //******************************************************************************
        /*
        Queue = FIFO data structure. First-In First-Out (ex. A line of people)
                A collection designed for holding elements prior to processing
                Linear data structure
         */
        /*
        add = enqueue, offer()
        remove = dequeue, poll()
         */
        //******************************************************************************

        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println("1. " + queue.peek());
        System.out.println("2. " + queue);

        String test = queue.poll();
        String test2 = queue.poll();

        System.out.println("3. " + queue.element());

        System.out.println("4. " + queue);
        System.out.println("5. " + queue.size());
        queue.poll();
        //queue.poll();
        System.out.println("6. " + queue.isEmpty());
        System.out.println("7. " + queue.contains("Harold"));

        // Where are queue useful?
        /*
        1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        2. Printer Queue (Print jobs should be completed in order)
        3. Used in LinkedList, PriorityQueues, Breadth-first search
         */


    }
}
