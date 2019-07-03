package com.cursor.homework2;

import com.cursor.homework2.interfaces.ProtectedRobot;
import com.cursor.homework2.interfaces.iRobot;
import com.cursor.homework2.robots.SeaRobot;
import com.cursor.homework2.robots.SunRobot;
import com.cursor.homework2.robots.WindRobot;

import java.util.Random;

class Aliens {

    private static final int PLANET_BOUND = 3;
    private static final int SEA_PLANET_VALUE = 0;
    private static final int WIND_PLANET_VALUE = 1;
    private static final char SEA_PLANET_LITERAL = 'A';
    private static final char WIND_PLANET_LITERAL = 'B';
    private static final char SUN_PLANET_LITERAL = 'C';

    static char pickAPlanet() {
        switch (new Random().nextInt(PLANET_BOUND)) {
            case SEA_PLANET_VALUE:
                return SEA_PLANET_LITERAL;
            case WIND_PLANET_VALUE:
                return WIND_PLANET_LITERAL;
            default:
                return SUN_PLANET_LITERAL;
        }
    }


    static ProtectedRobot adaptForAliens(iRobot robot, char planetChoice) {
        switch (planetChoice) {
            case SEA_PLANET_LITERAL:
                return new SeaRobot(robot);
            case WIND_PLANET_LITERAL:
                return new WindRobot(robot);
            default:
                return new SunRobot(robot);

        }

    }
}



