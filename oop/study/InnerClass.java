package oop.study;

class Outer {
    int iv = 100;
    class InstanceInner {
        int iv = 200;

        void method1() {
            int iv = 300;
            System.out.println(iv);
            System.out.println(this.iv);
            System.out.println(Outer.this.iv);
        }
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // 인터클래스의 인스턴스를 생성하려면, 외부 클래스의 객체를 먼저 생성해야한다.
        Outer oc = new Outer();
        Outer.InstanceInner il = oc.new InstanceInner();

        System.out.println("il.iv : " + il.iv);
        System.out.println("Outer.StaticInner.cv: " + Outer.StaticInner.cv);

        // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("si.iv :" + si.iv);

        il.method1();
    }
}
