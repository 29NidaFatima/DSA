public class GridWays {

    public static int countGridWays(int i, int j, int n, int m) {
        // If we are at the last cell
        if (i == n - 1 && j == m - 1) {     
            return 1;
        } 
        // Boundary cross condition
        if (i >= n || j >= m) { 
            return 0;
        }

        // Move down
        int w1 = countGridWays(i + 1, j, n, m);
        // Move right
        int w2 = countGridWays(i, j + 1, n, m);

        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countGridWays(0, 0, n, m));
    }
}
