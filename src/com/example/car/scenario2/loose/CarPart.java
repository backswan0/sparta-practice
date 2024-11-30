package com.example.car.scenario2.loose;

public abstract class CarPart {
    // [설명 1] 브레이크의 부모가 되는 부모 클래스에 해당한다.

    // 1. 속성
    private boolean isInspected;
    // [설명 2] 자식 클래스에서 선언하지 않아도 쓸 수 있다.
    //         위의 속성이 자식 클래스에서 보이지 않을 뿐이다.

    // 2. 생성자
    public CarPart(boolean isInspected) {
        this.isInspected = isInspected;
    }

    // 3. 기능
    public void inspect() {
        System.out.println("검수를 진행합니다.");
        this.isInspected = true;
        System.out.println("변경 결과: " + this.isInspected);
    }
}