public class BinaryToDecimal {
    public static int binToDec(String binary) {
        int dec = 0;
        int length = binary.length();

        // Traverse the binary string from left to right
        for (int i = 0; i < length; i++) {
            char ch = binary.charAt(i);
            if (ch == '1') {
                dec = dec * 2 + 1; // Equivalent to dec = (dec << 1) | 1
            } else if (ch == '0') {
                dec = dec * 2; // Equivalent to dec = dec << 1
            } else {
                throw new IllegalArgumentException("Invalid binary number: " + binary);
            }
        }

        return dec;
    }

    public static void main(String[] args) {
        String binary = "0001"; // Binary number as a string
        int decimal = binToDec(binary);
        System.out.println("The decimal of " + binary + " is " + decimal);
    }
}