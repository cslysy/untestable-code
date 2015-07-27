package com.jakubsprega.untestable.code.api;

/**
 * Outgoing SMS message
 * 
 * @author jakubsprega
 */
public class SmsMessage {
    
    private final String content;
    private final String receiver;

    public SmsMessage(String content, String receiver) {
        this.content = content;
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public String getReceiver() {
        return receiver;
    }
}
