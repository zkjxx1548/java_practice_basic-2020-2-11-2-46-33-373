package com;

public class Application {
    public static void main(String[] args) {
        //初始化N方向
        Direction direction = new DirectionN();
        System.out.println(direction.toString());
        //左转
        direction = direction.turnLeft();
        System.out.println(direction.toString());
        //右转
        direction = direction.turnRight();
        System.out.println(direction.toString());
    }
}
