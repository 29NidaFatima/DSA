
public class MergeSortStrings {

    // Print method for a String array
    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesortString(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        // Recursively sorting both halves
        mergesortString(arr, si, mid);
        mergesortString(arr, mid + 1, ei);

        // Merging the sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        // Merging both halves
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) { // Fixed for stable sorting
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergesortString(arr, 0, arr.length - 1);
        
        // Print the sorted array
        printArr(arr);
    }
}
