package com.jakubsprega.untestable.code.a;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.Phone;
import com.jakubsprega.untestable.code.api.SmsMessage;

public class SamsungGalaxyS3 implements Phone {

    public void sendSMS(SmsMessage sms) {
        GsmModule gsmModule = new SamsungGsmModule();
        gsmModule.sendSMS(sms.getReceiver(), sms.getContent());
    }
}
