package Learning.JavaCode.Code.ArrayLists.example1;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        /*
        ArrayList = A resizeable array that stores objects (autoboxing).
                    Arrays are fixed in size, but ArrayLists can change.
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(1.99);
        list2.add(2.01);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Coconut");

        fruits.remove(1);
        fruits.set(0, "Pineapple");

        System.out.println(list);
        System.out.println(list2);
        System.out.println(fruits);
        System.out.println(fruits.get(1));
        System.out.println(fruits.size());
        Collections.sort(fruits);
        System.out.println(fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
