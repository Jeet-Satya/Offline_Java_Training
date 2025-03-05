

public class Fact {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
    
        return n*factorial(n-1);
    }

    public static void printNum(int n){
        if(n==0){
            return;

        }
        printNum(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        printNum(5);
        
    }
    
}
