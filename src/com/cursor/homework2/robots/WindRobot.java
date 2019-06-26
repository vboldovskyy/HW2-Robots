
package com.cursor.homework2.robots;

import com.cursor.homework2.interfaces.WindReadyRobot;
import com.cursor.homework2.interfaces.iRobot;

public class WindRobot implements iRobot, WindReadyRobot {

    private iRobot inner;

    public WindRobot(iRobot robot) {
        this.inner = robot;

    }

    @Override
    public void shoot() {
        inner.shoot();
    }

    @Override
    public void shout() {
        inner.shout();
    }

    @Override
    public void move() {
        inner.move();
    }

    @Override
    public void reprogram() {
        inner.reprogram();
    }

    @Override
    public boolean hasStrongArmor() {
        return inner.hasStrongArmor();
    }
}


