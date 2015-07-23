package com.jakubsprega.untestable.code.a;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.OutgoingSmsMessage;
import com.jakubsprega.untestable.code.api.Phone;

public class SamsungGalaxyS3 implements Phone {
    
    private final GsmModule gsmModule = new SamsungGsmModule();

    @Override
    public void sendSMS(OutgoingSmsMessage outgoingMessage) {
        gsmModule.sendSMS(
            outgoingMessage.getReceiver(), outgoingMessage.getContent()
        );
    }
}
