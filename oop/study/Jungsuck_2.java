package oop.study;

class Car2 {
    // 1) method area에 클래스 저장
    String color;
    String gearType;
    int door;

    Car2() {} // 기본 생성자

    Car2(String c, String g, int d) { // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}

public class Jungsuck_2 {
    public static void main(String[] args) {
        // 2) main() 메서드 실행되면서 Stack Frame 생성, args 스택에 저장
        Car2 c1 = new Car2(); // heap에 객체 생성 , c1은 stack에 저장
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car2 c2 = new Car2("white","auto",4);

        System.out.println("c1의 color=" + c1.color +
        "\ngearType=" + c1.gearType + "\ndoor=" + c1.door);
        System.out.println("c2의 color=" + c2.color +
                "\ngearType=" + c2.gearType + "\ndoor=" + c2.door);
    }
    // main() 종료시 stack frame 제거 , heap에 남아있던 Car2 객체들도 GC에의해 제거
}
