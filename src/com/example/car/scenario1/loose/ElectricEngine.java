package com.example.car.scenario1.loose;
/*
[설명]
[1] implements를 쓰면 중괄호{}를 작성하라고 오류가 뜬다!
    == 구현하라고 오류가 뜬다!
[2] 인터페이스에서 정의된 기능을 반드시 클래스에서 구현해야 한다.
 */

public class ElectricEngine implements Engine {

    @Override
    public void run() {
        System.out.println("전기 엔진이 작동합니다.");
    }
}