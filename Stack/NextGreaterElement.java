
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
//  // Brute Force Approach
    // public static int[] nextElement(int arr[]) {
    //     int n = arr.length;
    //     int next[] = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         next[i] = -1; 
    //         // Start from i+1 to find next greater element
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[i] < arr[j]) {
    //                 next[i] = arr[j];
    //                 break; // Found first greater element
    //             }
    //         }
    //     }
    //     return next;
    // }
    //optimized approach
    public static int[] nextElement(int[] arr) {
        int n = arr.length;
        int[] next = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            //step1

            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //step2
            if (s.empty()) {
                next[i] = -1;
            } 
            else {
                next[i] = arr[s.peek()];
            }
            //step3
            s.push(i);
        }
        return next;
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int result[] = nextElement(arr);

        System.out.println("Input array: " + Arrays.toString(arr));
        System.out.println("Next greater elements: " + Arrays.toString(result));
    }
}
