package org.apache.dubbo.freeze.common;

public class RaceCar extends Car {
    private Wheel wheel;

    public RaceCar(Wheel wheel) {
        this.wheel = wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
