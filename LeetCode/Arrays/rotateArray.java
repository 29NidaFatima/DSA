
public class rotateArray {

    public static void rotateArray(int nums[], int k) {
        int n = nums.length;
        if (k == 0 || n == 0) 
        return;
        
        k = k % n;   //k>n
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }

    public static void reverse(int nums[], int low, int high) {
        while (low<high) {
            int temp=nums[low];
            nums[low]= nums[high];
            nums[high]=temp;
            low++;
            high--;
            
        }
    }
    public static void printArr(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            System.out.print( nums[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
rotateArray(nums, k);
printArr(nums);
    }
}
