class WeatherForecast {
    String day;
    double temperature;
    String condition;

    public WeatherForecast(String day, double temperature, String condition) {
        this.day = day;
        this.temperature = temperature;
        this.condition = condition;
    }

    public void printForecast() {
        System.out.println(day + ": " + temperature + "°C, " + condition);
    }
}

public class ForecastProgram {
    public static void main(String[] args) {
        WeatherForecast[] forecast = {
                new WeatherForecast("Monday", 28.5, "Sunny"),
                new WeatherForecast("Tuesday", 25.0, "Rainy"),
                new WeatherForecast("Wednesday", 26.5, "Cloudy")
        };

        System.out.println("Weather Forecast:");
        for (WeatherForecast wf : forecast) {
            wf.printForecast();
        }
    }
}
