package oop.univ;

class A1 {
    int x = 2;
}
class B1 extends  A1 { int y = 3;}
class C1 extends  A1 { int z = 10;}

public class OOP_250421 {

    public static void main(String[] args) {

        A1 bar = new B1();

        System.out.println(bar.x);

        // 실제 객체의 멤버를 접근하고 싶은데, 자식 객체 접근을 못함
        // -> 해결하기위해 참조 변수 자료형을 변환
        // 문제점
        // 하드 코딩
        // 런타임 에러
        // -> instanceof 형변환 전 타입 검사
        // 에러는 줄지만 형변환 해야하는 개수만큼 이 명령어가 늘어남
        if (bar instanceof C1) {System.out.println("false");}
        else if (bar instanceof B1) {System.out.println(((B1) bar).y);}

        // --> 메서드 동적 바인딩 (다형성 + 오버라이딩)
        // 모든 클래스에서 동일하게 있어야한다.
        // 부모클래스에서 메서드를 만들어놓고,
        // 자식클래스에서 메서드를 구현하라. ( 오버라이딩 )
        // 컴파일러가 제일 마지막 호출된 곳으로 내려간다.

        // 멤버 변수는 type casting을 해줘야 한다.

    }
}
