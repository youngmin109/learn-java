package oop.univ;

class ElectronicDevice // extends Object 자동으로 추가
{
    ElectronicDevice() {
        System.out.println("생성자 호출");
    }
}

class Computer extends ElectronicDevice {
}

class SmartPhone extends ElectronicDevice {
    SmartPhone() {
        System.out.println("스마트폰 생성자 호출");
    }

}

class Desktop extends Computer {

}

class Laptop extends Computer {

}

class AndroidPhone extends SmartPhone {
    AndroidPhone() {
        super ();
        System.out.println("안드로이드폰 생성자 호출");
    }
}

class IPhone extends SmartPhone {
    IPhone() {
        System.out.println(" 기본 생성자 호출 ");
    }
    IPhone(int m) {
        this();
        System.out.println(m + " 생성자 호출 ");
    }

    IPhone(int m, int n) {
        this();
        System.out.println(m + n + "생성자 호출");
    }
}

public class OOP_250407 {
    public static void main(String[] args) {
        new AndroidPhone();
        new IPhone(2025,5);
    }
}
