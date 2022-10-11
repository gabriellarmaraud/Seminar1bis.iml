package model;

import java.util.StringJoiner;

public class Cake extends Entity {
    private String flavour;

    public Cake(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cake.class.getSimpleName() + "[", "]")
                .add("flavour='" + flavour + "'")
                .add("weight=" + weight)
                .toString();
    }
}
