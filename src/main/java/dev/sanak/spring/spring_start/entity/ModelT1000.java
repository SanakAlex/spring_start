package dev.sanak.spring.spring_start.entity;

import dev.sanak.spring.spring_start.interfaces.Hand;
import dev.sanak.spring.spring_start.interfaces.Head;
import dev.sanak.spring.spring_start.interfaces.Leg;
import dev.sanak.spring.spring_start.interfaces.Robot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelT1000 implements Robot, InitializingBean, DisposableBean {

    private Head head;
    private Leg leg;
    private Hand hand;

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

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

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init T1000");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy T1000");

    }
}
