public class SumOfArrayElements {
    public static int sum(int arr[]) {
        if (arr == null) {
            return 0; 
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 8, 3, 4};
        int result = sum(arr); 
        System.out.println("The sum of the array elements is: " + result); 
    }
}
//-------------Another way to write same code ------
public class SumOfArrayElements {
    public static int sum(int arr[]) {
        if (arr == null) {
            return 0; // Handle null input
        }
        int sum = 0;
        for (int num : arr) {
            sum += num; // Use enhanced for loop and += operator
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 8, 3, 4};
        int result = sum(arr);
        System.out.println("The sum of the array elements is: " + result);
    }
}
