package com;

public class DirectionW extends Direction {
    private final char direction = 'W';

    @Override
    public Direction turnRight() {
        return new DirectionN();
    }

    @Override
    public Direction turnLeft() {
        return new DirectionS();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionW direction1 = (DirectionW) o;

        if (direction != direction1.direction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) direction;
    }

    @Override
    public String toString() {
        return "Direction{direction=" + direction + '}';
    }
}
