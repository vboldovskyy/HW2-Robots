package com.cursor.homework2.interfaces;

public interface SeaReadyRobot extends ProtectedRobot {
    @Override
    default void getProtection()
    {
        System.out.println("The robot is protected from the sea".toUpperCase());
    }
}
