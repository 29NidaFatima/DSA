public class FahrenheitToCelsius {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6; 
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f°F is equal to %.2f°C\n", fahrenheit, celsius);
    }
}
