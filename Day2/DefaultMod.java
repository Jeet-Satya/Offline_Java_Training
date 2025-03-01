class DefaultAcc{
    int count=0;
    public void increment(){
        count++;
    }
}

public class DefaultMod {
    public static void main(String[] args) {
        DefaultAcc objAcc = new DefaultAcc();
        for(int i=0; i<10; i++){
            objAcc.increment();
        }
        System.out.println("Count: " + objAcc.count); 
    }
    
}
