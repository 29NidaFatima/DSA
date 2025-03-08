
import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        int year;
        System.out.println("Enter your year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
