// import java.util.Arrays;

public class BasicSorting {
    // public static void bubbleSort(int arr[]) {
    // for (int turn = 0; turn <= arr.length - 1; turn++) {
    // for (int j = 0; j < arr.length - 1 - turn; j++) {
    // if (arr[j] > arr[j + 1]) {
    // // swap
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }  
    // }
    // }
    // }

    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }
 
    // public static void selectionSort(int arr[]) {
    // for (int i= 0; i < arr.length - 1; i++) {
    // int minPos =i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[minPos] > arr[j]) {
    // minPos = j;
    // }
    // }
    // // Swap
    // int temp = arr[minPos];
    // arr[minPos] = arr[i];
    // arr[i] = temp;
    // }
    // }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    // public static void insertionSort(int arr[]) {
    // for (int i = 1; i < arr.length; i++) {
    // int curr = arr[i];
    // int pre = i - 1;
    // while (pre >= 0 && arr[pre] > curr) {
    // arr[pre + 1] = arr[pre];
    // pre--;
    // }
    // arr[pre + 1] = curr;
    // }
    // }
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            int j = 0;
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(Strings[] args) {
        int arr[] = { 1, 3, 2, 4, 3, 7, 4, 1, 3, 2 };
        // bubbleSort(arr);
        // selectionSort(arr);
        printArr(arr);
        // insertionSort(arr);
        countingSort(arr);
    }
}
