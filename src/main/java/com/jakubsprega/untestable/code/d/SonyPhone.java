package com.jakubsprega.untestable.code.d;

import java.util.List;

/**
 *
 * @author jakubsprega
 */
public class SonyPhone {
    
    public static boolean SERVICE_MODE = false;
    
    public void call(OutgoingCall outgoingCall){
        System.out.println("Calling...");
        PhoneSettings.getInstance().addRecentCall(outgoingCall);
    }
    
    public void answer(IncomingCall call){
        System.out.println("Answering the phone...");
        PhoneSettings.getInstance().addRecentCall(call);
    }
    
    public List<Call> getRecentCalls(){
        return PhoneSettings.getInstance().getRecentCalls();
    }
}
