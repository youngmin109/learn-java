package oop.univ;

interface  KL { abstract void print(); }

class T {
    KL obj;
    T(KL obj) {
        this.obj = obj;
    }
    void prt() {obj.print();}
}

class P implements KL {
    @Override
    public void print() {
        System.out.println("P");
    }
}
class Q implements KL {
    @Override
    public void print() {
        System.out.println("Q");
    }
}
class Z implements KL {
    @Override
    public void print() {
        System.out.println("Z");
    }
}

public class OOP_250430 {
    public static void main(String[] args) {
        (new T(new P())).prt();
        (new T(new Q())).prt();
        (new T(new Z())).prt();
    }
}
