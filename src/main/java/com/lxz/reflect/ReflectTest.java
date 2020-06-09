package com.lxz.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {
    public static car initByDefaultConst() throws Throwable{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.lxz.reflect.car");

        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        car car = (car)cons.newInstance();

        Method setBrand = clazz.getMethod("setBrand",String.class);
        setBrand.invoke(car,"lxz");

        Method setColor = clazz.getMethod("setColor",String.class);
        setColor.invoke(car,"red");

        Method setMaxSpead = clazz.getMethod("setMaxSpead",String.class);
        setMaxSpead.invoke(car,"lxz");
        return car;
    }
    public static void main(String[] args) throws Throwable{
        car car = initByDefaultConst();
        car.introduce();
    }
}
