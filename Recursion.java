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
        // print factorial of a number
        public static int fact(int n){
            if (n==0) {
                return 1;
            }
            int fnm1= fact(n-1);
            int fn=n*fact(n-1);
            return fn;
        }
    
       


    public static void main(String[] args) {
        // Print numbers from n to 1(Decreasing Order)
        int n = 10;
        printDec(n);
        // Print numbers from n to 1(Increasing Order)
            int n = 10;
            printInc(n);
            // print factorial of a number
            int n=5;
         System.out.println(fact(n));
    }
}
