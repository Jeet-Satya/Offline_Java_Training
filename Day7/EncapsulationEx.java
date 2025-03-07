class Atm{
    private int pin;
    private String name;
    Atm(){}
    Atm(int pin, String name){
        this.pin = pin;
        this.name = name;
    }
    void setName(String name){
        this.name = name;
    }
    void setPIN(int pin){
        this.pin=pin;
    }
    String getName(){
        return name;
    }
    int getPin(){
        return pin;
    }
}
public class EncapsulationEx {
    public static void main(String[] args) {
        Atm sensor=new Atm();
        sensor.setName("John");
        sensor.setPIN(1234);
        System.out.println(sensor.getName());
        System.out.println(sensor.getPin());
    }
    
}
