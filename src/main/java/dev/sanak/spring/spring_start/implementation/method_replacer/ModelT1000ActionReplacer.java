package dev.sanak.spring.spring_start.implementation.method_replacer;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ModelT1000ActionReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("Action from MethodReplacer");
        return obj;
    }
}
