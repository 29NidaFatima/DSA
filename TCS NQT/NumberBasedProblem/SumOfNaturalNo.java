
public class SumOfNaturalNo {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println("Sum of 10 Natural numbers is:" + sum);
    }
}

//------------Optimized code----------
public class SumOfNaturalNo {

    public static int sum(int n) {
        return (n * (n + 1)) / 2; // O(1) Time Complexity
    }

    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println("Sum of 10 Natural numbers is: " + sum);
    }
}
