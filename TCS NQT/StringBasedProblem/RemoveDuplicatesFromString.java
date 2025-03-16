import java.util.HashSet;

public class RemoveDuplicatesFromString {
    static String removeDuplicates(String str) { // Made method static
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (set.add(c)) { // add() returns true if the element was not already in the set
                result.append(c);
            }
        }

        return result.toString(); // Convert StringBuilder to String
    }

    public static void main(String[] args) {
        String str = "HaPpyNewYear";
        System.out.println(removeDuplicates(str)); // Now we can call it directly
    }
}
