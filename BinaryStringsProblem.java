public class BinaryStringsProblem {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Add '0' to the string and recursively call
        printBinStrings(n - 1, 0, str + "0");

        // If the last place was 0, add '1' to the string and recursively call
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
 
        printBinStrings(3, 0, "");
    }
}
