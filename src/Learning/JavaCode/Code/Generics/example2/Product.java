package Learning.JavaCode.Code.Generics.example2;

public class Product<T, U> {
    T item;
    U price;

    Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return item;
    }
    public U getPrice(){
        return price;
    }
}
