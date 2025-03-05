import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        System.out.println("Hi Guys, This is an ATM-Based Project");
        Scanner sc = new Scanner(System.in);
        String pin = "12345";
        int attempt = 3;

        while (attempt > 0) {
            System.out.print("Enter Your PIN (Attempts left: " + attempt + "): ");
            String userPin = sc.nextLine();

            if (pin.equals(userPin)) {
                System.out.println("Welcome to My ATM ");
                sc.close();
                return;
            } else {
                System.out.println("Invalid PIN. Try again ");
                attempt--;
            }
        }

        System.out.println("Too many failed attempts. Your account is locked.");
        sc.close();
    }
}
