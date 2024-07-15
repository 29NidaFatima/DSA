// import java.util.*;

public class Function {
    // public static void printHelloWorld() {
    // System.out.println("Hello World");

    // return;
    // }

    // public static int calculateSum(int num1, int num2) {
    // int sum = num1 + num2;
    // return sum;
    // }

    // public static void swap(int x, int y) {
    // // Swap
    // int temp = x;
    // x = y;
    // y = temp;
    // System.out.println(x);
    // System.out.println(y);
    // }
    public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n; i++){
    f=f*i;
    }
    return f;
    }
    public static int binCoefficient(int n,int r) {

    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);
    int binCoefficient=fact_n/(fact_r*fact_nmr);
    return binCoefficient;
}

    // -------------FUNCTION OVERLOADING(Same Function but different
    // parameters{type,no.})-------------------
    // 1-using numbers
    // function to calculate sum of 2 num
    // public static int sum(int a, int b) {
    // return a + b;
    // }
    // function to calculate sum of 3 num

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }
    // 2-using datatypes
    // function to calculate sum of 2 integers value
    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // // function to calculate sum of 2 float value
    // public static float sum(float a, float b) {
    // return a + b;
    // }
    // public static boolean isPrime(int n) {
    // boolean isPrime = true;
    // for (int i = 2; i <= n-i; i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // return isPrime;
    // }
    // optimized method
    // public static boolean isPrime(int n) {
    // for(int i=2; i<=Math.sqrt(n);i++){
    // if(n%i==0){
    // return false;
    // }
    // }
    // return true;
    // }
    // Print all Primes in a range
    // public static void primeInRange(int n) {
    // for(int i=2; i<=n; i++){
    // if(isPrime(i)){
    // System.out.println(i+ " ");
    // }
    // }
    // System.out.println();
    // // }
    // public static void binToDec(int binNum) {
    // int myNum = binNum;
    // int pow = 0;
    // int decNum = 0;
    // while (binNum > 0) {
    // int lastDigit = binNum % 10;

    // decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
    // pow++;
    // binNum = binNum / 10;
    // }
    // System.out.println("decimal of" + myNum + " =" + decNum);
    // }
    // public static void decToBin(int n) {
    // int myNum = n;
    // int pow = 0;
    // int binNum = 0;
    // while (n > 0) {
    // int rem = n % 2;
    // binNum = binNum + (rem * (int) Math.pow(10, pow));
    // pow++;
    // n = n / 2;
    // }
    // System.out.println("binary form of " + myNum + " =" + binNum);
    // }
    // -----PRACTICE QUESTION------
    // Question 1 : Write a Java method to compute the average of three numbers
    // public static double average(double x, double y, double z) {
    // return (x + y + z) / 3;
    // }
    // Question 2 : Write a method named isEven that accepts an int argument. The
    // method
    // should return true if the argument is even, or false otherwise. Also write a
    // program to test your method.

    // public static boolean isEven(int n){

    // if(n%2==0){
    // return true;
    // }
    // else{
    // return false;
    // }
    // Question 3 : Write a Java program to check if a number is a palindrome in
    // Java? ( 121 is a
    // palindrome, 321 is not)
    // A number is called a palindrome if the number is equal to the reverse of a
    // number e.g., 121 is a
    // palindrome because the reverse of 121 is 121 itself. On the other hand, 321
    // is not a
    // palindrome because the reverse of 321 is 123, which is not equal to 321.
    // public static boolean isPalindrome(int n){
    // int palindrome=n;
    // int reverse=0;
    // while(palindrome!=0){
    // int remainder=palindrome % 10;
    // reverse=reverse*10+remainder;
    // palindrome=palindrome/10;
    // }
    // if(n==reverse){
    // return true;
    // }
    // return false;
    // }
    // Question 4 : Write a Java method to compute the sum of the digits in an
    // integer
    // public static int sumDigits(int n) {
    //     int sumofdigits = 0;
    //     while (n > 0) {
    //         int lastDigit = n % 10;
    //         sumofdigits = sumofdigits + lastDigit;
    //         n = n / 10;
    //     }
    //     return sumofdigits;
    // }

    public static void main(Strings[] args) {

        // printHelloWorld(); //function call

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum= calculateSum(a, b);
        // System.out.println("sum is: " + sum);

        // Swap-Exhange Value
        // int x = 5;
        // int y = 10;
        // swap(x, y);
        // System.out.println("a="+ x);
        // System.out.println("b="+ y);

        // Q1-Make a function to multipy two numbers and return their product
        // public class Functions{
        // public static int calculateProduct(int a,int b){
        // int product =a*b;
        // return product;
        // }

        // public static void main(String[]args){

        // int product=calculateProduct(3,4);
        // System.out.println(product);
        // }
        // }

        // System.out.println(factorial(7));

        System.out.println(binCoefficient(5, 2));

        // System.out.println(sum(5,2));
        // System.out.println(sum(5,2,5));
        // System.out.println(sum(4, 5));
        // System.out.println(sum(1.2f, 4.7f));

        // System.out.println(isPrime(8));
        // primeInRange(20);
        // }
        // binToDec(101);
        // decToBin(5);

        // -------------------------------------
        // System.out.println(average(4, 5, 6));
        // System.out.println(isEven(4));
        // System.out.println(isPalindrome());
        // System.out.println(sumDigits(123));
    }
}