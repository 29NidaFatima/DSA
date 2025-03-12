import java.util.Arrays;

public class RotateArrayKTimes {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        if (k == 0) return; // No need to rotate if k is 0

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
