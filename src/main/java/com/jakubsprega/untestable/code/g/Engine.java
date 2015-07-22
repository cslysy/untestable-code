package com.jakubsprega.untestable.code.g;

/**
 *
 * @author U519060
 */
class Engine {
    
    private final Cylinder cylinder;

    public Engine(Cylinder cylinder) {
        this.cylinder = cylinder;
    }

    public Cylinder getCylinder() {
        return cylinder;
    }
}
