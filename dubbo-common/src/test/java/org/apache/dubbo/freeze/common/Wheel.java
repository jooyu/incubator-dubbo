package org.apache.dubbo.freeze.common;

import org.apache.dubbo.common.URL;

public class Wheel implements WheelMaker {
    @Override
    public Wheel makeWheel(URL url) {
        System.out.println("welcome");
        return null;
    }
}
