import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("Enter the Temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        int temp=scanner.nextInt();
        
        if(temp>30){
            System.out.println("It's Hot");
        }
        else if(temp>20&& temp<30){
            System.out.println("It's Warm");
        }

        else if(temp>10 && temp<19.9){
            System.out.println("It's Moderate");
        }
        else if(temp<10){
            System.out.println("It's Cold");
        }
    }
}
