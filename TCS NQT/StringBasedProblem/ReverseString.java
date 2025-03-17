public class ReverseString {
    public static String reverseString(String str){
String reverseStr= " ";
for (int i = 0; i < str.length(); i++) {
    char ch= str.charAt(i);
    reverseStr= ch+ reverseStr;
}
return reverseStr;
    }
    public static void main(String[] args) {
        String str= "xyz";
 String reverseString= reverseString(str);
 System.out.println(reverseString);
    }
}
//----------OPTIMIZED CODE-------------
public class ReverseString {
    public static String reverseString(String str){
StringBuilder reverseStr= new StringBuilder();
for (int i = str.length()-1; i >= 0; i--) {
    reverseStr.append(str.charAt(i));
}
return reverseStr.toString();
    }
    public static void main(String[] args) {
        String str="apple";
 String reverseString= reverseString(str);
 System.out.println(reverseString);
    
    }

}