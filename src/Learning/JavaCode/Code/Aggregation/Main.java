package Learning.JavaCode.Code.Aggregation;

public class Main {
    public static void main(String[] args){
        /*
        Aggregation = Represents a "has-a" relationship between objects.
        One object contains another object as part of its structure,
        but the contains object/s can exist independently
         */
        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the king", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);
        library.displayInfo();

    }
}
