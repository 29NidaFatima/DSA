public class OccurenceOfCharInString {
    public static int findOccurence(String str){
int totalCount= str.length();
int countWithouta= str.replace("a", "").length();
int count= totalCount-countWithouta;
return count;
    }
    public static void main(String[] args) {
        String str="a mango is eaten by nida";
   System.out.println("Frequency of a is :" + findOccurence(str));
    }
}
public class OccurenceOfCharInString {
    public static int findOccurence(String str,char target){
    public static void main(String[] args) {
        
    }
}
//--------------Another way-----------
public class OccurenceOfCharInString {
    public static int findOccurence(String str, char targetChar) {
        int count = 0;
        char[] chars = str.toCharArray(); // Convert string to char array
        for (char c : chars) {
            if (c == targetChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "a mango is eaten by nida";
        char targetChar = 'a';
        System.out.println("Frequency of " + targetChar + " is: " + findOccurence(str, targetChar));
    }
}