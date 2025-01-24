public class FriendsPairingproblem {
    public static int friendsPairingProblem(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }
        // // for single
        // int singleWays = friendsPairingProblem(n - 1);
        // // for pair
        // int PairWays = (n - 1) * friendsPairingProblem(n - 2);
        // int totalWays = singleWays + PairWays;
        // return totalWays;
        // // Another way to write above code in less no.of line
        return  friendsPairingProblem(n - 1)+(n - 1) * friendsPairingProblem(n - 2);
    }
    
    
    public static void main(String[] args) {
        System.out.println(friendsPairingProblem(4));
    }
}
