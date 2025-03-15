public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i; // Assume the current position is the minimum

            // Find the index of the minimum element in the unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j; // Update the index of the minimum element
                }
            }

            // Swap the minimum element with the first unsorted element
            if (minPos != i) {
                int temp = arr[i]; // Use arr[i], not arr[0]
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print arr[i], not arr[0]
        }
        System.out.println(); // Move to the next line after printing the array
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        System.out.println("Original array:");
        printArr(arr);

        selectionSort(arr); // Sort the array

        System.out.println("Sorted array:");
        printArr(arr);
    }
}