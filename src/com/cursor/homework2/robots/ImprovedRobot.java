package com.cursor.homework2.robots;

public class ImprovedRobot extends Robot {

    public ImprovedRobot() {
        super("NonameImprovedRobot", 0.3);
    }

    public ImprovedRobot(String name) {

        super(name, 0.3);

    }

    public String toString() {
        return "ImprovedRobot " + name;
    }

}
