package Learning.DSA.DS.DynamicArray;

public class Main {
    public static void main(String[] args){
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("G");
        dynamicArray.add("K");
        dynamicArray.insert(0, "Y");
//        dynamicArray.delete("B");
        int indexOfA = dynamicArray.search("A");
        dynamicArray.delete("Y");
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("C");

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("A: " + indexOfA);
    }
}
