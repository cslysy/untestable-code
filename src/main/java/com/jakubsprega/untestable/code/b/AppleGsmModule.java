package com.jakubsprega.untestable.code.b;

import com.jakubsprega.untestable.code.api.Carrier;
import com.jakubsprega.untestable.code.api.GsmModule;

public class AppleGsmModule implements GsmModule {

    private Carrier carrier;

    public void connect() {
        System.out.println(
            String.format("Connecting to %s", carrier.getName())
        );

        System.out.println("Connected");
    }

    public void disconnect() {
        System.out.println(
            String.format("Disconnecting from %s", carrier.getName())
        );

        System.out.println("Disconnected");
    }
    
    public void sendSMS(String to, String message) {
        System.out.println(
            String.format("Sending message to: %s content: %s", to, message)
        );
        System.out.println("Message sent");
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }
}
