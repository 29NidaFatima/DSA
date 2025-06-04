import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSumTwo(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1; // Breakpoint 

        // Find the index where the rotation happens (i.e., breakpoint)
        for (int i = 0; i < n - 1; i++) { // ✅ Avoid out-of-bounds
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int left = bp + 1;
        int right = bp;         

        // Use two-pointer technique in circular manner
        while (left != right) { 
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11,15,6,8,9,10  --- Sorted and Rotated Array
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        boolean result = pairSumTwo(list, target); 
        System.out.println("Pair with sum " + target + " exists: " + result);
    }
}
