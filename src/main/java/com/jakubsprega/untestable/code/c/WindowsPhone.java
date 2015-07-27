package com.jakubsprega.untestable.code.c;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.SmsMessage;
import com.jakubsprega.untestable.code.api.Phone;

/**
 * Windows phone
 *
 * @author jakubsprega
 */
public class WindowsPhone implements Phone {

    private final GsmModule gsmModule;

    public WindowsPhone() {
        gsmModule = new WindowsGsmModule();
        init();
    }

    private void init() {
        System.out.println("Connecting to windows store");
        throw new IllegalStateException("Could not connect to windows store");
    }

    @Override
    public void sendSMS(SmsMessage sms) {
        gsmModule.sendSMS(
            sms.getReceiver(), sms.getContent()
        );
    }
}
