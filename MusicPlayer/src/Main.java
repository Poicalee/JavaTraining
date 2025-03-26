import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            String filepath = "My-Heart-Will-Go-On.wav";
            File file = new File(filepath);


            try( Scanner scanner = new Scanner(System.in);
                 AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){



                Clip clip  = AudioSystem.getClip();
                clip.open(audioStream);

                clip.start();


                String response = "";
                while(!response.equals("Q")){

                    System.out.println("P = play");
                    System.out.println("S = stop");
                    System.out.println("R = reset");
                    System.out.println("Q = quit");
                    System.out.print("Enter your choice:");

                    response = scanner.nextLine().toUpperCase();

                    switch(response){
                        case "P" -> clip.start();
                        case "S" -> clip.stop();
                        case "R" -> clip.setFramePosition(0);
                        case "Q" -> clip.close();
                        default -> System.out.println("Invalid choice");
                    }
                }
            }
            catch (FileNotFoundException e){
                System.out.println("File not found");
            }
            catch(IOException e){
                System.out.println("Something went wrong");
            }
            catch(UnsupportedAudioFileException e){
                System.out.println("Wrong audio file(not supported)");
            }
            catch (LineUnavailableException e){
                System.out.println("Unable to access audio file");
            }
            finally {
                System.out.println("Bye!");
            }

    }
}