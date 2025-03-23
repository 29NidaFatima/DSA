
public class DecimalToBinary {

    public static String decToBin(int decimal) {
        if (decimal < 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int rem = decimal % 2;
            binary.insert(0, rem);
            decimal = decimal / 2;

        }

        return binary.toString();
    }

    public static void main(String[] args) {
int decimal=9;
             String binary = decToBin(decimal);
        System.out.println("The binary of " + decimal + "  is: " + binary);
          
    
}
}
