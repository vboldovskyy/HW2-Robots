package com.cursor.homework2;

public class Main {

    public static void main(String[] args) {

        iRobot robot = RobotPicker.pickARobot();
        System.out.println(robot.toString());
        robot.move();
        robot.shoot();
        robot.hasStrongArmor();
        robot.shout();
        char planet = Aliens.pickAPlanet();
        iRobot adapted = Aliens.adaptForAliens(robot, planet);
        if (adapted instanceof SeaReadyRobot)
            System.out.println("now robot is ready for sea");
        if (adapted instanceof WindReadyRobot)
            System.out.println("now robot is ready for the winds");
        if (adapted instanceof SunReadyRobot)
            System.out.println("now robot is ready for the sun");

        System.out.println("Congratulations, you didn't get killed by those robots");


    }}
