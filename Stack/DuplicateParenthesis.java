
import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean isDuplicate(String str2) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            //opening,operator,operands

            //closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate exist
                } else {
                    s.pop(); //opening pair pop
                }

            } else {
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String[] args) {

        String str1 = "((a+b))";
        String str2 = "(a-b)"; //false

        System.out.println(isDuplicate(str2));

    }
}
