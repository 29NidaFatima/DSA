public class BitQues {
    // Question 3 :Add 1 to an integer using Bit Manipulation.(Hint: try using
    // Bitwise NOT Operator)
    public static int addOneToInteger(int n) {
        return -~n;
    }

    public static void main(String[] args) {
        // Question 1 :What is the value of x^x for any valueof x?
        int x=2;
        System.out.println(x^x);
        Question 2 :Swap two numbers without using any third variable
        //  1st Method(using + operator)
        int a=3;
        int b=4;
        //swap
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a=" +a);
        System.out.println("b=" +b);
  // 2nd Method(using ^ operator)
 
 int x=5;
int y=6;
  // swap
x=x^y;
y=x^y;
x=x^y;
System.out.println("x=" +x);
System.err.println("y=" +y);
        // Question 3 
        int result=addOneToInteger(8);
        System.out.println(result);
        // Question 4 :Convert uppercase characters to lowercase using bits.
        char uppercase = 'N';
        int bitMask = 32;
        char lowercase = (char)(uppercase | bitMask);
        System.out.println(lowercase); 
        // Convert lowercase letter to uppercase using bit
    char lowercase = 'p';
    int bitMask = ~32;
    char uppercase = (char)(lowercase & bitMask);
    System.out.println(uppercase);
    }

}
