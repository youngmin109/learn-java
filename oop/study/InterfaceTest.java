package oop.study;

class A1 {
//    public void method(B1 b) {
//        b.method();
//    }
    public void method(I i) {
        i.method();
    } // A의 변화가 필요없다.
}
//
//class B1 {
//    public void method() {
//        System.out.println("B클래스의 메서드");
//    }
//}

// B클래스의 선언과 구현을 분리
interface I {
    public void method();
}

class B1 implements I {
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C1 implements I {
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A1 a = new A1();
        a.method(new B1()); // A가 B를 사용 (의존) A가 B에 의존
        a.method(new C1());
    }
}
