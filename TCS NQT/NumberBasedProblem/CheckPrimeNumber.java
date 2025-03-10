import java.util.Scanner;
public class CheckPrimeNumber {
    public static boolean isPrime(int number) {
        int count = 0; // Count the number of factors
        
        for (int i = 1; i <= number; i++) { // Start from 1 instead of 0 to avoid division by zero
            if (number % i == 0) {
                count++;
            }
        }

        return count == 2; // A prime number has exactly 2 factors (1 and itself)
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
    

        if (isPrime(number)) { // Call isPrime() instead of using count directly
            System.out.println("PRIME NUMBER");
        } else {
            System.out.println("NOT A PRIME NUMBER");
        }
    }
}
// //------------------ BruteForce-----------------
public static boolean isPrime(int number) {
    if (number < 2) return false; // 0 and 1 are not prime
    if (number == 2) return true; // 2 is prime

    // Check divisibility from 2 to number - 1
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            return false; // Found a divisor, not prime
        }
    }
    return true; // No divisors found, prime
}

//  -------------------Another Optimized Appraoch--------------------

public class  isPrime(int number){
    public static boolean isPrime(int number) {
        if (number < 2) return false; // 0 and 1 are not prime
        if (number == 2 || number == 3) return true; // 2 and 3 are prime numbers
        if (number % 2 == 0 || number % 3 == 0) return false; // Eliminate even numbers and multiples of 3

        // Check only up to √number, using 6k ± 1 optimization
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
      int number=29;

        if (isPrime(number)) {
            System.out.println("PRIME NUMBER");
        } else {
            System.out.println("NOT A PRIME NUMBER");
        }
    }
}
