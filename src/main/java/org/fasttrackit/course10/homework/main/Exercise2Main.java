package org.fasttrackit.course10.homework.main;

import org.fasttrackit.course10.homework.exercise2.FlowerBouquet;

import java.util.HashSet;

public class Exercise2Main {
    public static void main(String[] args) {
        HashSet<String> flowers = new HashSet<>();
        flowers.add("Tulip");
        flowers.add("Dandelion");
        flowers.add("Orchid");
        flowers.add("Snowdrop");
        flowers.add("Rose");

        FlowerBouquet flowerBouquet = new FlowerBouquet(flowers);
        System.out.println("Flower bouquet consists of: " + flowerBouquet.getAll());

        System.out.println("Add flower: Daffodil");
        flowerBouquet.add("Daffodil");
        System.out.println("Flower bouquet after adding daffodil, consists of: " + flowerBouquet.getAll());
        System.out.println("Add flower: Snowdrop");
        flowerBouquet.add("Snowdrop");
        System.out.println("Flower bouquet after re-adding snowdrop, consists of: " + flowerBouquet.getAll());

        System.out.println("Remove flower: Snowdrop");
        flowerBouquet.remove("Snowdrop");
        System.out.println("Flower bouquet after removing snowdrop, consists of: " + flowerBouquet.getAll());
    }
}
