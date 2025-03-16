public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) { // Fix: Subtract 1 from index
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str)); // Output: true
    }
}
