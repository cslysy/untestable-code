package com.jakubsprega.untestable.code.h;

/**
 * Car
 * 
 * @author jakubsprega
 */
public class Car {

    private final Engine engine;
    private final Body body;
    private final Chassis chassis;

    public Car(Engine engine, Body body, Chassis chassis) {
        this.engine = engine;
        this.body = body;
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public Body getBody() {
        return body;
    }

    public Chassis getChassis() {
        return chassis;
    }
}
