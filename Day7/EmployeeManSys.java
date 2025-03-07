abstract class Employee {
    String name;
    int empID;

    Employee(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    abstract void CalculateSalary();  

    void showDetails() {  
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empID);
    }
}

class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name, int empID) {
        super(name, empID);
    }
void CalculateSalary(){
System.out.println("Salary: 50,000");
}

}

class PartTimeEmployee extends Employee{
    int hour;
    PartTimeEmployee(String name, int empID, int hour) {
        super(name, empID);
        this.hour = hour;
    }
    void CalculateSalary(){
    System.out.println("Salary: " + hour * 500);

    }
}


public class EmployeeManSys {
    public static void main(String[] args) {
        FullTimeEmployee ft=new FullTimeEmployee("Ramya",101 );
        ft.showDetails();
        ft.CalculateSalary();
        System.out.println();
        PartTimeEmployee pt=new PartTimeEmployee("Sharmi",102,20);
        pt.showDetails();
        pt.CalculateSalary();
    }
    
}
