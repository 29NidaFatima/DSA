import java.util.Arrays;

public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        Arrays.sort(arr); // Sort the array
        boolean hasDuplicates = false;

        System.out.print("Duplicate elements: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
                hasDuplicates = true;
            }
        }

        // Check if duplicates were found
        if (hasDuplicates == false) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        findDuplicates(arr); // Output: Duplicate elements: 1 2 3
    }
}