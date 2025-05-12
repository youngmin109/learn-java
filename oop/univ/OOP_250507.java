package oop.univ;

// 예외 전파 흐름 확인용 클래스
class Boo {
    // level1 호출 -> 내부적으로 level2 호출
    void level1() {
        level2(); // 호출 스택: level1 -> level2
    }

    // level2 호출 -> 내부적으로 level3 호출
    void level2() {
        level3(); //
    }

    // level3 에서 예외발생
    void level3() {
        // 예외를 처리하지 않고 그대로 던지므로 호출한 쪽으로 전달됨
        throw new RuntimeException("예외 발생 위치: level3()");
        // 현재 발생한 에러가 어떤 에러인지 알기위해서 throw를 한다.
    }
}

public class OOP_250507 {
    public static void main(String[] args) {
        new Boo().level1();
        System.out.println("이 코드는 실행되지 않습니다.");
    }

}
