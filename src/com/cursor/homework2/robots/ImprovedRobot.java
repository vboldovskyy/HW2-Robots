package com.cursor.homework2.robots;

public class ImprovedRobot extends Robot {
    public static final double FAILURE_RATE =0.3;

    public ImprovedRobot() {
        super("NonameImprovedRobot", FAILURE_RATE);
    }

    public ImprovedRobot(String name) {

        super(name, FAILURE_RATE);

    }

    public String toString() {
        return "ImprovedRobot " + name;
    }

}
