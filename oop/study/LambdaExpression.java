package oop.study;

public class LambdaExpression {
    public static void main(String[] args) {
//
//      Object obj = (a, b) -> a > b ? a: b; // 람다식. 익명객체


//      람다식은 함수형 인터페이스를 구현한 익명 클래스의 인스턴스이므로, 함수형 인터페이스가 필요하다.
        Object obj = new Object() { // 익명 클래스
            // 익명 클래스는 Object 클래스를 상속받는다.
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        // obj의 타입은 object이므로, obj.max()를 호출할 수 없다.

//        함수형 인터페이스가 필요하다.
//        int value = obj.max(3,5);

        // 람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스여야 한다.
        MyFunction f = (a, b) -> a > b ? a : b; // 람다식. 함수형 인터페이스를 구현한 익명 클래스


        int value = f.max(3, 5);

    }
}

@ FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만을 가져야 한다.
interface MyFunction {
    public abstract int max(int a, int b);
}