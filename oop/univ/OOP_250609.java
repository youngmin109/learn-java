package oop.univ;

class Outer2 {
    int outer_val = 1;

    void doSomething() {
        int local_var = 2; // doSomething의 stack에 위치
        class Bar {
            void prt() {
                System.out.println(); // 지역 변수 캡쳐
                System.out.println(Outer2.this.outer_val); // 외부 클래스 멤버 참조
            }

            Bar bar = new Bar(); // Bar 인스턴스 Heap에 저장됨
            // -> 이 때 local_var 지역변수를 캡쳐함 effectively final
        }
    }
}
public class OOP_250609 {
    public static void main(String[] args) {
        new Outer2().doSomething();
    }
}
