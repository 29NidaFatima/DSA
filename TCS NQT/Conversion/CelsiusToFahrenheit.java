public class CelsiusToFahrenheit {
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 37.0; // Example input
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.printf("%.2f°C is equal to %.2f°F\n", celsius, fahrenheit);
    }
}