import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter the Grade");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>100 || mark<0){
            System.out.println("Invalid Mark");
            return;  
        }
        else{

        int grade=mark/10;

        switch(grade){
            case 10:
            System.out.println("Grade A");
            break;
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Grade F");
                break;
        }
    }
    }
    
}
