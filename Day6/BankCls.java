
class Bank{
    String accountHolder;
    int accountNumber;
    double balance=0.0;

    Bank(String accountHolder, int accountNumber,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance=balance;
    }
    void deposite(double  amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited successfully");
            return ;
        }
        else{
            System.out.println("Invalid amount");
            return ;
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn successfully");
            return ;
        }
        else{
            System.out.println("Invalid amount or insufficient balance");
            return ;
        }
    }
    void DisplayBalance(){
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

public class BankCls {
    public static void main(String[] args) {
        Bank people=new Bank("Sharmila", 123,5000.0);
        people.deposite(1500.0);
        people.withdraw(2000.0);
        people.DisplayBalance();
    }
    
}
