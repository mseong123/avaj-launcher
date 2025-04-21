//singleton class

public class WeatherProvider {
    private final String[] weather;
    // have to use static in attribute below because when instantializing, no access to instance. Have to 
    // put instance somewhere. 
    private static final WeatherProvider instance;
    private WeatherProvider() {
        weather = {"RAIN", "FOG", "SUN", "SNOW"};
    }
    public static WeatherProvider getInstance() {
        if (instance == null) {
            instance = new WeatherProvider();
        }
        else {
            return instance;
        }
    }
    public String getCurrentWeather(Coordinates p_coordinates)
}