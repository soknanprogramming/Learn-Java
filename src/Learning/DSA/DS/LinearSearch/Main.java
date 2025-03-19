package Learning.DSA.DS.LinearSearch;

public class Main {
    public static void main(String[] args){
        /*
        linear search = Iterate through a collection one element at a time
        runtime complexity: O(n)

        Disadvantages:
        Slow for large data sets

        Advantages:
        Fast for searches of small to medium data sets
        Does not need to sorted
        Useful for data structure that do not have random access (Liked List)

        Big O notation
        O(n) = linear time
            - looping through elements in an array
            - searching through a linked list
         */

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = linearSearch(array, 2);
        int index2 = linearSearch(array, 1);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }

        //System.out.println(index);

    }
    private static int linearSearch(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(value == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
