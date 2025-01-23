
public class tillingproblem {
    public static int tillingProblem(int n) {
        //Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // int fnm1 = tillingProblem(n - 1);
        // int fnm2 = tillingProblem(n - 2);
        // int totalWays=fnm1 + fnm2;
        // return  totalWays;
                // // Another way to write above code in less no.of line
                return tillingProblem(n - 1)+tillingProblem(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
}
}
