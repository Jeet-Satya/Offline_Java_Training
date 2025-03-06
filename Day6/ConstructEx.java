import java.util.Scanner;

public class ConstructEx {
    // It automatically call when an object is created 
    String name;
    int num;
    
    ConstructEx(String name){
        // this() is used for calling the default
        // constructor from parameterized constructor
        this();
        this.name=name;
    }
    ConstructEx(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        num = sc.nextInt();
    }
    void show(){
        System.out.println("Name: "+name+" "+"Age :"+num);
    }


    public static void main(String[] args) {
        ConstructEx obj=new ConstructEx();
        obj.show();
    }
}
