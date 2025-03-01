class Therd extends Thread { 
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getId());
            // try{
            //     Thread.sleep(200);
            // }
            // catch(InterruptedException e){
            //     e.printStackTrace();
            // }
        }

    }
}

public class TypeCast {
    public static void main(String[] args) {
        Therd th1 = new Therd();
        Therd th2 = new Therd();
        th1.start(); 
        th2.start();
    }
}
