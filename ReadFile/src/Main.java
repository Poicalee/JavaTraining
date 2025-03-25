import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // three popular options

            // BufferedReader + FileReader: Best for reading text files line-by-line
            // FileInputStream: Best for binary files (e.g., images, audio files)
            // RandomAccessFile: Best for read/write specific portions of a large file
        String filepath = "C:\\Users\\Karol\\Desktop\\JavaTraining\\ReadFile\\test.txt";



        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("I/O Error");

        }



    }
}