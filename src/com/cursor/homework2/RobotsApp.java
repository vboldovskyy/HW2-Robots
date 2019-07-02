package com.cursor.homework2;

import com.cursor.homework2.interfaces.ProtectedRobot;
import com.cursor.homework2.interfaces.iRobot;
import com.cursor.homework2.robots.EnhancedRobot;
import com.cursor.homework2.robots.ImprovedRobot;
import com.cursor.homework2.robots.Robot;


 class RobotsApp {
        static void start() {
        System.out.println("Hello there and welcome to our state of the art robot app!");
        System.out.println("RobotPicker picks a random robot:");
        iRobot robot = RobotPicker.pickARobot();
        System.out.println("It is " + robot);
        System.out.print("Now aliens come and choose a planet ");
        char planet = Aliens.pickAPlanet();
        System.out.println(planet);
        System.out.println("Now let's get our robot protected");
        ProtectedRobot protectedRobot = Aliens.adaptForAliens(robot, planet);
        System.out.println("After adaptation the robot should be protected. Let's try it out:");
        protectedRobot.getProtection();
        System.out.println("Now look at three models of our robots. They are buggy, but you have a reasonable" +
                           "chance to survive");
        iRobot robot1 = new Robot("Bender");
        System.out.println(robot1 + " is chosen.");
        robot1.move();
        robot1.shoot();
        robot1.shout();
        iRobot robot2 = new ImprovedRobot("R2D2");
        System.out.println(robot2 + " is chosen.");
        robot2.move();
        robot2.shoot();
        robot2.shout();
        iRobot robot3 = new EnhancedRobot("Terminator");
        System.out.println(robot3 + " is chosen.");
        robot3.move();
        robot3.shoot();
        robot3.shout();
        System.out.println("It's amazing, but you survived. YOU WIN THIS GAME! CONGRATULATIONS ))))");

    }
}
