import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Four popular options

        // FileWriter = Good for small or medium-sized test files
        // BufferedWriter = Better performance for large amount of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filepath = "test.txt";
        String textContent = "This is a test\nHello World!\n";

        try(FileWriter writer = new FileWriter(filepath)) {
            writer.write(textContent);
            System.out.println("File written successfully");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Couldn't write test.txt");
        }

    }
}