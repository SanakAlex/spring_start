package dev.sanak.spring.spring_start;

import dev.sanak.spring.spring_start.entity.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);
        t1000.fire();

//        System.out.println(t1000);

//        ModelT1000 t1000v2 = context.getBean("t1000", ModelT1000.class);
//        System.out.println(t1000v2);

    }
}
