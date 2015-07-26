package com.jakubsprega.untestable.code.a;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.OutgoingSmsMessage;
import com.jakubsprega.untestable.code.api.Phone;

public class SamsungGalaxyS3 implements Phone {

    @Override
    public void sendSMS(OutgoingSmsMessage outgoingMessage) {
        GsmModule gsmModule = new SamsungGsmModule();
        gsmModule.sendSMS(
            outgoingMessage.getReceiver(), outgoingMessage.getContent()
        );
    }
}
