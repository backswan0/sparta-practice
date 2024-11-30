package com.example.tale;
// [3/5] 인터페이스 Animal을 오버라이딩한 클래스 Cat

public class Cat implements Animal {

    // 1. 속성
    private String name;
    private boolean isHungry = false;
    /*
    [유의 사항]
    [a] 논리형 boolean 타입 변수는 is~와 같이 명명하자.

    [수정 전]
    private boolean isHungry = false;
    private boolean isHappy = true;

    [수정 후]
    [삭제] private boolean isHappy = true;
    [이유] isHappy 변수가 isHungry의 반대이므로
     */

    // 2. 생성자
    public Cat(String name) {
        this.name = name;
    }

    // 3. 기능
    @Override
    public void makeSound() {
        System.out.println(name + " says: " + "Meow!");
    }

    @Override
    public void isHungry() {
        if (isHungry) {
            /*
            [유의 사항]
            [b] 이중 부정은 피하자: !isNotHungry (X)
                (이유) 부정인지 긍정인지 추가로 생각해야 하므로
            [c] 더 많이 사용할 상황을 변수나 함수의 이름으로 쓰자.
            [d] not 대신 반의어를 변수나 함수의 이름으로 사용하자.
                (예) isNotHungry 대신 isFull
             */
            System.out.println(name + " is hungry now.");
        }
    }

    @Override
    public boolean isHappy() {
        return !isHungry;
        /*
        [수정 전]
        if (isHungry) {
              return !isHappy;
        } else {
              return isHappy;
        }
        [수정 후]
        return !isHungry;

        [유의 사항]
        [e] 느낌표(!) 쓸 상황은 되도록 피하자.
         */
    }

    @Override
    public void eat(String food) {
        if (isHungry) {
            System.out.println(name + " eats " + food + ".");
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry now.");
            System.out.println("Several hours passed.");
            isHungry = true;
        }
    }
}