package org.apache.dubbo.freeze.common;

import org.apache.dubbo.common.URL;

public class MichelinWheelMaker implements WheelMaker {
    @Override
    public Wheel makeWheel(URL url) {
        System.out.println("hello");
        return null;
    }
}
