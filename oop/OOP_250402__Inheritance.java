package oop;

class Student4 {
    int id = 2;
    String name = "Student";
    int age;
    static String university;
    String major;
}

class GscStudent extends Student4 {
    int id = 20;
    String name = "GscStudent";
    GscStudent() {
        System.out.println("id: " + this.id + ", name: " + super.name + ", age: " + age);}
}
class MechanicStudent extends Student4 {
    MechanicStudent() { major = "기계과"; }
}


public class OOP_250402__Inheritance {
    public static void main(String[] args) {
        GscStudent s = new GscStudent();
        s.id = 1;
        s.name = "홍길동";
        Student4.university = "yju";
    }

}
