package com.example.car.scenario1.loose;

public class Main {
/*
[설명]
[1] 메인 메서드는 Car 클래스의 외부에 해당한다.
[2] 메인 메서드는 두 가지 책임을 지닌다.
    첫째, 객체를 생성하는 책임
    둘째, 어떤 객체를 주입할지 결정하는 책임
[3] 다형성: 한 객체가 여러가지 형태를 가질 수 있는 것
 */

    public static void main(String[] args) {
        GasEngine gasEngine = new GasEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        SuperEngine superEngine = new SuperEngine();
        /*
        [설명]
        [4] 자동차 객체를 건드리지 않고 엔진만 바꾸었다.
        [5] 데이터 타입은 다르지만 Engine 객체라는 공통점이 있다.
         */

        Car gasCar = new Car(gasEngine);
        Car eletricCar = new Car(electricEngine);
        Car superCar = new Car(superEngine);
        /*
        [설명]
        [6] 의존성 주입 == Car 밖에서 필요한 객체를 Car 안으로 주입하는 행위
                     == 객체에 필요한 객체를 주입하는 행위
         */

        gasCar.drive();
        eletricCar.drive();
        superCar.drive();
    }
}