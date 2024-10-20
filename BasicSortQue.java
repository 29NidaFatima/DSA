public class BasicSortQue {
    // BASIC SORTING QUESTIONS
    // Question :Use the following sorting algorithms tosort an array in DESCENDING
    // order

    Sort:You can use this
    array as
    an example:[3,6,2,1,8,7,4,5,3,1]
    a.Bubble Sort
    b.Selection Sort
    c.Insertion Sort
    d.Counting SortYou

    // ----------------------------
    // a.Bubble Sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - turn - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // b.Selection Sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // c.Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1; // Here j is previous of i
            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    // }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // a.Bubble Sort
        bubbleSort(arr);
        printArr(arr);
        // b.Selection Sort
        selectionSort(arr);
        printArr(arr);

        // c.Insertion Sort
        insertionSort(arr);
        printArr(arr);
        // d.Counting SortYou
    }
}
