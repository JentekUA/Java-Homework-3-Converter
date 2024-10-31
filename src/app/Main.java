package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0.");

        double fahrenheit = 5;
        double celsius = 12;
        double convertedCelsius = convFahrenheitToCelsius(fahrenheit);
        double convertedFahrenheit = convCelsiusFahrenheit(celsius);

        System.out.println("Result is " + convertedCelsius + " Celsius and " + convertedFahrenheit + " Fahrenheit.");
    }

    private static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double convCelsiusFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}