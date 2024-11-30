package com.example.car.scenario2.tight;

public class InspectService {

    /*
    [설명]
    [1] 상속으로 구현할 부분
    [2] 문제는 이 상태로는 브레이크 검수 밖에 못한다.
     */
    public void inspect(Brake brake) {
        System.out.println("검수를 시작합니다.");
        System.out.println(brake.getIsInspected());
        brake.setIsInspected(true);
        System.out.println("변경되었습니다: " + brake.getIsInspected());
    }
}
