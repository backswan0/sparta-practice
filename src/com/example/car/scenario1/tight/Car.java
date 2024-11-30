package com.example.car.scenario1.tight;
/*
[설명]
[1] 만약에 자동차 엔진이 바뀌면 자동차도 영향을 받는다.
[2] 강결합은 유지보수에 나쁘므로 결합도를 낮추고 응집도를 높여야 한다.
[3] 자동차가 가스 엔진을 가져서 가스 엔진 밖에 못 쓴다.
    즉, 유연성이 떨어진다.
 */

public class Car {
    // 1. 속성
    private GasEngine engine;
    private ElectricEngine electricEngine; // 수정이 일어남 1

    // 2. 생성자
    public Car() {
        this.engine = new GasEngine();
        this.electricEngine = new ElectricEngine();
    }

    // 3. 기능
    public void drive() {
        System.out.println("자동차가 주행됩니다.");
        this.engine.run();
    }

    public void driveWithElectricEngine() {
        System.out.println("자동차가 주행됩니다.");
        this.electricEngine.run();
    }
}