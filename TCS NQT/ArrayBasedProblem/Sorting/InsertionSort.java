
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Use binary search to find the correct position for `key`
            int pos = binarySearch(arr, key, 0, j);

            // Shift elements to the right to make space for `key`
            while (j >= pos) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert `key` at the correct position
            arr[j + 1] = key;
        }
    }

    // Binary search to find the correct position for insertion
    private static int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid; // Key found at mid
            } else if (arr[mid] < key) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return low; // Position where the key should be inserted
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original array:");
        printArray(arr);

        insertionSort(arr); // Sort the array

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
