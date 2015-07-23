package com.jakubsprega.untestable.code.api;

/**
 *
 * @author jakubsprega
 */
public class IncommingSmsMessage implements IncommingMessage {

    private final String content;
    private final String sender;

    public IncommingSmsMessage(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getSender() {
        return sender;
    }
}
