package com.jakubsprega.untestable.code.c;

import com.jakubsprega.untestable.code.api.GsmModule;

/**
 *
 * @author U519060
 */
public class WindowsGsmModule implements GsmModule {

    @Override
    public void connect() {
        //NOP
    }

    @Override
    public void disconnect() {
        //NOP
    }

    @Override
    public void sendSMS(String to, String message) {
        //NOP
    }

}
