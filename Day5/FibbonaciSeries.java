import java.util.Scanner;

public class FibbonaciSeries {
    public static int Fibonacci(int n){
        if(n<=1) return n;
         return Fibonacci(n-1)+Fibonacci(n-2);
    
}
public static void main(String[] args) {
    System.out.println("Enter the number :");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Fibonacci Series up to "+n+" terms is:");
    for(int i=0;i<n;i++){
        System.out.print(Fibonacci(i)+" ");
        }
}
    
}
