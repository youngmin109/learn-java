package oop.univ;

// 지금부터 클래스를 정의
// 클래스 이름은 항상 대문자로 시작!
class Car3 {
    // Data + Function
    // Data -> Member variable ( 멤버 변수 )
    String name;

    // Function -> Member method ( 멤버 메서드 )
    void prtName() {
        System.out.println("brand" + name);
    }

}
// 실행 코드
public class OOP_250305 {
    public static void main(String[] args) {
        // new; 복습
        // 1.heap영역,  생명주기: 프로그램이 종료되거나 참조를 하지 않을 때까지
        // 2.메모리 공간은 코드가 실행되면서 할당

        // 2개의 차이
        // bar는 heap에 저장된다.
        int bar[] = new int[5];

        // car1은 stack에 저장된다.
        Car3 car1 = new Car3();
        Car3 car2 = new Car3();

        car1.name = "hyundai";
        car2.name = "teslar";

        car1.prtName();
        car2.prtName();

        // 객체를 참조하는 변수를 통해, . 연산자를 사용하여 객체의 멤버에 접근할 수 있다.
        // JAVA는 object 클래스 안에서 상속을 한다. 연산자 옆에 이외의 값들은 상속을 받은 것

    }
}