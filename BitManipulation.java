public class BitManipulation {
         // Q1-Check if a Number is Even or Odd
    public static void oddOrEven(int n){
    int bitMask= 1;
    if((n & bitMask)==0){
    //Even Number
    System.out.println("Even Number");
    }
    //Odd Number
    else{
    System.out.println("Odd Number");
    }
    }
    //  OPERATIONS
     // 1-GET ITH BIT
    public static int getIthBit(int n,int i){
    int bitMask=1<<i;
    if ((n & bitMask)== 0) {
    return 0;
    }
    else{
    return 1;
    }
    }
     // 2-SET ITH BIT
    public static int setIthBit(int n,int i){
    int bitMask=1<<i;
    return n| bitMask;
    }
     // 3-CLEAR ITH BIT
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        ////Binary AND  Bitwise OPERATOR
        // System.out.println(5 & 6);
        //  ////Binary OR  Bitwise OPERATOR
        // System.out.println(5 | 6);
          ////Binary XOR  Bitwise OPERATOR
        // System.out.println(5 ^ 6);
        ////Binary one's complement
    // System.out.println(~5);
    //     System.out.println( (~0) );
    ////Binary left shift
        // System.out.println(5 << 2);
         ////Binary Right shift
        // System.out.println(6>>1);
        // // Q1-Check if a Number is Even or Odd
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);
 //// Set ith bit
        // int result =getIthBit(12, 2);
        // System.out.println("Ith bit is:" + result);
        //  // set ith bit
        // int result =setIthBit(10, 2);
        // System.out.println("Ith bit is:" + result);
        // // clear ith bit
// int result =clearIthBit(10, 1);
//          System.out.println("Ith bit is:" + result);
    }
}
