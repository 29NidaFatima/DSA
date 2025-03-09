
public class CheckArmstrongNumber {

    public static boolean isArmstrong(int n) { // Return type changed to boolean
        String str = String.valueOf(n);  // Number gets converted into String
        int total_Digits = str.length();
        int sum = 0, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, total_Digits); // Use Math.pow()
            temp = temp / 10;
        }

        return sum == n; // Return statement inside method
    } 

    public static void main(String[] args) {
        int n = 153;
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
