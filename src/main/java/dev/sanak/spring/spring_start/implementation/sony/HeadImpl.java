package dev.sanak.spring.spring_start.implementation.sony;

import dev.sanak.spring.spring_start.interfaces.Head;

public class HeadImpl implements Head {

    @Override
    public void think() {
        System.out.println("Sony think");
    }
}
