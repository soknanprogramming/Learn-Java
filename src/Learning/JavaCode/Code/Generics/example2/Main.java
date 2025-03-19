package Learning.JavaCode.Code.Generics.example2;

public class Main {
    public static void main(String[] args){
        Product<String, Double> product = new Product<>("Bike", 20.00);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}
