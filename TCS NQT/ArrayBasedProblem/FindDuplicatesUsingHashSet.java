
import java.util.HashSet;

// public class FindDuplicatesUsingHashSet {

//     public static void findDuplicatesInArray(int arr[]) {
//         Arrays.sort(arr);
//         HashSet<Integer> set = new HashSet<>();
//         boolean hasDuplicates = false;
//     System.out.println("Duplicate Element found: ");
//         for (int num : arr) {
//             // If the element is already in the set, it's a duplicate
//             if (set.add(num) == false) {
//                 System.out.print(num + " ");
//                 hasDuplicates = true;
//             }
//         }

//         // Check if duplicates were found
//         if (hasDuplicates == false) {
//             System.out.println("Duplicate Elements not found");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
//         findDuplicatesInArray(arr);
//     }
// }


public class FindDuplicatesUsingHashSet {
    public static void findDuplicatesInArray(String[] str) {  // Change parameter type to String[]
        HashSet<String> set = new HashSet<>();
        HashSet<String> printedDuplicates = new HashSet<>(); // To track already printed duplicates
        boolean hasDuplicates = false;

        System.out.print("Duplicate Element found: ");
        for (String a : str) {
            if (set.add(a) == false && printedDuplicates.add(a)) {  
                System.out.print(a + " ");
                hasDuplicates = true;
            }
           
        }

        if (hasDuplicates == false) { 
            System.out.println("No Duplicates found");
        }
    }

    public static void main(String[] args) {
        String[] str = {"java", "C++", "java", "python", "c", "js", "c", "java", "js"};  // Corrected syntax
        findDuplicatesInArray(str);
    }
}
