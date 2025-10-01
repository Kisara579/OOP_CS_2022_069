package LW_03.Q1;

public class Temperature {
    private double celsius;
    private double fahrenheit;

    public Temperature() {
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double  toCelsius() {
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public double toFahrenheit() {
        fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }







}
