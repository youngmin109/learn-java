package oop.univ;

class Student5 {
    String name = "홍길동";
    int age = 20;

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }
}

// 캡슐화
public class OOP_250414 {
    int x;
    private int score;
    void prt() {
        System.out.println(x);
    }

    // Getter, Setter Method
    int getScore() {return score;}
    boolean setScore(int newScore) {
        if (newScore >= 0 && newScore <= 100) {
            score = newScore;
            return true;
        }
        return false;
    }
}
class Le232 {
    public static void main(String[] args) {
        Student5 std = new Student5();
        System.out.println("이름: " + std.name + ", 나이: " + std.age);
        System.out.println(std);

        OOP_250414 z = new OOP_250414();
        System.out.println(z.x); // 멤버변수 참조

        System.out.println(z.getScore());
        z.setScore(-100);
        System.out.println(z.getScore());
        z.setScore(50);
        System.out.println(z.getScore());

    }
}
