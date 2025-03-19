package Learning.JavaCode.Code.WriteFiles.example1;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] arg){
        /*
        How to write a file using java (4 popular options)
        1. FileWriter = Good for small or medium-size text files
        2. BufferedWriter = Better performance for large amounts of text
        3. PrintWriter = Best for structured data, like reports or logs
        4. FileOutputStream = Best for binary files (e.g., images, audio files)
         */
        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("I like pizza!");
            System.out.println("File has been written");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
