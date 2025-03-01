import java.util.*;
public class Main {

     class A {
        static int i=0;
            A(){
               System.out.println("Hello");
               i++;
               System.out.println("Total object created is "+i);
            }
            
        }

    public static void main(String[] args) {
        int i=2;
        float f=2.0f;
        char c='S';
        boolean b=false;
        String str="Satya";
        System.out.println("Int :"+i+", "+"float :"+f+", "+"char :"+c+", "+" "+"boolean :"+b+", "+"String :"+str);
        

        Main mainInstance = new Main();
        Main.A Object = mainInstance.new A();
        Main.A object2 = mainInstance.new A();

    }
   
}

