package org.fasttrackit.course10.homework.exercise1;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class BasketWithFruitAsRecord {
    private final List<Fruit> fruits;

    public BasketWithFruitAsRecord(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public boolean find(Fruit fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(Fruit fruit) {
        if (find(fruit)) {
            fruits.remove(fruit);
            return true;
        }
        return false;
    }

    public int getPosition(Fruit fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<Fruit> distinct() {
        return new HashSet<Fruit>(fruits);
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int counter = 0;
        for (Fruit fruit : fruits) {
            counter++;
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "fruits=" + fruits +
                '}';
    }
}
