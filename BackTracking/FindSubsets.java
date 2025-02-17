public class FindSubsets {
    public static void findSubsets(String str, String ans, int i) {
        // Base case: When we reach the end of the string, print the subset
   if (ans.length()==0) {
    System.out.println("null");
   } else {
    System.out.println(ans);
   }
        // Choice 1: Include the current character
        findSubsets(str, ans + str.charAt(i), i + 1);
        // Choice 2: Exclude the current character
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}