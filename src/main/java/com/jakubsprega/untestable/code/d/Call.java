package com.jakubsprega.untestable.code.d;

import java.util.Date;

/**
 *
 * @author U519060
 */
public abstract class Call {
    
    public long number;
    public Date date;

    public Call(long number, Date date) {
        this.number = number;
        this.date = date;
    }

    public long getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }
}
