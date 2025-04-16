package oop.univ;

class Car {
    static String brand;
    int speed;

//    // 기본 생성자
//    Car() {
//        this.brand = "Unknown";
//        this.speed = 100;
//    }

    // 브랜드만 설정하는 생성자
    Car (String brand) {
        // this();
        this.brand = brand;
        System.out.println("브랜드 지정: " + brand + ", 속도: " + speed + "km/h");
    }

    // 브랜드와 속도를 설정하는 생성자
    Car (String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("브랜드: " + brand + ", 속도: " + speed + "km/h");

    }
    static void Inter() {
        String brand = "3dd";
        int speed = 3;
        System.out.println("sut");
    }
}


public class OOP_250317 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        // Car car1 = new Car(); // 기본생성자 호출
        Car car2 = new Car("Hyundai"); // 브랜드만 지정
        Car car3 = new Car("BMW", 120); // 브랜드와 속도 지정

        Car.Inter();
        Car.brand = "hello";
        car2.speed = 110;
    }
}