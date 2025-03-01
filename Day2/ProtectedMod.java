 class Parent  {
 protected int count=0;
 void increment(){
 count++;
 System.out.println(count);
 }
    
}
 class Child extends Parent{
 public void display(){
 increment();
 count++;
 System.out.println(count);
 }
}

public class ProtectedMod{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
