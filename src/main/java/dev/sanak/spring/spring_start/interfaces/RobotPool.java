package dev.sanak.spring.spring_start.interfaces;

import java.util.Collection;
import java.util.Map;

public interface RobotPool {

    Collection<Robot> getRobotCollection();

    Map<Integer, Robot> getRobotMap();
}
