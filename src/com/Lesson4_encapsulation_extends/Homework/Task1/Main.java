package com.Lesson4_encapsulation_extends.Homework.Task1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        CoffeeRobot coffeRobot = new CoffeeRobot();
        coffeRobot.work();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();
        Robot[] objects = new Robot[]{new Robot(), new CoffeeRobot(), new RobotDancer(), new RobotCoocker()};
        System.out.println('\n');

        for(int i = 0; i < objects.length; ++i) {
            objects[i].work();
        }

    }
}