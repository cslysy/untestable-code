package com.jakubsprega.untestable.code.h;

/**
 * Chassis
 * 
 * @author jakubsprega
 */
class Chassis {
    
    private final Silencer silencer;

    public Chassis(Silencer silencer) {
        this.silencer = silencer;
    }
    
    public Silencer getSilencer() {
        return silencer;
    }
}
