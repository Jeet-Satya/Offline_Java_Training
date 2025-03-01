
class PrivateMod{
    private int privateVar = 10;
    void accessPrivate(){
            System.out.println(privateVar);
        }
        void Set(int p){
            privateVar = p;
        }
        void get(){
            System.out.println(privateVar);
        }
    
    }
    
    public class AccessMod{
    
            public static void main(String[] args) {
            PrivateMod mod = new PrivateMod();
           mod.accessPrivate();
    }
}