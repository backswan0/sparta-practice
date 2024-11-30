package com.example.tale;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("My dog");
        Cat cat = new Cat("My cat");
        MyHouse dogHouse = new MyHouse(dog);
        MyHouse catHouse = new MyHouse(cat);

        dogHouse.makeAnimalSound();
        dogHouse.isHungry();
        dogHouse.feedAnimal("beef tenderloin");
        dogHouse.feedAnimal("salmon");
        dogHouse.isHappy();

        System.out.println();

        catHouse.makeAnimalSound();
        catHouse.isHungry();
        catHouse.feedAnimal("cheese");
        catHouse.isHungry();
        catHouse.feedAnimal("duck meat");
        catHouse.isHappy();
        catHouse.feedAnimal("sardine");
        catHouse.isHungry();
        catHouse.isHappy();
        catHouse.feedAnimal("tuna");
    }
}

