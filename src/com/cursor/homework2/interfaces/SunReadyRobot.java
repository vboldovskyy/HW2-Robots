package com.cursor.homework2.interfaces;

public interface SunReadyRobot extends ProtectedRobot {
    @Override
    default void getProtection()
    {
        System.out.println("This robot is now protected from Sun".toUpperCase());
    }
}
