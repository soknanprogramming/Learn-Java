package Learning.JavaCode.Code.ReadFiles;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main {
    public static void main(String[] args){
        /*
        How to read a file using Java (3 popular options)
        1. BufferedReader + FileReader : Best for reading text files line-by-line
        2. FileInputStream: Best for binary files (e.g., images, audio files)
        3. RandomAccessFile: Best for read/write specific portions of a large file
         */
        String filePath = ""; //"D:\\Sn New\\Learn-Java\\src\\Learning\\JavaCode\\Code\\WriteFiles\\test2.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            System.out.println("That file exists");
            String line;
            while((line = reader.readLine()) != null ){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("File can't read");
        }


    }
}
