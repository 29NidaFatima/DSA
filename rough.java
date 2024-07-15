public class rough {
        public static int factorial(int n) {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            return f;
        }
    
        public static int binCoefficient(int n, int k) {
            int fact_n = factorial(n);
            int fact_k = factorial(k);
            int fact_nk = factorial(n - k);
            int binCoefficient = fact_n / (fact_k * fact_nk);
            return binCoefficient;
        }
    
        public static void main(String[] args) {
           System.out.println(binCoefficient(5, 2));
        }
    }
     

