package oop.univ;

abstract class Fuz {
    // 추상메서드 -> 미완성 메서드
    abstract void prt();
}

abstract class Baz extends Fuz {

}
 // 부모 클래스(또는 인터페이스)로부터
// 상속받은 메서드를 재정의한다는 걸 컴파일러에게 명시적으로 알려주는 어노테이션(annotation)

class Caz extends Baz {
    @Override
    void prt() {
        System.out.println("hello world");
    }
}
public class OOP_250423 {
    public static void main(String[] args) {

        Caz p = new Caz();
        p.prt();
    }
}
