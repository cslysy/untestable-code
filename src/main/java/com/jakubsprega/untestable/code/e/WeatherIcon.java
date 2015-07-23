package com.jakubsprega.untestable.code.e;

/**
 * Weather icon
 *
 * @author jakubsprega
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
