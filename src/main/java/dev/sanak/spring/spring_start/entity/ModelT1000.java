package dev.sanak.spring.spring_start.entity;

import dev.sanak.spring.spring_start.interfaces.Hand;
import dev.sanak.spring.spring_start.interfaces.Head;
import dev.sanak.spring.spring_start.interfaces.Leg;
import dev.sanak.spring.spring_start.interfaces.Robot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelT1000 implements Robot {

    private Head head;
    private Leg leg;
    private Hand hand;

    @Override
    public void fire() {
        head.think();
        hand.take();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("DANCING!!!1111");
    }
}
