package oop.study;

class A { int value = 1; }
class B extends A {
    int value;
    B(int value) {
        this.value = value;
    }
}
class C extends A { int value = 3; }
class D extends B {
    int value = 4;
    D() {
        super(3);
    }
    void prtValue() {
        System.out.println(super.value);
        System.out.println(value);
    }
}

public class Test {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        d.prtValue();
    }
}