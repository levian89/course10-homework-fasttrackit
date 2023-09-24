package org.fasttrackit.course10.homework.main;

import org.fasttrackit.course10.homework.exercise1.BasketWithFruitAsRecord;
import org.fasttrackit.course10.homework.exercise1.BasketWithFruitAsString;
import org.fasttrackit.course10.homework.exercise1.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Main {
    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Pomegranate"));
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Pear"));
        fruits.add(new Fruit("Peach"));
        fruits.add(new Fruit("Pear"));

        System.out.println("Fruits' list: " + fruits);

        BasketWithFruitAsRecord fruitBasket = new BasketWithFruitAsRecord(fruits);
        System.out.println("Basket of fruits: " + fruitBasket);

        System.out.println("Find banana in basket: " + fruitBasket.find(new Fruit("Banana")));
        System.out.println("Remove apple from the basket: " + fruitBasket.remove(new Fruit("Apple")));
        System.out.println("Basket of fruits after apple removal: " + fruitBasket);
        System.out.println("Remove mango from the basket: " + fruitBasket.remove(new Fruit("Mango")));
        System.out.println("Get the position of pomegranate: " + fruitBasket.getPosition(new Fruit("Pomegranate")));
        System.out.println("Distinct: " + fruitBasket.distinct());
        System.out.println("Add fruit: Lemon");
        fruitBasket.addFruit(new Fruit("Lemon"));
        System.out.println("Basket of fruits after adding lemon: " + fruitBasket);
        System.out.println("Basket's size: " + fruitBasket.count());
        System.out.println("Custom count using a for loop: " + fruitBasket.customCount());
        System.out.println("************************************");

        List<String> fruits1 = new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Pomegranate");
        fruits1.add("Apple");
        fruits1.add("Pear");
        fruits1.add("Peach");
        fruits1.add("Pear");

        System.out.println("Fruits' list: " + fruits1);

        BasketWithFruitAsString fruitBasket1 = new BasketWithFruitAsString(fruits1);
        System.out.println("Basket of fruits: " + fruitBasket1);

        System.out.println("Find banana in basket: " + fruitBasket1.find("Banana"));
        System.out.println("Remove apple from the basket: " + fruitBasket1.remove("Apple"));
        System.out.println("Basket of fruits after apple removal: " + fruitBasket1);
        System.out.println("Remove mango from the basket: " + fruitBasket1.remove("Mango"));
        System.out.println("Get the position of pomegranate: " + fruitBasket1.getPosition("Pomegranate"));
        System.out.println("Distinct: " + fruitBasket1.distinct());
        System.out.println("Add fruit: Lemon");
        fruitBasket1.addFruit("Lemon");
        System.out.println("Basket of fruits after adding lemon: " + fruitBasket1);
        System.out.println("Basket's size: " + fruitBasket1.count());
        System.out.println("Custom count using a for loop: " + fruitBasket1.customCount());


    }
}
