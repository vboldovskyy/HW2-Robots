package com.cursor.homework2;


import com.cursor.homework2.interfaces.iRobot;
import com.cursor.homework2.robots.EnhancedRobot;
import com.cursor.homework2.robots.ImprovedRobot;
import com.cursor.homework2.robots.Robot;

public class Main {

    public static void main(String[] args) {

        iRobot robot1= new Robot("Bender");
        robot1.move();
        robot1.shoot();
        robot1.shout();
        iRobot robot2 = new EnhancedRobot("R2D2");
        robot2.move();
        robot2.shoot();
        robot2.shout();
        iRobot robot3 = new ImprovedRobot("Terminator");
        robot3.move();
        robot3.shoot();
        robot3.shout();


    }
}
