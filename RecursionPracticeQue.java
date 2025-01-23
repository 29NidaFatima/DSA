public class RecursionPracticeQue {
//     // Q1
//     public static void indicesOfNum(int arr[], int key, int i) {
//         //Base Case
//         if (i == arr.length) {
//             return;
//         }
//         if (arr[i] == key) {
//             System.out.print(i + " ");
//         }
//         indicesOfNum(arr, key, i + 1);
//     }
//     // Q2
//     static String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
// public static void printDigits(int number){
//     if (number==0) {
//         return;
//     }
//     int lastDigit=number%10;
//     printDigits(number/10);
//     System.out.println(words[lastDigit]+" ");
// }
// // Q3
public static int getStringLength(String str) {
    // Base case: if the string is empty
    if (str.equals("")) {
        return 0;
    }
    // Recursive call: reduce the string by removing the first character
    return 1 + getStringLength(str.substring(1));
}
    public static void main(String[] args) {
        // // Q1
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // indicesOfNum(arr, key, 0);
        // // Q2
        // printDigits(4567);
        // // Q3
        String str = "Hello, World!";
        int length = getStringLength(str, 0); // Start with index 0
        System.out.println("The length of the string is: " + length);

    }
}
