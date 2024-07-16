public class PracticeQue {
    // FUNCTIONS QUESTIONS
    // Question 1 : Write a Java method to compute the average of three numbers
    public static int calculateAverage(int x,int y,int z){
    int average= (x+y+z)/3;
    return average;
    }
    // Question 2 : Write a method named isEven that accepts an int argument. The
    method
    // should return true if the argument is even, or false otherwise. Also write
    a program to test your
    // method.
    public static boolean isEven( int n){
    if (n%2==0) {
    return true;
    }
    return false;
    }
    Question 5 :
    Write a Java method to compute the sum of the digits in an integer
    public static int sumDigits(int n) {
    int sumOfDigits = 0;
    while(n > 0) {
    int lastDigit = n % 10;
    sumOfDigits += lastDigit;
    n /= 10;
    }
    return sumOfDigits;
    }

    // Question 3 : Write a Java program to check if a number is a palindrome in
    Java?
    public static boolean isPalindrome(int number) {
    int palindrome = number; // copied number into variable
    int reverse = 0;
    while (palindrome != 0) {
    int remainder = palindrome % 10;
    reverse = reverse * 10 + remainder;
    palindrome = palindrome / 10;
    }
    // if original and the reverse of number is equal means
    // number is palindrome in Java
    if (number == reverse) {
    return true;
    }
    return false;
    }
    public static void main(String[] args) {
        System.out.println( isPalindrome(121));
        System.out.println(sumDigits(123));
        System.out.println(isEven(5));
        System.out.println(calculateAverage(3, 3, 3));
        // -----------------------VARIABLES & DATA TYPES
        // QUESTIONS-------------------------------
        // Question 1 : In a program, input 3 numbers : A, B and C. You have to
        // output
        // // the average of
        // // these 3 numbers.
        // // (Hint : Average of N numbers is sum of those numbers divided by N
        // // sol
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the value of a");
        // int a= sc.nextInt();
        // System.out.println("Enter the value of b");
        // int b= sc.nextInt();
        // System.out.println("Enter the value of c");
        // int c= sc.nextInt();
        // int average= (a+b+c)/3;
        // System.out.println("Average is:" + average);

        // // Question 2: In a program, input the side of a square. You have to output
        // the
        // // area of the
        // // square.
        // // (Hint : area of a square is (side x side))
        // // sol
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the side length of the square: ");
        // int side = sc.nextInt();
        // int area= side*side;
        // System.out.println("Area of Square is:"+ area);

        // // Question 3: Enter cost of 3 items from the user (using float data type)- a
        // // pencil, a pen and
        // // an eraser. You have to output the total cost of the items back to the user
        // // their bill.
        // // (Add on : You can also try adding 18% gst tax to the items in the bill as
        // // advanced problem)
        // // sol
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the cost of pencil:");
        // int pencil = sc.nextInt();

        // System.out.println("Enter the cost of pen:");
        // int pen = sc.nextInt();

        // System.out.println("Enter the cost of eraser:");
        // int eraser = sc.nextInt();

        // int bill = pencil + pen + eraser;
        // System.out.println("Bill: " + bill);

        // double totalBillWithTax = bill + bill * 0.18;
        // System.out.println("Total bill with tax: " + totalBillWithTax);

        // // Question 4: What will be the type of result in the following Java code?
        // // sol
        // byte b=4;
        // char c='a';
        // short s= 512;
        // int i=1000;
        // float f= 3.14f;
        // double d= 99.9954;
        // double result=(f*b)+(i%c)-(d*s);
        // System.out.println(result);

        // int $=24;
        // // // Varible name can start with _,$,alphabet
        // System.out.println($);

        // // -----------------------OPERATORS
        // // QUESTIONS------------------------------------
        // // Question 1:What will be the output of the following programs
        // // (i)
        // int x = 2, y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.print(exp1 + ",");
        // System.out.println(exp2);

        // // (ii)
        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){
        // System.out.println("Hello");
        // }
        // if(z > y && z < x){
        // System.out.println("Java");
        // }
        // if((y+200) < x && (y+150) < z){
        // System.out.println("Hello Java");
        // }
        // // (iii)
        // int x, y, z
        // ;x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);
        // // (iv)
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        // System.out.println(exp);
        // // (v)
        // int x = 10, y = 5;
        // int exp1 = (y * (x / y + x / y));
        // int exp2 = (y * x / y + y * x / y);
        // System.out.println(exp1);
        // System.out.println(exp2);
        // // -------------------------CONDITIONAL STATEMENTS
        // // ---------QUESTIONS--------------
        // // Question1:Write a Java program to get a number from the user and print
        // // whether it is positive or negative

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number");
        // int number = sc.nextInt();
        // if (number >= 0) {
        // System.out.println("Positive");
        // } else {
        // System.out.println("Negative");
        // }
        // //
        // Question2:FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis
        // // above 100 and otherwise prints You don't have a fever.
        // double temp=103.5;
        // if (temp>=100) {
        // System.out.println("You have fever");
        // } else {
        // System.out.println(" You don't have a fever");
        // }
        // //
        // Question3:WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing
        // // switch case.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a weeknumber");
        // int weeknumber=sc.nextInt();
        // switch (weeknumber) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;

        // default:
        // System.out.println("Invalid");
        // break;
        // }
        // // Question 4 :What will be the value of x & y in thefollowing program:
        // // int a=63,b=36;
        // boolean x= (a<b)?true:false;
        // System.out.println(x);
        // int y= (a>b)?a:b;
        // System.out.println(y);
        // //
        // Question5:WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear
        // // is a leap year or not.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter year");
        // int year= sc.nextInt();
        // boolean x= (year%4) ==0;
        // boolean y= (year%100) !=0;
        // boolean z= ((year%100==0) && (year%400==0));
        // if(x&& (y||z)) {
        // System.out.println(year+" is a leap year");
        // }
        // else{
        // System.out.println(year+" is not a leapyear");
        // }
        // }
        // }
        // // -------------------------------LOOPS QUESTIONS-----------------------
        // // Question1:How many times 'Hello' is printed?
        // for(int i=0;i<5;i++) {
        // System.out.println("Hello");
        // i+=2;
        // }
        // // Question4:Write a program to print the multiplication table of a number
        // N,entered by theuser
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num");
        // int num= sc.nextInt();
        // for(int i=1; i<=10;i++){
        // System.out.println(i*num);
        // }
        // // Question 5 :What is wrong in the following program?
        // for(int i=0;i<=5;i++ )
        // {
        // System.out.println("i = "+i);
        // }
        // System.out.println("i after the loop = "+ i );//error in this line
        // // Question4
        // // Write a program to find the factorialof any number entered by the user.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num=sc.nextInt();
        // int fact=1;
        // for(int i=1; i<=num; i++){
        // fact=fact*i;

        // }
        // System.out.println("factorial is"+fact);
        // // Question2:Write a program that reads a set of integers,and then prints the
        // sum of the even and odd integers.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of integers you want to input:");
        // int num = sc.nextInt();
        // int m;
        // int sumEven = 0;
        // int sumOdd = 0;

        // for (int i = 1; i <= num; i++) {
        // System.out.println("Enter integer " + i + ":");
        // m = sc.nextInt();
        // if (m % 2 == 0) {
        // sumEven += m;
        // } else {
        // sumOdd += m;
        // }
        // }

        // System.err.println("Sum of all even integers is: " + sumEven);
        // System.err.println("Sum of all odd integers is: " + sumOdd);
    }
}
