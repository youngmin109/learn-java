package oop.study;

class Parent {
    void greet() {
        System.out.println("부모인사");
    }
}

class Child extends Parent {
    @Override
    void greet() {
        super.greet();
        System.out.println("자식만의 인사");
    }
}
public class Test {
    public static void main(String[] args) {
        Child t = new Child();
        t.greet();
    }
}
