package com.jakubsprega.untestable.code.c;

import com.jakubsprega.untestable.code.api.GsmModule;

/**
 * @author jakubsprega
 */
public class WindowsGsmModule implements GsmModule {

    public void connect() {
        //NOP
    }

    public void disconnect() {
        //NOP
    }

    public void sendSMS(String to, String message) {
        //NOP
    }

}
