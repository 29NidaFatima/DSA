public class searchInRotatedArray {

    public static int search(int arr[], int target, int si, int ei) {
        // BASE CASE
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // CASE FOUND
        if (arr[mid] == target) {
            return mid;
        }

        // Mid on L1 (Left sorted part)
        if (arr[si] <= arr[mid]) {
            // Case A: Target in left sorted part
            if (target >= arr[si] && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // Case B: Target in right part
                return search(arr, target, mid + 1, ei);
            }
        } 
        // Mid on L2 (Right sorted part)
        else {
            // Case C: Target in right sorted part
            if (target >= arr[mid] && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // Case D: Target in left part
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // Expected output: 4
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
