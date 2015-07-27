package com.jakubsprega.untestable.code.b;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.SmsMessage;
import com.jakubsprega.untestable.code.api.Phone;

public class IPhone implements Phone {

    private GsmModule gsmModule;

    @Override
    public void sendSMS(SmsMessage sms) {
        gsmModule.connect();
        gsmModule.sendSMS(
            sms.getReceiver(), sms.getContent()
        );
        gsmModule.disconnect();
    }

    public GsmModule getGsmModule() {
        return gsmModule;
    }

    public void setGsmModule(GsmModule gsmModule) {
        this.gsmModule = gsmModule;
    }
}
