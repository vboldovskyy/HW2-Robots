package com.cursor.homework2;

import com.cursor.homework2.interfaces.iRobot;
import com.cursor.homework2.robots.EnhancedRobot;
import com.cursor.homework2.robots.ImprovedRobot;
import com.cursor.homework2.robots.Robot;

import java.util.Random;

public class RobotPicker {
    public static final int UPPER_BOUND = 12;
    public static final int MIDDLE_BOUND = 8;
    public static final int LOWER_BOUND = 3;

    public static iRobot pickARobot() {
        int rand = new Random().nextInt(UPPER_BOUND) + 1;

        if (rand > MIDDLE_BOUND) {
            return new EnhancedRobot();
        } else if (rand > LOWER_BOUND) {
            return new ImprovedRobot();
        } else {
            return new Robot();
        }

    }
}
