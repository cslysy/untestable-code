package com.jakubsprega.untestable.code.d;

import java.util.Date;
import java.util.List;

/**
 *
 * @author U519060
 */
public class SonyPhone {
    
    public static boolean SERVICE_MODE = false;
    
    public void call(long number){
        System.out.println("Calling...");
        Call call = new OutgoingCall(number, new Date());
        PhoneSettings.getInstance().addRecentCall(call);
    }
    
    public void answer(IncommingCall call){
        System.out.println("Answering the phone...");
        PhoneSettings.getInstance().addRecentCall(call);
    }
    
    public List<Call> getRecentCalls(){
        return PhoneSettings.getInstance().getRecentCalls();
    }
}
