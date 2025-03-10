package OOP;

class Bar {

    String name;
    int age;

    // 생성자 : 이름이 클래스명과 동일, 반환형이 없다.
    Bar(String argName, int argAge) {
        argName = name;
        argAge = age;
    }

    void printInfo() {
        System.out.println(name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Bar b1 = new Bar();
        // 1. Bar 클래스에 객체를 하나 생성하라? -> 우리가 생각하는 것.
        // + 2. Bar 클래스 안에 생성자를 호출하라
        // new Bar -> 1 () -> 2

        Bar b1 = new Bar("Richard", 25);
        b1.printInfo();
        // 생성자가 쓰이는 이유
        // 객체 생성시 딱 한번 사용
        // 반환값이 있으면 안된다. 왜? -> 객체의 주소가 반환

        // 생성자의 종류는 2가지로 나뉜다.
        // 1. Default Constructor 2. Parameter Constructor
        // 1 - 생성자 안의 매개변수가 0개
        // 2 - 1개 이상의 매개변수
        // * JAVA에서는 생성자가 없으면 Default 값을 자동으로 집어 넣는다.
    }
}
