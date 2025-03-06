import java.util.Scanner;

class Student{
                    String name;
                    int roll;
                    String grade;
                    public Student(String name, int roll, String grade) {
                        this.name = name;
                        this.roll = roll;
                        this.grade = grade;
                    }
                    public Student(){
                        System.out.println("Enter Name :");
                        Scanner sc=new Scanner(System.in);
                        name = sc.nextLine();
                        System.out.println("Enter Roll :");
                        roll = sc.nextInt();
                        System.out.println("Enter Grade :");
                        grade = sc.next();
                    }
                    void showDetails() {
                        System.out.println("Name: " + name);
                        System.out.println("Roll: " + roll);
                        System.out.println("Grade: " + grade);
                    }

        } 

public class StudentCls {
    public static void main(String[] args) {
        Student student1 = new Student("John", 101, "A+");
        student1.showDetails();
        Student student2 = new Student("Alice", 102, "A");
        student2.showDetails();
        
        
    }
    
}
