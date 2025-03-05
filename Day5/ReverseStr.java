

public class ReverseStr {
    public static String revString(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return str;
    }
    return revString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedStr = revString(str);
        System.out.println("Reversed String: " + reversedStr);
        
    }
    
}
