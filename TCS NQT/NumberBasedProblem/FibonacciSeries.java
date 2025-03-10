 public class FibonacciSeries {
    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i <= n; i++) {  // Fix syntax issue
            System.out.print(a + " ");  // Use print instead of println
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(); // Move to next line after printing series
    }

    public static void main(String[] args) {
        printFibonacciSeries(7); // Output: 0 1 1 2 3 5 8 13
    }
}


// If we have to find  any nth position of fibonacciseries
public class FibonacciSeries {
    public static int fibonacciSeries(int n) {  // Change void to int
        // BASE CASE
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive calls
        int fnm1 = fibonacciSeries(n - 1);
        int fnm2 = fibonacciSeries(n - 2);
        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciSeries(7)); // Output: 13
    }
}

