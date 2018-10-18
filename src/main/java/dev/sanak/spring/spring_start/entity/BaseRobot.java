package dev.sanak.spring.spring_start.entity;

import dev.sanak.spring.spring_start.interfaces.Hand;
import dev.sanak.spring.spring_start.interfaces.Head;
import dev.sanak.spring.spring_start.interfaces.Leg;
import dev.sanak.spring.spring_start.interfaces.Robot;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class BaseRobot implements Robot {

    private Head head;
    private Leg leg;
    private Hand hand;

    public BaseRobot() {
        System.out.println("Base robot constructor");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
