package org.fasttrackit.course10.homework.exercise2;

import java.util.Collection;
import java.util.HashSet;

public class FlowerBouquet {
    private final HashSet<String> flowers;

    public FlowerBouquet(HashSet<String> flowers) {
        this.flowers = flowers;
    }

    public Collection<String> getAll() {
        return flowers;
    }

    public void add(String flower) {
        flowers.add(flower);
    }

    public void remove(String flower) {
        flowers.remove(flower);
    }

}
