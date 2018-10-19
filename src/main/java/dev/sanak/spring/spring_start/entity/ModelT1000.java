package dev.sanak.spring.spring_start.entity;

import dev.sanak.spring.spring_start.interfaces.Hand;
import dev.sanak.spring.spring_start.interfaces.Head;
import dev.sanak.spring.spring_start.interfaces.Leg;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class ModelT1000 extends BaseRobot implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(Head head, Leg leg, Hand hand, String color, int year, boolean soundEnabled) {
        super(head, leg, hand);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Init T1000");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy T1000");
    }

    @Override
    public void fire() {
        getHead().think();
        getHand().take();
        getLeg().go();
    }

    @Override
    public void dance() {
        System.out.println("DANCING!!!1111");
    }
}
