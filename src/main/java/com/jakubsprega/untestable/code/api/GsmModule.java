package com.jakubsprega.untestable.code.api;

public interface GsmModule {
    
    public void connect();
    
    public void disconnect();
    
    public void sendSMS(String to, String message);

}
