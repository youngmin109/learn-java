package oop.study;

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrrrr~");
    }

    void stop() {
        System.out.println("Stop, Qikkkkkk~");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // (car) 형변환 생략, upCasting
        // car.water() 에러, Car type의 참조변소로 water()를 호출 못한다.
        fe2 = (FireEngine)car; // downCasting
        fe2.water();
    }
}
