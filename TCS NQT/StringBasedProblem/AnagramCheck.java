public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] charCount = new int[26]; // Assuming only lowercase English letters
      

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;  // Increment count for str1
            charCount[str2.charAt(i) - 'a']--;  // Decrement count for str2
        }

        for (int count : charCount) {
            if (count != 0) return false;
        }

        return true;
    }
  
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
      System.out.println(  isAnagram(str1, str2));
      S

    }
}
