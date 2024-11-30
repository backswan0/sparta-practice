package com.example.tale;

public class MyHouse {

    // 1. 속성
    private final Animal animal;
    private boolean isHungry;

    // 2. 생성자
    public MyHouse(Animal animal) {
        this.animal = animal;
    }

    // 3. 기능
    public void makeAnimalSound() {
        animal.makeSound();
    }

    public void feedAnimal (String food) {
        animal.eat(food);
    }

    public void isHungry () {
        animal.isHungry();
    }

    public void isHappy () {
        boolean isHappy = animal.isHappy();
        System.out.println("It is " + isHappy+" that my companion is happy.");
    }
}

