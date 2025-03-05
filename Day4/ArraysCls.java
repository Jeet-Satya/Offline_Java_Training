public class ArraysCls {
    public static void main(String[] args) {
        // Declaration
        //int[] array = new int[5]
        //initialization
        int[] array = {1, 2, 3, 4, 5};
        //using for loops
       for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
       }
       // using while loops
       int n=array.length;
       while(n>0){
        System.out.print(array[n-1]+" ");
        n--;
       }

    System.out.println();

    //    using for each loop
    for(int value : array){
        System.out.print(value+" ");
    }
    }
    
}
