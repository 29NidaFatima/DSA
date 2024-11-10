public class BitManipulation {
    Q1-Check if
    a Number
    is Even
    or Odd

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // Even Number
            System.out.println("Even Number");
        }
        // Odd Number
        else {
            System.out.println("Odd Number");
        }
    }

    // OPERATIONS
    // 1-GET ITH BIT
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // 2-SET ITH BIT
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // 3-CLEAR ITH BIT
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update ith bit
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
        // 2nd approach to solve the same problem
        n = clearIthBit(0, 0);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    // Clear Last i bits
    public static int clearLastIbit(int n, int i) {
        int bitmask = ((-1) << i);
        return n & bitmask;
    }

    // Clear Range of bits
    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    // check if a number is power of 2
    public static boolean isPowerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    // Count set bits in a number
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // Fast exponentiation
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    // Modular exponentiation
    public static int modularExponentiation(int a, int b, int m) {
        int result = 1;
        a = a % m; // Update a if it is more than or equal to m

        while (b > 0) {
            // If b is odd, multiply result by current a
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            // Square a and reduce b by half
            a = (a * a) % m;
            b /= 2;
        }
        return result;
    }

    // Different method
    public static int modularExponentiation(int a, int b, int m) {
        int result = 1;
        while (b > 0) {
            // If b is odd, multiply result by current a
            if ((b & 1) == 1) {
                result = (result % m * a % m) % m;
            }
            // Square a and reduce b by half
            a = (a % m * a % m) % m;
            b = b >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        // Binary AND Bitwise OPERATOR
        System.out.println(5 & 6);
        //// Binary OR Bitwise OPERATOR
        System.out.println(5 | 6);
        // Binary XOR Bitwise OPERATOR
        System.out.println(5 ^ 6);
        // Binary one's complement
        System.out.println(~5);
        System.out.println((~0));
        // Binary left shift
        System.out.println(5 << 2);
        // Binary Right shift
        System.out.println(6 >> 1);
        // Q1-Check if a Number is Even or Odd
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
        // Set ith bit
        int result = getIthBit(12, 2);
        System.out.println("Ith bit is:" + result);
        // set ith bit
        int result = setIthBit(10, 2);
        System.out.println("Ith bit is:" + result);
        // clear ith bit
        int result = clearIthBit(10, 1);
        System.out.println("Ith bit is:" + result);
        // Update ith bit
        updateIthBit(10, 2, 1);
        // Clear Last i bits
        int result = clearLastIbit(15, 2);
        System.out.println(result);
        // Clear Range of bits
        System.out.println(clearBitsInRange(10, 2, 4));
        // check if a number is power of 2
        System.out.println(isPowerofTwo(4));
        System.out.println(countSetBits(10));
        // Fast exponentiation
        System.out.println(fastExpo(3, 5));
        // Modular exponentiation
        int a = 3;
        int b = 13;
        int m = 7;
        System.out.println("Result: " + modularExponentiation(a, b, m));
    }

}
