
public class InsertionSort {
    public static void insertionSort(int arr []){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1; 
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }


    }

    public static void printArr(int arr []){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
public static void main(String[] args) {
    int arr []={3,6,2,7,9,1,8};
    System.out.print("Original Array is :" );
printArr(arr);
    System.out.print("Sorted array is :");
insertionSort(arr);
printArr(arr);
}
}
