import java.util.Scanner;

public class Function {

  // Binary to decimal conversion
  public static void binToDec(int binNum) {
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while (binNum > 0) {
      int lastDigit = binNum % 10;
      ;
      decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
      pow++;
      binNum = binNum / 10;

    }
    System.out.println("decimal of " + myNum + " = " + decNum);
  }

  // Decimal to Binary conversion
  public static void decToBin(int decNum) {
    int myNum = decNum;
    int binNum = 0;
    int pow = 0;
    while (decNum > 0) {
      int remainder = decNum % 2;
      binNum = binNum + remainder * (int) Math.pow(10, pow);
      pow++;
      decNum = decNum / 2;

    }
    System.out.println("Binary form of " + myNum + " is " + binNum);
  }

  // to check a number is prime or not
  public static boolean isPrime(int n) {
    // corner case for 2
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) { // condition for number is not prime
        return false;

      }
    }
    return true;
  }

  // print all prime number in a range
  public static void primeIsRange(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i) == true) { // true
        System.out.println(i + " ");
      }

    }
    System.out.println();
  }

  // function overloading using different no.of parameters
  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  // function overloading using different parameters
  // fn to calculate int sum
  public static int sum(int a, int b) {
    return a + b;
  }

  // fn to calculate float sum
  public static float sum(float a, float b) {
    return a + b;
  }

  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }

    return f;
  }

  public static int binCoeff(int n, int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n - r);
    int binomialcoefficient = fact_n / (fact_r * fact_nmr);
    return binomialcoefficient;
  }

  // Find Product of x and y
  public static int multiply(int x, int y) {
    int product = x * y;
    return product;
  }

  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a=" + a);
    System.out.println("b=" + b);
  }

  // Fn with parameters
  public static int calculateSum(int a, int b) { // parameters/formal parameters
    int sum = a + b;
    return sum;
  }

  public static void printHelloWorld() {
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
  }

  public static void main(String[] args) {
    // Scope
    System.out.println(s); // gives error bcz you cannot use variable before declaring it
    int s = 45;
    System.out.println(s);
    {
      int r = 46; // block scope
      System.out.println(r);
    }
    System.out.println(r); // error
    decToBin(7);
    primeIsRange(20);
    System.out.println(sum(5, 7));
    System.out.println(sum(2.3f, 4.5f));
    // Binomial Coefficient
    System.out.println(binCoeff(6, 2));
    // Factorial of a number,n
    System.out.println(factorial(4));
    // Find Product of x and y
    int result = multiply(3, 8);
    System.out.println(result);
    // Swap-values exhange
    int a = 5;
    int b = 10;
    // swap
    swap(a, b);
    System.out.println("a=" + a);
    System.out.println("b=" + b);

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculateSum(a, b); // arguments/actual parameters
    System.out.println("Sum is : " + sum);
    printHelloWorld(); // function call
  }
}