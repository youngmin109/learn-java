package oop;

class A {
    int a = 1;
    void prt(){
        System.out.println("안녕하세요");
    }
}
class B extends A{
    int a = 2;
    void prt(){
        super.prt(); // 부분 재정의와 // 완전 재정의
        System.out.println("hello");
   }
}
class C extends B{
    int a = 3;


    void prt() {
        System.out.println(a);
    }
}

public class OOP_250409 {
    public static void main(String[] args) {
        new A().prt();
        new B().prt();
        C bar = new C();  // 객체는 부모 클래스를 상속 받았기에, 최상위 클래스 부터 만들어진다.
        System.out.println(bar.a);
        System.out.println(((B)bar).a);
        System.out.println(((A)bar).a);   // (A) (B) 형변환, 참조변수의 자료형

        System.out.println((Object)bar);
        System.out.println(bar.toString());
        System.out.println(bar);


        new B().prt();
    }
}
