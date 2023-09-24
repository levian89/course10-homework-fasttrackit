package org.fasttrackit.course10.homework.exercise1;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class BasketWithFruitAsString {
    private final List<String> fruits;

    public BasketWithFruitAsString(List<String> fruits) {
        this.fruits = fruits;
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        if (find(fruit)) {
            fruits.remove(fruit);
            return true;
        }
        return false;
    }

    public int getPosition(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
        return new HashSet<String>(fruits);
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int counter = 0;
        for (String fruit : fruits) {
            counter++;
        }
        return counter;
    }

    @Override
    public String toString() {
        return "BasketWithFruitAsString{" +
                "fruits=" + fruits +
                '}';
    }
}
