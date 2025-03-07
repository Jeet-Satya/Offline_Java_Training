 interface UPIPayments {
    abstract void upiTransfer();

 }
 interface CreditCardPayments{
    abstract void cardTransfer();
 }
 class PaymentGateway implements UPIPayments, CreditCardPayments{
    public void upiTransfer() {
        System.out.println("UPI Payment processed");
    }
    public void cardTransfer() {
        System.out.println("Card Payment processed");
   }
 }

public class InterfaceEx {
    public static void main(String[] args) {
        PaymentGateway gateway=new PaymentGateway();
        gateway.upiTransfer();
        gateway.cardTransfer();
    }
    
}
