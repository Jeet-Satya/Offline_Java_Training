import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\W", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;
        
        while (left < right) {
            if (cleanStr.charAt(left)!= cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the String To Check the String is Palindrome or not :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome");
        }
        else {
            System.out.println(str +" is not a palindrome ");
        }
    }
    
}
