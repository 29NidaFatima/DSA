
public class ConvertStringCase {

    public static String convertCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i]-= 32; // Convert lowercase to uppercase
            }
            else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32; // Convert uppercase to lowercase
            }
            
          
        }
        return new String(chars);
    }

    public static void main(String[] args) {
String str= "Hello";
System.out.println(convertCase(str));
    }
    
}
