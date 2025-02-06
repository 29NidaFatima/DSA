public class CountInversion {
    public static int countInversion(int arr[], int si, int ei) {
        if (si >= ei) {
            return 0; // Base case: no inversions in a single element or empty array
        }
        int mid = si + (ei - si) / 2;

        int leftCount = countInversion(arr, si, mid); // Count inversions in the left half
        int rightCount = countInversion(arr, mid + 1, ei); // Count inversions in the right half
        int mergeCount = merge(arr, si, mid, ei); // Count inversions during merge

        return leftCount + rightCount + mergeCount; // Return total inversion count
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int inversionCount = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversionCount += (mid - i + 1); // Count inversions
            }
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back to the original array
        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        return inversionCount; // Return the inversion count for this merge
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 5, 2, 7}; // Fixed array initialization
        int inversionCount = countInversion(arr, 0, arr.length - 1);
        System.out.println("Total inversions: " + inversionCount); // Print the total inversion count
    }
}