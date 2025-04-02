package oop;

class Foo {
    int x;
    Foo (int argX) { x = argX; }
        }

class Pos {
    void prtShow(Foo argFoo){
        System.out.println(argFoo.x);
        argFoo.x += 1;
    }
}


public class OOP_250326 {
    public static void main(String[] args) {

        Foo f1 = new Foo(2);
        Pos p1 = new Pos();
        p1.prtShow(f1);

        // . 옆에는 객체의 주소값이 들어가야한다.
        // 무명 객체 - 1회성으로 사용하고 그만
        (new Pos()).prtShow(f1);
        (new Pos()).prtShow(new Foo(1));


        // 즉, 참조 변수가 필요한 이유는
        // 1. 계속 그 객체를 쓰기 위해서
        // 2. GC에 제거되지 않기 위해서
    }
}
