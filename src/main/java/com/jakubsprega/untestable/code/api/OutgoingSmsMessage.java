package com.jakubsprega.untestable.code.api;

/**
 *
 * @author U519060
 */
public class OutgoingSmsMessage implements OutgoingMessage {
    
    private String content;
    private String receiver;

    public OutgoingSmsMessage(String content, String receiver) {
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
