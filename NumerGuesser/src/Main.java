import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Random rand = new Random();
            Scanner sc = new Scanner(System.in);
            int max = 100;
            int min = 1;
            int randomNum = rand.nextInt(min,max+1);
            int guess;
            int attempts = 0;


        System.out.println("Welcome to the Guess Generator!");
        System.out.printf("Guess a number between %d - %d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            if(guess < randomNum){
                System.out.println("Your number is too low!");
                min = guess;
                attempts++;
            }else if(guess > randomNum){
                System.out.println("Your number is too high!");
                max = guess;
                attempts++;
            }else {
                System.out.println("Congratulations! You guessed it!");
                attempts++;
                System.out.println("Your number is " + randomNum);
                System.out.println("Attempts: " + attempts);
            }

        }while(guess != randomNum);




            sc.close();
    }
}