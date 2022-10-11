package model;

import java.util.StringJoiner;

public class Apple extends Entity {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Apple.class.getSimpleName() + "[", "]")
                .add("color='" + color + "'")
                .add("weight=" + weight)
                .toString();
    }
}
