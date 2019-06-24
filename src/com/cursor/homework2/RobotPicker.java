package com.cursor.homework2;

import java.util.Random;

public class RobotPicker {
    public static iRobot pickARobot(){
        int rand = new Random().nextInt(12)+1;

        if( rand>8 ) return new EnhancedRobot();
        if( rand>3 ) return new ImprovedRobot();
        return new Robot();

    }
}
