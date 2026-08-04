public class ConversorTemperatura {
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        
        double tempC = 30.0;
        System.out.println(tempC + "°C em Fahrenheit é: " + conversor.celsiusParaFahrenheit(tempC));
        
        double tempF = 86.0;
        System.out.println(tempF + "°F em Celsius é: " + conversor.fahrenheitParaCelsius(tempF));
    }
}