package com.cursor.homework2;

import com.cursor.homework2.interfaces.iRobot;
import com.cursor.homework2.robots.EnhancedRobot;
import com.cursor.homework2.robots.ImprovedRobot;
import com.cursor.homework2.robots.Robot;

import java.util.Random;

public class RobotPicker {
    public static iRobot pickARobot() {
        int rand = new Random().nextInt(12) + 1;

        if (rand > 8) return new EnhancedRobot();
        else if (rand > 3) return new ImprovedRobot();
        else return new Robot();

    }
}
