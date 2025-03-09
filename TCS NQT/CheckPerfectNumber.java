
// -----------BRUTE FORCE APPROACH------------
import java.util.Scanner;

public class CheckPerfectNumber {
    public static boolean isPerfect(int n) {
        if (n <= 1) {
            return false; // Perfect numbers are greater than 1
        }

        int sum = 1; // Start with 1 because it's a proper divisor for all numbers
        for (int i = 2; i < n; i++) { // Loop from 2 to n-1
            if (n % i == 0) {
                sum += i; // Add the divisor
            }
        }
        return sum == n; // Check if the sum of divisors equals the number
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // Input number
        if (isPerfect(n)) {
            System.out.println("perfect number");
        } else {
            System.out.println(" Not a perfect number");
        }
    }
}
//----------------OPTIMIZED CODE---------------------------


public class CheckPerfectNumber {
    public static boolean isPerfect(int n) {
        if (n <= 1) {
            return false; // Perfect numbers are greater than 1
        }

        int sum = 1; // Start with 1 because it's a proper divisor for all numbers
        for (int i = 2; i * i <= n; i++) { // Loop up to the square root of n
            if (n % i == 0) {
                sum += i; // Add the divisor
                if (i != n / i) { // Avoid adding the same divisor twice for perfect squares
                    sum += n / i; // Add the complementary divisor
                }
            }
        }
        return sum == n; // Check if the sum of divisors equals the number
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // Input number
        if (isPerfect(n)) {
            System.out.println("perfect number");
        } else {
            System.out.println(" Not a perfect number");
        }
    }
}
