public class Recursion {
            // Print numbers from n to 1(Decreasing Order)
    public static void printDec(int n) {
        // Base Case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }
            // Print numbers from n to 1(Increasing Order)
    public static void printInc(int n) {
         // Base Case
         if (n == 1) {
            System.out.print(n+" ");
            return;
        }
         printInc(n-1);
         System.out.print(n + " ");
    }
      
       


    public static void main(String[] args) {
        // Print numbers from n to 1(Decreasing Order)
        int n = 10;
        printDec(n);
        // Print numbers from n to 1(Increasing Order)
            int n = 10;
            printInc(n);
    }
}
