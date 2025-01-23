
import java.util.Arrays;
import java.util.Collections;

public class BasicSort {
    Bubble Sort

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Selection Sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // turns
            int minPos = i; // let's assume current element as minimum
            for (int j = i + 1; j < arr.length; j++) { // unsorted array
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    // InsertionSort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i - 1;
            // // finding out correct position
            while (pre >= 0 && arr[pre] > curr) {
                arr[pre + 1] = arr[pre];
                pre--;
            }
            // // Insertion  
            arr[pre + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    // Counting Sort
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // Bubble Sort
        bubbleSort(arr);
        printArr(arr);
        /// SelectionSort
        selectionSort(arr);
        printArr(arr);
        // InsertionSort
        insertionSort(arr);
        printArr(arr);

        // Inbuilt Sort
        Arrays.sort(arr);
        printArr(arr);
        // if you want to sort a part of array's then you can specify index but ending
        // index is exuluded
        Arrays.sort(arr, 0, 3);
        printArr(arr);
        // if you want to sort an array in descending order with given index
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArr(arr);
        // Counting Sort
        countingSort(arr);
        printArr(arr);
    }
}
