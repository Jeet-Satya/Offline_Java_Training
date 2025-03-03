public class CommandEx {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Provide atleast two argument");
        }
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        System.out.println("Hello "+name+", your age is "+age);
    }
    
}
