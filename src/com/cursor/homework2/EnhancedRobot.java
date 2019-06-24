package com.cursor.homework2;

public class EnhancedRobot extends Robot {

    public EnhancedRobot() {
        super("NonameEnhancedRobot", 0.7);
    }

    public EnhancedRobot(String name) {

        super(name, 0.7);

    }

    public String toString() {
        return "EnhancedRobot " + name;
    }
}
