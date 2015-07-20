package com.jakubsprega.untestable.code.b;

import com.jakubsprega.untestable.code.api.GsmModule;
import com.jakubsprega.untestable.code.api.Phone;

public class SamsungGalaxyS3 implements Phone {
    
    private final GsmModule gsmModule = new SamsungGsmModule();

    @Override
    public void sendSMS(String to, String message) {
        gsmModule.sendSMS(to, message);
    }
}
