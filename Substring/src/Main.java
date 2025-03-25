import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String email ;
        String username;
        String domain;
        System.out.print("Enter your email:");

        email = sc.nextLine();
        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println(username);
            System.out.println(domain);
        }else{
            System.out.println("Invalid email has to contain @");
        }

        sc.close();
    }
}