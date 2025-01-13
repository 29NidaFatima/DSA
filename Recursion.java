public class Recursion {
    public static void printDec(int n) {
        // Base Case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        // Print numbers from n to 1(Decreasing Order)
        int n = 10;
        printDec(n);
    }
}
