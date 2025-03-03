import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Integer ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Printing The Integer "+num);

        System.out.println("Enter the Double ");
        double dub=Double.parseDouble(br.readLine());
        System.out.println("Printing The Double "+dub);

        System.out.println("Enter the String ");
        char c=br.readLine().charAt(0);
        System.out.println("Printing The Character "+c);

        System.out.println("Enter a Boolean");
        boolean bo=Boolean.parseBoolean(br.readLine());
        System.out.println("Printing The Boolean "+bo);
        
    }
    
}
