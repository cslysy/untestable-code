package com.jakubsprega.untestable.code.a;

import com.jakubsprega.untestable.code.api.GsmModule;

/**
 * Samsung GSM module
 *
 * @author jakubsprega
 */
public class SamsungGsmModule implements GsmModule {

    public void connect() {
        boolean connected = false;
        System.out.println("Connecting");
        if (!connected) {
            throw new IllegalStateException("Could not connect to ...");
        }
    }

    public void disconnect() {
        System.out.println("Disconnecting");
    }

    public void sendSMS(String to, String message) {
        connect();
        System.out.println("Sending sms");
        disconnect();
    }
}
