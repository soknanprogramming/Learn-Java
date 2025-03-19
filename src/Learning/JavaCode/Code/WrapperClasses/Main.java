package Learning.JavaCode.Code.WrapperClasses;

public class Main {
    public static void main(String[] args){
        /*
        Wrapper classes = Allow primitive values (int, char, double, boolean)
                          to be used as objects> "Wap them in an object"
                          Generally, don't wrap primitive unless you need an object.
                          Allows use of Collections Framework and static Utility Methods.
         */
/*
        // Autoboxing
        Integer a = 123;
        Double b = 3.15;
        Character c = '$';
        Boolean d = true;
        String e = "Pizza";

        // Unboxing
        boolean x = d;

*//*
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);
        String x = a + b + c +d;
*/
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");
//        float e = Float.parseFloat("2,3f"); // Error

        char letter = 'b';
//        letter = '$';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
