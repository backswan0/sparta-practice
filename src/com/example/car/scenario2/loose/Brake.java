package com.example.car.scenario2.loose;

// 상속 받았다
public class Brake extends CarPart {
    private String name;

    public Brake(String name) {
        // 자식 클래스에서는 받아온 이름만 넣어준다
        super(false);
        this.name = name;
        /*
        강결합과 다르게 검수가 없다
        오로지 stop만 있다.
        부모클래스인 CarPart가 검수 기능을 가져갔기 때문에
        본질에 더 집중할 수 있다...!!!
         */
    }

    public void stop() {
        System.out.println("멈출 수 있다.");
    }
}
