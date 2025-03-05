import java.util.Scanner;

public class LargestEle {
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array");
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
    
}
