
 class A {
 void printA(){
    System.out.println("Hello from A");
 }
}
 class B extends A{
    void printB(){
        System.out.println("Hello from B");
        }
 }
 class C extends A{
    void printC(){
        System.out.println("Hello from C");
    }   
}

class D extends A{
    void printD(){
        System.out.println("Hello from D");
    }
}

public class Hierarchi {
    public static void main(String[] args) {
            B objB = new B();
            C objC = new C();
            D objD = new D();
            objB.printA();
            objC.printA();
            objD.printA();
    }
    
}
