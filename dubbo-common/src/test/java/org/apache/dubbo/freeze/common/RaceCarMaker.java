package org.apache.dubbo.freeze.common;

import org.apache.dubbo.common.URL;

import java.util.HashMap;
import java.util.Map;

public class RaceCarMaker implements CarMaker {
    WheelMaker wheelMaker;

    public WheelMaker getWheelMaker() {
        return wheelMaker;
    }

    public void setWheelMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }

    public Car makeCar(URL url) {
        Wheel wheel = wheelMaker.makeWheel(url);
        return new RaceCar(wheel);
    }


    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>(10);
        map.put("Wheel.maker","MichelinWheelMaker");

//        ExtensionLoader<WheelMaker> extensionLoader =
//                ExtensionLoader.getExtensionLoader(WheelMaker.class);
//       extensionLoader.getExtension("MichelinWheelMaker").makeWheel(new URL("","",0,"", map));

        //启动加载
//        AdaptiveWheelMaker ad=new AdaptiveWheelMaker();
//        ad.makeWheel(new URL("","",0,"", map));
        RaceCarMaker rcm=new RaceCarMaker();
        //启动
        rcm.setWheelMaker(new AdaptiveWheelMaker());
        //传参数时候调用
        rcm.makeCar(new URL("","",0,"", map));


    }
}