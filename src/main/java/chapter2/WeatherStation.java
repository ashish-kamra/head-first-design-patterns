package chapter2;

public class WeatherStation {
    public static void main(String[] args) {
        //Observer Pattern
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 60, 30.4f);
        weatherData.setMeasurements(82, 80, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
