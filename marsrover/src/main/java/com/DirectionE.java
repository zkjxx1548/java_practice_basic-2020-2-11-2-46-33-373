package com;

public class DirectionE extends Direction {
    private final char direction = 'E';

    @Override
    public Direction turnRight() {
        return new DirectionS();
    }

    @Override
    public Direction turnLeft() {
        return new DirectionN();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionE direction1 = (DirectionE) o;

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
