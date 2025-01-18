package Recursion;
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
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // print factorial of a number TC:0(n)
    public static int fact(int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        // int fnm1 = fact(n - 1);
        // int fn = n * fact(n - 1);
        // return fn;
        // ---------------
        return n * fact(n - 1);
    }

    // print sum of the first n natural number TC:0(n)
    public static int naturalNumSum(int n) {
    // Base Case
    if (n == 1) {
    return 1;
    }
   return  n + naturalNumSum(n - 1);

    // Print Nth fibonacci number
    public static int fibonacciNum(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibonacciNum(n - 1);
        int fnm2 = fibonacciNum(n - 2);
        int fn = fnm1 + fnm2;
        return fn;

    }
    // check if a given array is sorted or not

    public static boolean isSorted(int arr[], int i) {
        // Base case
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // write a function to find the first occurence of an element in an array
    public static int firstOccurence(int arr[], int key, int i) {
        // Base case
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // write a function to find the last occurence of an element in an array
    public static int lastOccurence(int arr[], int key, int i) {
        // Base case
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound != -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // Print x pow(n) in O(n)
    public static int power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // Print x pow(n) in O(logn)
    public static int optimizedPower(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        // if n is even
        int halfPowersq = halfPower * halfPower;
        // if n is odd
        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    }

    public static void main(String[] args) {
        // Print numbers from n to 1(Decreasing Order)
        int n = 10;
        printDec(n);
        // Print numbers from n to 1(Increasing Order)
        int n = 10;
        printInc(n);
        // print factorial of a number
        int n = 5;
        System.out.println(fact(n));
        // print sum of the first n natural number
        System.out.println(naturalNumSum(5));
        // Print Nth fibonacci number
        System.out.println(fibonacciNum(7));
        Check if a given array is sorted or not
        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
        // write a function to find the first occurence of an element in an array
        int arr[]={8,3,6,9,5,10,2,5,3};

        System.out.println(firstOccurence(arr, 5, 0));
        // write a function to find the last occurence of an element in an array
        System.out.println(lastOccurence(arr, 5, 0));
        //Print x pow(n)
        System.out.println(power(2, 10));
        // Print x pow(n) in O(logn)
        System.out.println(optimizedPower(2, 10));

    }
}
