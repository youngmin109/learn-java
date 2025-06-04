package oop.univ;

interface Test1 { void print(); }
class Outer1 {
    int outer_val = 1;

    Test1 print() {
        // Effectively constant
        int local_val = 2;
        class Inner implements Test1 {
            public void print() {
                System.out.println(outer_val); // 외부클래스의 멤버 참조 (링크를 만들어 참조)
                System.out.println(local_val); // 이때 캡쳐가 일어난다.
            }
        }
        return new Inner();
    }
}
public class OOP_250604 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Test1 test = outer.print();
        test.print();
    }
}
