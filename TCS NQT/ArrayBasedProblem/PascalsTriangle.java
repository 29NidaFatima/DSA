public class PascalsTriangle {

    public  static void pascalTriangle(int n){
        for (int row = 1; row <= n; row++) {
            int number = 1; // First element of each row is always 1
            // Add spacing for alignment
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            // Print the row
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number = number * (row - col) / col; // Calculate the next number
            }
            System.out.println();
   
    }
    }
    public static void main(String[] args) {
       
            int n = 5; // Number of rows
            pascalTriangle(n);
           
    }
}
