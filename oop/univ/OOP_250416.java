package oop.univ;

import src.Class1128;


public class OOP_250416 {
    public static void main(String[] args) {

        src.Class1128 u = new Class1128();
        System.out.println(u.num);
        System.out.println();
        // System.out.println(u.bar);
        // System.out.println(u.foo);

        test t = new test();
        // t.show();

        // System.out.println(t.test1.bar);
        System.out.println(t.test1.num);
    }
}

class test extends Class1128 {
    int x;
    src.Class1128 test1 = new Class1128();
}
