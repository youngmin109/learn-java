package oop.study;

class Baz {
    int myId;
    static int value;
    static int count;

        void setValue(int argValue) {
            value = argValue;
        }

        Baz() {
            myId = count++;
        }
    }

public class MiddleTest {
    public static void main(String[] args) {

        Baz b1 = new Baz();
        Baz b2 = new Baz();
        Baz b3 = new Baz();

        b3.setValue(10);

        System.out.println(b1.myId + ":" + b1.value);
        System.out.println(b2.myId + ":" + b2.value);
        System.out.println(b3.myId + ":" + b3.value);
    }
}
