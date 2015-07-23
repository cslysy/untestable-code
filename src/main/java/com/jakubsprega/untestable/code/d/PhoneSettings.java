package com.jakubsprega.untestable.code.d;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jakubsprega
 */
public class PhoneSettings {
    
    private static PhoneSettings instance = new PhoneSettings();
    
    private List<Call> recentCalls = new ArrayList<Call>();
    
    private PhoneSettings(){
        
    }
    
    public static PhoneSettings getInstance(){
        return instance;
    }

    public List<Call> getRecentCalls(){
        return recentCalls;
    }
    
    public void addRecentCall(Call call){
        recentCalls.add(call);
    }
}
