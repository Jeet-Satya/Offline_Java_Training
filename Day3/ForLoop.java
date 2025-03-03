public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
    }
    
}
