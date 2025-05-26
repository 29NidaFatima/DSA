import java.util.ArrayList;

public class pairSumOne {
    // Brute force method to check if any two elements sum to target
    public static boolean pairSumOne(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }

        int target = 5;
        boolean result = pairSumOne(list, target);
        System.out.println("Pair with sum " + target + " exists: " + result);
    }
}
