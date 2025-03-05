import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Enter a Number : -------");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){
            System.out.println(num);
            num--;
        }
    }
    
}
