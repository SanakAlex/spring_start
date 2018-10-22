package dev.sanak.spring.spring_start;

import dev.sanak.spring.spring_start.implementation.factory.RobotT1000Factory;
import dev.sanak.spring.spring_start.implementation.pool.T1000Pool;
import dev.sanak.spring.spring_start.interfaces.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        RobotT1000Factory t1000Factory = context.getBean("t1000Factory", RobotT1000Factory.class);
//
//        Robot T1000_1 = t1000Factory.createRobot();
//        Robot T1000_2 = t1000Factory.createRobot();
//        Robot T1000_3 = t1000Factory.createRobot();
//
//        System.out.println(T1000_1);
//        System.out.println(T1000_2);
//        System.out.println(T1000_3);
//
//        T1000_1.action();

        T1000Pool t1000Pool = context.getBean("t100Pool", T1000Pool.class);
//        t1000Pool.activateRobots();
        t1000Pool.applyRobotMap();
    }
}
