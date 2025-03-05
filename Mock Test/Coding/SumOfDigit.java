import java.util.Scanner;

public class SumOfDigit { 
    public static int sumOfDigit(int n){
        if(n==0) return 0;
        return (n%10)+sumOfDigit(n/10);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to find the sum of digits :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfDigit(n));
    }
    
}
