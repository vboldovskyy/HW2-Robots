package com.cursor.homework2;

import java.util.Random;

public class Aliens {

    public static char pickAPlanet()
    {
        switch (new Random().nextInt(3))
    { case 0: return 'A';
        case 1: return 'B';
        default: return 'C';
    }
    }


    public static iRobot adaptForAliens(iRobot robot, char planet){
            switch (planet){
                case 'A': return new SeaRobot(robot);
                case 'B': return new WindRobot(robot);
                default: return new SunRobot(robot);

            }

    }}



