// Using String
public class FindSubsets {
    public static void findSubsets(String str, String ans, int i) {
        // Base case: When we reach the end of the string
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null"); // If the subset is empty, print "null"
            } else {
                System.out.println(ans); // Otherwise, print the subset
            }
            return; // Return to stop further recursion
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


// Using StringBuilder:
public class FindSubsets {
    public static void findSubsets(String str, StringBuilder ans, int i) {
        // Base case: When we reach the end of the string
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null"); // If the subset is empty, print "null"
            } else {
                System.out.println(ans); // Otherwise, print the subset
            }
            return; // Return to stop further recursion
        }

        // Choice 1: Include the current character
        ans.append(str.charAt(i)); // Add the current character to the subset
        findSubsets(str, ans, i + 1);

        // Backtrack: Remove the last added character (exclude the current character)
        ans.deleteCharAt(ans.length() - 1);

        // Choice 2: Exclude the current character
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        StringBuilder ans = new StringBuilder(); // Create an empty StringBuilder for the subset
        findSubsets(str, ans, 0);
    }
}
