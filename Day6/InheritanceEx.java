
class Student{
    void speak(){
        System.out.println("Nexturners");
    }
}
class Teacher extends Student{
    void teach(){
        System.out.println("Kalpesh");
    }
}
class Principal extends Teacher{
    void Management(){
        System.out.println(" principals");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.speak();
        Principal p=new Principal();
        p.speak();
        p.teach();
    }
}
