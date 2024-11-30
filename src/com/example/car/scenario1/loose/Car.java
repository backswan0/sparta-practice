package com.example.car.scenario1.loose;
/*
[설명]
[1] 속성으로 구현체가 아닌 인터페이스를 가졌다.
[2] 강결합과 다르게 구현체 대신 인터페이스에 의존한다.
 */

public class Car {
    // 1. 속성
    private Engine engine;

    // 2. 생성자
    public Car(Engine engine) {
        this.engine = engine;
    }

    // 3. 기능
    public void drive() {
        this.engine.run();
    }
}

