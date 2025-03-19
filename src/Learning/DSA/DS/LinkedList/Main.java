package Learning.DSA.DS.LinkedList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        // push method use to add object to the head of linkedList
        // [F, D, C, B, A]
        linkedList.pop(); // F will be pop

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("F");
        // offer method use to add object to the tail of linkedList
        linkedList2.poll();

        linkedList2.add(2, "E");
        linkedList2.remove("C");

        System.out.println(linkedList2.indexOf("F"));

        System.out.println(linkedList);
        System.out.println(linkedList2);
        System.out.println(linkedList2.peekFirst());
        System.out.println(linkedList2.peekLast());
        linkedList2.addFirst("0");
        linkedList2.addLast("G");
        System.out.println(linkedList2);
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(first);
        System.out.println(last);

        /*
        LinkedList = stores Nodes in 2 parts (data + address)
                     Node are in non-consecutive memory locations
                     Elements are linked using pointers

                     Singly Linked List
                     Node                Node                Node
                     [data | address] -> [data | address] -> [data | address]
                     Doubly Linked List
                     Node,                           Node
                     [address | data | address] <-> [address | data | address]

                     advantages?
                     1. Dynamic Data Structure (allocates needed memory while running)
                     2. Inserting and Deleting of Nodes is easy. O(1)
                     3. No/Low memory waste

                     disadvantages
                     1. Greater memory usage (additional pointer)
                     2. No random access of element (no index [i])
                     3. Accessing/searching elements is more time-consuming. O(n)

                     uses?
                     1. implement Stacks/Queues
                     2. GPS navigation
                     3. music playlist
         */
    }
}
