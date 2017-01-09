package com.jakubsprega.untestable.code.a;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.Phone;
import com.jakubsprega.untestable.code.api.SmsMessage;

import java.util.ArrayList;
import java.util.List;

public class SamsungGalaxyS3 implements Phone {

    private List<SmsMessage> sentMessages = new ArrayList<SmsMessage>();

    public void sendSMS(SmsMessage sms) {
        GsmModule gsmModule = new SamsungGsmModule();
        gsmModule.sendSMS(sms.getReceiver(), sms.getContent());
        sentMessages.add(sms);
    }

    public List<SmsMessage> getSentMessages() {
        return sentMessages;
    }
}
