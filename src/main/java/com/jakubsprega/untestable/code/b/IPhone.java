package com.jakubsprega.untestable.code.b;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.OutgoingMessage;
import com.jakubsprega.untestable.code.api.OutgoingSmsMessage;
import com.jakubsprega.untestable.code.api.Phone;
import java.util.List;

public class IPhone implements Phone {

    private GsmModule gsmModule;
    private List<OutgoingMessage> outgoingMessages;

    @Override
    public void sendSMS(String to, String message) {
        gsmModule.connect();
        gsmModule.sendSMS(to, message);
        outgoingMessages.add(new OutgoingSmsMessage(message, to));
        gsmModule.disconnect();
    }

    public GsmModule getGsmModule() {
        return gsmModule;
    }

    public void setGsmModule(GsmModule gsmModule) {
        this.gsmModule = gsmModule;
    }

    public List<OutgoingMessage> getOutgoingMessages() {
        return outgoingMessages;
    }
}
