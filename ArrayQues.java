
public class ArrayQues {
    // //Question 1:Given an integer array nums, return true if any value appears at
    // least twice in the array, and return false if every element is
    // // --> 1st Method (brute force apparoach) which have time complexity O(square
    // of n) ,which is not optimized
    // // Method to check if there are duplicate elements in the array
    // public static boolean containsDuplicate(int[] nums) {
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // // -->2nd Method (sorting)which have time complexity O(log n),
    // // Optimized code
    // public static boolean containsDuplicate(int[] nums) {
    // Arrays.sort(nums);
    // for(int i=0;i<nums.length-1;i++){
    // if (nums[i]==nums[i+1]) {
    // return true;
    // }
    // }
    // return false;
    // }
//     // Question 2:There is an integer array nums sorted in ascending order (with
//     // distinct values).Prior to being passed to your function, nums is possibly
//     // rotated at an unknown pivot index k (1 <= k < nums.length) such that the
//     // resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1],
//     // ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at
//     // pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the
//     // possible rotation and an integer target, returnthe index oftarget if it is in
//     // nums, or -1 if it is not in nums.You must write an algorithm with O(log n)
//     // runtime complexity.
//     // Example 1:Input:nums = [4, 5, 6, 7, 0, 1, 2], target = 0 Output: 4
//     // Example 2:Input:nums = [4, 5, 6, 7, 0, 1, 2], target = 3 Output: -1
//     // Example 3:Input:nums = [1], target = 0Output: -1
//     public static int searchRotatedSortedArray(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length - 1;
        
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
            
         
//             if (nums[mid] == target) {
//                 return mid;
//             }
            
//             // Check if the left half is sorted
//             if (nums[start] <= nums[mid]) {
//                 // If target is in the sorted left half
//                 if (nums[start] <= target && target < nums[mid]) {
//                     end = mid - 1; // Move to the left half
//                 } else {
//                     start = mid + 1; // Move to the right half
//                 }
//             } 
//             // Else the right half must be sorted
//             else {
//                 // If target is in the sorted right half
//                 if (nums[mid] < target && target <= nums[end]) {
//                     start = mid + 1; // Move to the right half
//                 } else {
//                     end = mid - 1; // Move to the left half
//                 }
//             } 
//         }
        
//         // If the target is not found, return -1
//         return -1;
//     }
    
    public static void main(String[] args) {
//         // // Q1
//         // int[] nums = {1, 2, 3, 1};
//         // System.out.println(containsDuplicate(nums));
//         // // Q2
//         int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
//         int target = 0;
//       System.out.println(searchRotatedSortedArray(nums, target));
    }
}
