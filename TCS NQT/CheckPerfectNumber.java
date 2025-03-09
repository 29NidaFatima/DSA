//--------BRUTE FORCE APPROACH-----------
import java.util.Scanner;

public class "CheckPerfectNumber" {
    public static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 1; i*1< n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                  if (i != n / i){
                    sum += n / i; // Add the pair divisor
                  } 
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (isPerfect(n)) {
            System.out.println("perfect number");
        } else {
            System.out.println(" Not a perfect number");
        }

    }
}