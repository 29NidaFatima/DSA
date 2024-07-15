import java.util.*;

public class Strings {
    // public static void printLetters(String str){
    // for(int i=0; i<str.length();i++){
    // System.out.print(str.charAt(i)+" ");
    // }
    
    // System.out.println();
    // }
    // -------------Q1:CHECK IF A STRING IS A PALINDROME---------
    // public static boolean isPalindrome(String str) {
    //     for (int i = 0; i < str.length() / 2; i++) {
    //         int n = str.length();
    //         if (str.charAt(i) != str.charAt(n - 1 - i)) { // not a palindrome

    //             return false;
    //         }
    //     }
    //     return true; 
    // }
//-----------Q2:Route containing 4 directions (E,W,N,S) find a shortest path to reach the destination------------
// public static float getShortestpath( String path){
//     int x=0;
//     int y=0;
//     for(int i=0;i<path.length();i++){
//         //South
// if(path.charAt(i)=='S'){
// y--;
// }
// //North
// else if(path.charAt(i)=='N'){
//     y++;
// } 
// //West
// else if(path.charAt(i)=='W'){
//     x--;
// }
// //East
// else{
//     x++;
// }
//     }
//   int X2= x*x;
//    int Y2=y*y;
//     return (float)Math.sqrt(X2+Y2);

// }
// --------Q4:For a given String convert each first letter of each word to uppercase.----------
// public static String toUpperCase(String str) {
//     StringBuilder sb=new StringBuilder("");
//     char ch =Character.toUpperCase(str.charAt(0));
//     sb.append(ch);
//     for(int i=1; i<str.length();i++){
//         if(str.charAt(i)==' ' && i<str.length()-1){
//             sb.append(str.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));

//         }
//         else{
//             sb.append(str.charAt(i));
//         }
//     }
//     return sb.toString();
// }
// public static String compress(String str) {
//     String newStr="";
//     for(int i=1; i<str.length();i++){
//         Integer count=1;
//         while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
//             count++;
//             i++;
//         }
//         newStr+=str.charAt(i);
//         if(count>1){
//             newStr+=count.toString();
//         }
//     }
// return newStr;
// }
// USING STRINGBUILDER--EFFICIENT
public static String compress(String str) {
    StringBuilder newStr = new StringBuilder("");
    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }
        newStr.append(str.charAt(i));
        if (count > 1) {
            newStr.append(count);
        }
    }
    return newStr.toString();
}

    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2= new String("xyz@13245");

        // Scanner sc= new Scanner(System.in);
        // String name;

        // name= sc.nextLine();
        // System.out.println(name);

        // String fullName="Nida Fatima";
        // System.out.println(fullName.length());
        // concatenation
        // String firstName="Nida";
        // String lastName="Fatima";
        // String fullName= firstName+ " "+lastName;
        // System.out.println(fullName);
        // printLetters(fullName);
        // -------------Q1:CHECK IF A STRING IS A PALINDROME---------
        // String str = "noon ";
        // System.out.println(isPalindrome(str));
        //----Q2:Route containing 4 directions (E,W,N,S) find a shortest path to reach the destination--
    //     String path="WNEENESENNN";
    // System.out.println( getShortestpath(path));
    //------COMPARISION OF TWO STRINGS------
//     String S1="Nida";
//     String S2="Nida";
//     String S3= new String("Fatima");
//     if(S1==S2){
//         System.out.println("Strings are Equal");
//     }else{
//         System.out.println("Strings are not Equal");
//     }
//   if(S1.equals(S3))  {
//     System.out.println("Strings are Equal");
//   }else{
//      System.out.println("Strings are not Equal");
//   }
//------SUBSTRINGS---------
// String str="HELLO WORLD";
// System.out.println(str.substring(0,5));
//----------Q3:Set of Strings and we have to print the Largest String------
// String fruits[]={"Apple","Mango","Banana"};
// String largest= fruits[0];
// for(int i=1;i<fruits.length;i++){
//     if(largest.compareTo(fruits[i])<0){
//         largest=fruits[i];
//     }
// }
// System.out.println(largest);
//----------STRING BUILDER-----
// StringBuilder sb=new StringBuilder("");
// for(char ch='a';ch<='z'; ch++){
// sb.append(ch);
// }
// System.out.println(sb);
// System.out.println(sb.length());
// --------Q4:For a given String convert each first letter of each word to uppercase.----------
// String str="nida fatima";
// System.out.println(toUpperCase(str));
// ----Q5:String Compression-----
String str="aaabbcccdd";
System.out.println(compress(str));

    } 
} 
