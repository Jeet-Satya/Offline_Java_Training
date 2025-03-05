
public class EmailEx {
    public static void sendMail(String name, String company){
        String emailDraft="Dear "+name+" WelCome to "+company+"!";
        System.out.println(emailDraft);
    }
    public static void main(String[] args) {
        sendMail("Satyajit","Nexturn");
    }
}
