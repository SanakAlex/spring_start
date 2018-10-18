package dev.sanak.spring.spring_start.implementation.sony;

import dev.sanak.spring.spring_start.interfaces.Leg;

public class LegImpl implements Leg {

    @Override
    public void go() {
        System.out.println("Sony go");
    }
}
