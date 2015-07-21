package com.jakubsprega.untestable.code.e;

/**
 *
 * @author U519060
 */
public class WeatherWidget {
    
    //52.2297700 21.0117800
    public WeatherIcon getWeatherIcon(double latitude, double longitude){
        int temp = YahooWeatherHelper.getTemp(latitude, longitude);
        
        if(temp <= 0){
            return WeatherIcon.COLD;
        } else if(temp < 15){
            return WeatherIcon.COOL;
        }else {
            return WeatherIcon.WARM;
        }
    }
    
}
