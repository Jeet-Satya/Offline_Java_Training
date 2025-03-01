import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the activity Among the following \"Running\", \"Cycling\", \"Swimming\"");
        String str=sc.nextLine();
        System.out.println("Enter the Duration of the activity");
        float min=sc.nextFloat();
 
        if(str.equals("Running")){
            double caloriesPerMinute = 10.0;
            double totalCaloriesBurned = min * caloriesPerMinute;
            System.out.println((int)totalCaloriesBurned);
        }
        else if(str.equals("Cycling")){
            double caloriesPerMinute =8.0;
            double totalCaloriesBurned = min * caloriesPerMinute;
            System.out.println((int)totalCaloriesBurned);
        }
        else if(str.equals("Swimming")){
            double caloriesPerMinute = 9.8;
            double totalCaloriesBurned = min * caloriesPerMinute;
            System.out.println((int)totalCaloriesBurned);
        }
     

    }
    
}
