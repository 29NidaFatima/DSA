public class RecursionPracticeQue {
    // public static void indicesOfNum(int arr[], int key, int i) {
    //     //Base Case
    //     if (i == arr.length) {
    //         return;
    //     }
    //     if (arr[i] == key) {
    //         System.out.print(i + " ");
    //     }
    //     indicesOfNum(arr, key, i + 1);
    // }
    static String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
public static void printDigits(int number){
    if (number==0) {
        return;
    }
    int lastDigit=number%10;
    printDigits(number/10);
    System.out.println(words[lastDigit]+" ");
}
    public static void main(String[] args) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // indicesOfNum(arr, key, 0);
        printDigits(1234);

    }
}
