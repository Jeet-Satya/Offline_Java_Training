import java.io.Console;

public class ConsoleEx {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        
        String input = console.readLine("Enter your name: ");
        console.printf("Hello, %s!%n", input);
        
        char[] password = console.readPassword("Enter your password: ");
        console.printf("Your password is: %s%n", new String(password));
        
        console.printf("Your home directory is: %s%n", System.getenv("HOME"));
        console.printf("Your current working directory is: %s%n", System.getProperty("user.dir"));
    }
    
}
