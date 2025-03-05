import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
         System.out.println("Hit 1 for Cheking palindrome on Integer And 2 for String");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         switch (n) {
            case 1:
            System.out.println("Enter the Number");
            int num=sc.nextInt();
            System.out.println(intPalindrome(num)); 
                break;
            case 2:
            System.out.println("Enter the String");
            String str=sc.next();
            System.out.println(strPalindrome(str));
         
            default:
                break;
         }
         
    }

    static boolean intPalindrome(int number) {
        int reverse = 0, temp = number;
        while (temp!=0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return number == reverse;
    }

     static boolean strPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start)!= str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
     }
    
}
