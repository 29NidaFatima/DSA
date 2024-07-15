import java.util.*;

public class Function {
    // function overloading using different no.of parameters
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
      // function overloading using different parameters
    //   fn to calculate int sum
      public static int sum(int a,int b){
        return a+b;
    }
    // fn to calculate float sum
    public static float sum(float a,float b){
        return a+b;
    }
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }
    public static int binCoeff(int n, int r){
int fact_n = factorial(n);
int fact_r = factorial(r);
int fact_nmr= factorial(n-r);
int binomialcoefficient= fact_n /(fact_r*fact_nmr);
return binomialcoefficient;
    }
    //Find Product of x and y
    public static int multiply(int x, int y){
    int product= x*y;
    return product;
    }

    public static void swap(int a,int b){
    int temp=a;
    a = b;
    b =temp;
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    }
    // Fn with parameters
    public static int calculateSum(int a, int b) { //parameters/formal parameters
    int sum = a + b;
    return sum;
    }

    public static void printHelloWorld(){
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 7));
       System.out.println(sum(2.3f,4.5f));
//Binomial Coefficient
System.out.println(binCoeff(6, 2));
        // Factorial of a number,n
   System.out.println(factorial(4));
        //Find Product of x and y
        int result=multiply(3, 8);
        System.out.println(result);
        //Swap-values exhange
        int a =5;
        int b=10;
        // swap
        swap(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=calculateSum(a, b); //arguments/actual parameters
        System.out.println("Sum is : " + sum);
        printHelloWorld(); //function call
    }
}