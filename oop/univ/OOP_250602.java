package oop.univ;

interface myInterface { void prt();}

class Outer {
    int outer_val = 1;

    class Inner { // Inner class
        int inner_val = 2;

        void prt() { System.out.println(outer_val); }
        void set_val(int val) { outer_val = val;}
    }

    void prtSomething() {
        class test implements myInterface {
            public void prt() {
                int local_val = 1;
                System.out.println(outer_val + local_val);
            }
        }

        return new test();

        // test test = new test();
        // test.prt(); // local inner class
    }
}

public class OOP_250602 {
    public static void main(String[] args) {
        Outer outer1 = new Outer();
        Outer.Inner inner1 = outer1.new Inner();
        Outer.Inner inner2 = outer1.new Inner();

        myInterface ifs = new Outer().prtSomething();
        ifs.prt();


    }
}
