package Learning.JavaCode.Code.Generics.example1;

public class Main {
    public static void main(String[] args){
        /*
        Generic = A concept where you can write a class, interface, of method
                  that is compatible with different data type.
                  <T> type parameter (placeholder that gets replaced with a real type)
                  <String> type argument (specifies the type)
         */
        Box<String> box = new Box<>();
        box.setItem("Apple");
        Box<Double> box2 = new Box<>();
        box2.setItem(3.14);

        System.out.println(box.getItem());
        System.out.println(box2.getItem());
    }
}
