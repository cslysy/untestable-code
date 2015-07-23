package com.jakubsprega.untestable.code.h;

/**
 * Car mechanic
 * 
 * @author U519060
 */
public class CarMechanic {
    
    public void fixCylinder(Car car){
        Cylinder cylinder = car.getEngine().getCylinder();
        //Some fixings algorithm
    }
    
    public void fixSilencer(Car car){
        Silencer silencer = car.getChassis().getSilencer();
        //Some fixings algorithm
    }
    
    public Engine unmountEngine(Car car){
        return car.getEngine();
    }
}
