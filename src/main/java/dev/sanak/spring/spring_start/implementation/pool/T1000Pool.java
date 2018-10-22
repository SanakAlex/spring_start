package dev.sanak.spring.spring_start.implementation.pool;

import dev.sanak.spring.spring_start.interfaces.Robot;
import dev.sanak.spring.spring_start.interfaces.RobotPool;
import lombok.Data;

import java.util.Collection;
import java.util.Map;

@Data
public class T1000Pool implements RobotPool {

    private Collection<Robot> robotCollection;
    private Map<Integer, Robot> robotMap;

    public T1000Pool(Map<Integer, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    @Override
    public Map<Integer, Robot> getRobotMap() {
        return robotMap;
    }

    public void activateRobots() {
        for (Robot robot : robotCollection) {
            robot.action();
        }
    }

    public void applyRobotMap() {
        for (Robot value : robotMap.values()) {
            value.fire();
            System.out.println("\n");
        }
    }
}
