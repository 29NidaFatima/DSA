import java.util.Arrays;

public class StringQues {
    // Q1:Count how many times lowercase vowels occurred in a String entered by the
    // user.
    public static String checkVowels(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Use charAt to get the character at each position
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sb.append(ch); // Append the vowel to StringBuilder
            }
        }

        return sb.toString();
    }

    // Q4: Determine if 2 Strings are anagrams of each other. What are anagrams? If
    // two strings contain the same characters but in a different order, they can be
    // said to be anagrams. Consider "race" and "care". In this case, race's
    // characters can be formed into "care", or care's characters can be formed into
    // "race". Below is a Java program to check if two strings are anagrams or not.
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        // Q1:Count how many times lowercase vowels occurred in a String entered by the
        // user.
        String str = "Nida";
        String vowels = checkVowels(str);
        System.out.println(vowels);
        // Q2
        // What will be the output of the followingcode?
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
        // Q3:What will be the output of the followingcode?
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
        // Q4: Determine if 2 Strings are anagrams of each other. What are anagrams? If
        // two strings contain the same characters but in a different order, they can be
        // said to be anagrams. Consider "race" and "care". In this case, race's
        // characters can be formed into "care", or care's characters can be formed into
        // "race". Below is a Java program to check if two strings are anagrams or not.

        String str1 = "race";
        String str2 = "care";

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
        // Q5 :Search and read about
        // a.intern( ) method in String
        String str1 = new String("hello");
        String str2 = str1.intern(); // "hello" is added to the string pool if not already present
        String str3 = "hello";

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);

        // b.StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);

    }
}
