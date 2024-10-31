package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0.");

        double fahrenheit = 5;
        double convertedCelsius = convFahrenheitToCelsius(fahrenheit);

        System.out.println("Result is " + convertedCelsius + " Celsius.");
    }

    private static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}