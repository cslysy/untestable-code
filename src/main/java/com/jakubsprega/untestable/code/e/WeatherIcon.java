package com.jakubsprega.untestable.code.e;

/**
 *
 * @author U519060
 */
public enum WeatherIcon {
    
    WARM("icons/warm.png"),
    COOL("icons/cool.png"),
    COLD("icons/cold.png");
    
    String iconPath;
    
    WeatherIcon(String iconPath) {
        this.iconPath = iconPath;
    }
    
}
