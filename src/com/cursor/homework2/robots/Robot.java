package com.cursor.homework2.robots;

import com.cursor.homework2.interfaces.iRobot;

public class Robot implements iRobot {
    protected String name;
    private double failureRate;
    ;

    public Robot() {
        failureRate = 0.1;
        name = "NonameRobot";
    }

    public Robot(String name) {
        this();
        this.name = name;
    }

    protected Robot(String name, double failureRate) {
        this(name);
        if (failureRate > this.failureRate)
            this.failureRate = failureRate;
    }


    public final void shoot() {
        proceed();
        System.out.println(name + " shoots: Piu! Piu!");
    }

    public final void shout() {
        proceed();
        System.out.println(name + " shouts: Путін ХYЙЛО!");
    }


    public final void move() {
        proceed();
        System.out.println(name+ " moves, singing: Едем в соседнее село, на дискотеку...");
    }

    public final boolean hasStrongArmor() {
        proceed();
        return true;
    }

    public final void reprogram() {
        proceed();
        throw new UnsupportedOperationException("Навіть не намагайтесь!");

    }

    public String toString() {
        return "Robot " + name;
    }

    private void proceed() {
        if (Math.random() <= failureRate)
            systemFailureWithExtermination();
    }

    private void systemFailureWithExtermination() {
        System.out.println("ПРОПАЛО ВСЬО!");
        System.out.println("Robot " + name + " has killed all the people on Earth!");
        System.out.println("System halted.");
        System.exit(-1);

    }

}

