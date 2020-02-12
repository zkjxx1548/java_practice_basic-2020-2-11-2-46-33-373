package com;

public class DirectionN extends Direction {
    private final char direction = 'N';

    @Override
    public Direction turnRight() {
        return new DirectionE();
    }

    @Override
    public Direction turnLeft() {
        return new DirectionW();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionN direction1 = (DirectionN) o;

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
