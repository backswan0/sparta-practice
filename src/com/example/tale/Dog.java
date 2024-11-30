package com.example.tale;
// [2/5] 인터페이스 Animal을 오버라이딩한 클래스 Dog

public class Dog implements Animal {
    // 1. 속성
    private String name;
    private boolean isHungry = true;
    private boolean isHappy = true;

    // 2. 생성자
    public Dog(String name) {
        this.name = name;
    }

    // 3. 기능
    @Override
    public void makeSound() {
        System.out.println(name + " says: " + "Woof!");
    }

    @Override
    public void isHungry() {
        if (isHungry) {
            System.out.println(name + " is hungry now.");
        }
    }

    @Override
    public boolean isHappy() {
        if (isHungry) {
            return false;
        } else {
            return isHappy;
        }
    }

    @Override
    public void eat(String food) {
        if (isHungry) {
            System.out.println(name + " eats " + food + ".");
            isHungry = false;
        } else {
            System.out.println(name + " is full.");
        }
    }
}