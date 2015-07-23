package com.jakubsprega.untestable.code.e;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author jakubsprega
 */
public class YahooWeatherHelper {

    public static final String WEATHER_SERVICE_BASE_URL = "http://weather.yahooapis.com/forecastrss";

    public static int getTemp(double latitude, double longitude) {
        try {
            URL obj = new URL(WEATHER_SERVICE_BASE_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.connect();
            return 10;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
