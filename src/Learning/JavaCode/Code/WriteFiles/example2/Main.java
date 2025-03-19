package Learning.JavaCode.Code.WriteFiles.example2;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args){
        String filePath = ""; //"D:\\Sn New\\Learn-Java\\src\\Learning\\JavaCode\\Code\\WriteFiles\\test2.txt";
        //String textContent = "I don't like pizza\nIt's unhealthy !\nWhat about you?";
        String textContent = """
                I don't like pizza.
                It's unhealthy !
                What about you?
                :)
                """;
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
