
// import java.util.*;
import java.util.Scanner;

public class Array2D {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    System.out.println("FOUND AT CELL (" + i + " ," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    // finding largest no.from the matrix
    public static boolean searchLargest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println("Largest value: " + largest);
        return true;
    }

    // finding smallest no.from the matrix
    public static boolean searchSmallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest value: " + smallest);
        return true;
    }

    // --------SPIRAL MATRIX---------
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            // TOP
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // RIGHT
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }
            // BOTTOM
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // LEFT
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        System.out.println();
    }

    // ---------------DIAGONAL SUM------------
    // (Brute Force Approach)
    public static int diagonalSum(int matrix[][]) {
        int sum = 0; 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Primary Diagonal
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
                // Secondary Diagonal
                else if (i + j == matrix.length - 1) {
                    sum = sum + matrix[i][j];
                }
            }

        }
        return sum;
    }

    // ---------optimized way---------
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Add primary diagonal element
            sum += matrix[i][i];

            // Add secondary diagonal element, but avoid double-counting the middle element
            // in odd-sized matrices
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    //  --SEARCH IN SORTED MATRIX-----
    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found Key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not Found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length; // rows
        int m = matrix[0].length; // columns

        Scanner sc = new Scanner(System.in);
        // Taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // For output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 6);
        searchLargest(matrix);
        searchSmallest(matrix);
        // --------SPIRAL MATRIX---------
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printSpiral(matrix);

        // ---------------DIAGONAL SUM------------
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int sum = diagonalSum(matrix);
        System.out.println("Sum of primary and secondary diagonal:" + sum);
        // ----SEARCH IN SORTED MATRIX-----

        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int key = 9;
        stairCaseSearch(matrix, key);
    }
}
