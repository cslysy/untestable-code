package com.jakubsprega.untestable.code.b;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.Phone;

public class IPhone implements Phone {
    
    private GsmModule gsmModule;
    
    @Override
    public void sendSMS(String to, String message) {
        gsmModule.connect();
        gsmModule.sendSMS(to, message);
        gsmModule.disconnect();
    }

    public GsmModule getGsmModule() {
        return gsmModule;
    }

    public void setGsmModule(GsmModule gsmModule) {
        this.gsmModule = gsmModule;
    }
}
