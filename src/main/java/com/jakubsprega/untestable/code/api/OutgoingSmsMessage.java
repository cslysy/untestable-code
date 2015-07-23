package com.jakubsprega.untestable.code.api;

/**
 * Outgoing SMS message
 * 
 * @author jakubsprega
 */
public class OutgoingSmsMessage implements OutgoingMessage {
    
    private final String content;
    private final String receiver;

    public OutgoingSmsMessage(String content, String receiver) {
        this.content = content;
        this.receiver = receiver;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getReceiver() {
        return receiver;
    }
}
