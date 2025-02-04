public class MajorityElements {
   // MOORE'S VOTING ALGORITHM
   public static int majorityElements(int[] nums) {
       int majority = nums[0];
       int votes = 1;
       
       for (int i = 1; i < nums.length; i++) {
           if (votes == 0) {
               majority = nums[i];
               votes = 1;
           } else if (nums[i] == majority) {
               votes++;
           } else {
               votes--;
           }
       }
       return majority;
   }

   public static void main(String[] args) {
       int[] nums = {2, 2, 1, 3, 1, 2, 2}; 
       System.out.println("Majority Element: " + majorityElements(nums));
   }
}
