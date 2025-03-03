import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Input{
    public static void main(String[] args) throws IOException {
        // Using Scanner  class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // Using BufferedReader 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String str = br.readLine();
        System.out.println("You entered: " + str);
        
        // Using Console class
        Console console = System.console();
        if(console!=null){
            System.out.print("Enter a password: ");
            char[] password = console.readPassword();
            System.out.println("You entered: " + new String(password));
        }
        
       

    }
}