package com;

public class DirectionS extends Direction {
    private final char direction = 'S';

    @Override
    public Direction turnRight() {
        return new DirectionW();
    }

    @Override
    public Direction turnLeft() {
        return new DirectionE();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionS direction1 = (DirectionS) o;

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
