package com.example.car.scenario2.loose;

public class Main {
    public static void main(String[] args) {
        Brake brake = new Brake("자동차 브레이크");
        /*
        [설명]
        [1] 브레이크를 넣든 센서를 넣든 상속했기 때문에 그대로 작동한다.
        [2] 상속의 특징은 추상화이다.
         */

        InspectService inspectService = new InspectService();
        inspectService.inspect(brake);

        brake.stop();
    }
}