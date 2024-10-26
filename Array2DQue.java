public class Array2DQue {
    // Question 1 :Print the number of 7’s that are inthe 2d array.
    // Example :Input - int[][] array = { {4,7,8},{8,8,7} };
    // Output - 2
    public static void search(int array[][]) {
        int countOf7 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println("count of 7 is : " + countOf7);
    }

    // Question 2 :Print out the sum of the numbers inthe second row of the “nums”
    // array.
    // Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    // Output - 18
    public static int sumOfSecondRowsnumbers(int nums[][]) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i] == nums[1]) {
                    sum = sum + nums[i][j];
                }
            }
        }
        return sum;
    }
    
    //  // Another method
    public static int sumOfSecondRowsnumbers(int nums[][]) {
        int sum = 0;

        for (int j = 0; j < nums[0].length; j++) {
            sum = sum + nums[1][j];
        }

        return sum;
    }

    // Question 3 :Write a program to FindTransposeofa Matrix.
    // What is Transpose?Transpose of a matrix is the process ofswapping therows to
    // columns. For a 2x3 matrix
public static void transpose(int arr[][]) {
  
    for (int i = 0; i < arr[0].length; i++) {  
        for (int j = 0; j < arr.length; j++) {  
            int transposeMatrix = arr[j][i];   
            System.out.print(transposeMatrix + " ");
        }
        System.out.println(); 
    
   
}

    public static void main(String[] args) {
        // Q1
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        search(array);
        // Q2
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int result = sumOfSecondRowsnumbers(nums);
        System.out.println("Sum of all numbers of 2nd row is:" + result);
        // Q3
        int[][] arr = { { 11, 12, 13 }, { 14, 15, 16 } };
        transpose(arr);
    }
}
