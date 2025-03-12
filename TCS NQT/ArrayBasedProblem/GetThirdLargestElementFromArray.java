
public class GetThirdLargestElementFromArray {

    public static int getThirdlargest(int arr[], int total) {
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (arr[i] > arr[j]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[total - 3];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int total = arr.length;
        int result = getThirdlargest(arr, total);
        System.out.println("Third Largest element of Array is:" + result);

    }
}
// -------------OPTIMIZED CODE-----------


import java.util.Arrays;

public class GetThirdLargestElementFromArray {

    public static int getThirdLargest(int arr[]) {
        Arrays.sort(arr); // Sort in ascending order (O(n log n))
        return arr[arr.length - 3]; // Get the third largest
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Third Largest element: " + getThirdLargest(arr));
    }
}
