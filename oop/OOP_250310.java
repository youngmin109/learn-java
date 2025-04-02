package oop;


class Student {
    // 데이터 + 함수
    int korean;
    int math;
    int english;
    int sum;
    final int NUM_OF_SUBJECT = 3;




    int id;
    String name;

    void setGrade(int argKorean, int argMath, int argEnglish) {
        // 값을 반환하지 않는 메서드 == void
        korean = argKorean;
        math = argMath;
        english = argEnglish;
        sum = korean + math + english;
    }

    double getsum() {
        return sum;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getAvg() {
        return sum / NUM_OF_SUBJECT;
    }
}

public class OOP_250310 {
    public static void main(String[] args) {

        Student stdList[] = new Student[10];

        stdList[0] = new Student();
        stdList[1] = new Student();
        stdList[2] = new Student();
        stdList[3] = new Student();
    }
}
