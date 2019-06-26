package com.cursor.homework2.robots;

public class EnhancedRobot extends Robot {
    public static final double FAILURE_RATE = 0.7;

    public EnhancedRobot() {
        super("NonameEnhancedRobot", FAILURE_RATE);
    }

    public EnhancedRobot(String name) {

        super(name, FAILURE_RATE);

    }

    public String toString() {
        return "EnhancedRobot " + name;
    }
}
