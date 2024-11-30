package com.example.car.scenario2.tight;

public class Brake {
    // 1. 속성
    private String name; // 브레이크의 이름
    private boolean isInspected; // 검수 여부 (true/false)

    // 2. 생성자
    public Brake(String name) {
        this.name = name;
        this.isInspected = false; // 처음엔 검수가 안 되었으니 false로 설정
    }

    // 3. 기능
    public boolean getIsInspected() {
        return this.isInspected;
    }

    public void setIsInspected(boolean isInspected) {
        this.isInspected = isInspected;
    }
}