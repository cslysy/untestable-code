package com.jakubsprega.untestable.code.a;

import com.jakubsprega.untestable.code.api.GsmModule;

/**
 *
 * @author U519060
 */
public class SamsungGsmModule implements GsmModule {

    @Override
    public void connect() {
        boolean connected = false;
        System.out.println("Connecting");
        if(!connected){
            throw new IllegalStateException("Could not connect to ...");
        }
        
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting");
    }

    @Override
    public void sendSMS(String to, String message) {
        connect();
        System.out.println("Sending sms");
        disconnect();
    }
    
}
