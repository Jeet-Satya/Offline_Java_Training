public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hey It's Jeet");
        System.out.println(sb);
        sb.append(" Hello ");
        System.out.println(sb);
        sb.insert(0, "**");
        System.out.println(sb);
        sb.replace(10,14 ," Satyajit");
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(4));
        sb.setCharAt(0, '*');
        System.out.println(sb);
        
    }
    
}
