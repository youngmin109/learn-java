package oop.study;

class Point {
    int x;
    int y;
}

//class Circle extends Point { // 상속
//    int r;}

class Circle {
    Point p = new Point();
    int r;
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
//        c.x = 1;
//        c.y = 2;
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
        System.out.println("c.x=" + c.p.x);
        System.out.println("c.y=" + c.p.y);
        System.out.println("c.r=" + c.r);
    }
}
