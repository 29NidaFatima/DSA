public class bit {
    // Q1-Check if a Number is Even or Odd
    // public static void oddOrEven(int n){
    // int bitMask= 1;
    // if((n & bitMask)==0){
    // //Even Number
    // System.out.println("Even Number");
    // }
    // else{
    // System.out.println("Odd Number");
    // }
    // }
    // OPERATIONS
    // 1-GET ITH BIT
    // public static int getIthBit(int n,int i){
    // int bitMask=1<<i;
    // if ((n & bitMask)== 0) {
    // return 0;
    // }
    // else{
    // return 1;
    // }
    // }
    // 2-SET ITH BIT
    // public static int setIthBit(int n,int i){
    // int bitMask=1<<i;
    // return n| bitMask;
    // }
    // 3-CLEAR ITH BIT
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(i << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println( (~5) );
        // System.out.println( (~0) );
        // System.out.println(5 << 2);
        // System.out.println(6>>1);
        // ---------------------------------------------------------------------------
        // Q1-Check if a Number is Even or Odd

        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);
        // ---------------------------------------------------------------------------
        // int result =getIthBit(10, 2);
        // System.out.println("Ith bit is:" + result);
        // ---------------------------------------------------------------------------
        // int result =setIthBit(10, 2);
        // System.out.println("Ith bit is:" + result);
        // ---------------------------------------------------------------------------
int result =clearIthBit(10, 1);
         System.out.println("Ith bit is:" + result);
    }
}
