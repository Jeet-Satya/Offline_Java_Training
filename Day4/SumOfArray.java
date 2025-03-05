import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += array[i];
        }
        
        System.out.println("Sum of the elements in the array is: " + sum);
    }
    
}
