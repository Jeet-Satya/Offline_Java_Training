import java.util.Scanner;

public class EqualArray {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.println("Enter the element of the first array");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i<5;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the element of the second array");
        for (int i = 0; i<5;i++){
            arr2[i] = sc.nextInt();
        }
        boolean isEqual = true;
        for(int i=0; i<5; i++){
            if(arr1[i]!=arr2[i]){
                isEqual = false;
                break;
            }
        }
        if(isEqual){
            System.out.println("Both arrays are equal");
        }else{
            System.out.println("Both arrays are not equal");
        }
    }
}
