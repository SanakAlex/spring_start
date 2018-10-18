package dev.sanak.spring.spring_start.implementation.asus;

import dev.sanak.spring.spring_start.interfaces.Hand;

public class HandImpl implements Hand {

    @Override
    public void take() {
        System.out.println("Asus take");
    }
}
