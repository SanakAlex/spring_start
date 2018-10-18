package dev.sanak.spring.spring_start.implementation.asus;

import dev.sanak.spring.spring_start.interfaces.Leg;

public class LegImpl implements Leg {

    @Override
    public void go() {
        System.out.println("Asus go");
    }
}
