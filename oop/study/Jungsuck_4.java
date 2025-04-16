package oop.study;
// 매우 중요하니 메모리 구조를 그려보자!

public class Jungsuck_4 {
    public static void main(String[] args) {
         Point3D p3 = new Point3D();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point1 {
    int x = 10;
    int y = 20;

    Point1(int x, int y) {


        super(); //compiler
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point1 {
    int z = 30;

    Point3D() {
        this (100, 200, 300);
    }
    Point3D(int x, int y, int z) {
        super(x, y); // point 호출
        this.z = z;
    }

}