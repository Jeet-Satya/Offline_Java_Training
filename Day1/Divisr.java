import java.util.Scanner;

public class Divisr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();

        int mini = Math.min(num1, num2);
        int ans = 1; 
        for (int i = 1; i <= mini; i++) { 
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i; 
            }
        }

        System.out.println("The Greatest Common Divisor is: " + ans);
        
        sc.close(); 
        }
    }
    
