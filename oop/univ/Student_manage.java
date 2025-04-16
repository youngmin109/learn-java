package oop.univ;

import java.util.Scanner;


class Student2 {
    // ID, 이름, 국어, 영어, 수학, 합계점수, 평균
    int id;
    String name;
    private int scoreKorean;
    private int scoreEnglish;
    private int scoreMath;
    private int sum;
    private float avg;

    Student2(int argId, String argName) {
        id = argId;
        name = argName;
    }

    boolean setScore(int argKorean, int argEnglish, int argMath) {
        if(argKorean < 0 || argEnglish < 0 || argMath < 0) {
            return false;
        }

        if(argKorean > 100 || argEnglish > 100 || argMath > 100) {
            return false;
        }

        scoreKorean = argKorean;
        scoreEnglish = argEnglish;
        scoreMath = argMath;

        return true;
    }

    int getScoreKorean() {
        return scoreKorean;
    }

    int getScoreEnglish() {
        return scoreEnglish;
    }

    public int getScoreMath() {
        return scoreMath;
    }

    int getSum() {
        sum = scoreKorean + scoreEnglish + scoreMath;
        return sum;
    }

    float getAvg() {
        avg = (float)getSum() / 3;
        return avg;
    }
}

class StdScoreMgr{
    Student2[] stdList;
    int numOfStudents;

    StdScoreMgr(int argNumOfStudents){
        stdList = new Student2[argNumOfStudents];
        numOfStudents = argNumOfStudents;
    }

    void addStudent() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++) {

            System.out.println("ID 입력 : ");
            int stdId = sc.nextInt();

            System.out.println("이름 입력 : ");
            String stdName = sc.next();

            Student2 student = new Student2(stdId, stdName);

            System.out.println("국어 성적 입력 : ");
            int scoreKorean = sc.nextInt();

            System.out.println("영어 성적 입력 : ");
            int scoreEnglish = sc.nextInt();

            System.out.println("수학 성적 입력 : ");
            int scoreMath = sc.nextInt();

            if (student.setScore(scoreKorean, scoreEnglish, scoreMath)) {
                stdList[i] = student;
            }
        }
    }

    void printStudents() {
        System.out.println("===== 학생 성적 출력 =====");
        for (int i =0; i < numOfStudents; i++) {
            Student2 s = stdList[i];
            System.out.printf("ID: %d, 이름: $s\n", s.id, s.name);
            System.out.printf("국어: %d, 영어: %d, 수학: %d\n",
                    s.getScoreKorean(), s.getScoreEnglish(), s.getScoreMath());
            System.out.printf("합계: %d, 평균: %.2f\n",
                    s.getSum(), s.getAvg());
            System.out.println("-----------------------");
        }
    }
}

public class Student_manage {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 학생 수: ");
        int stdNum = sc.nextInt();

        StdScoreMgr stdMgr = new StdScoreMgr(stdNum);
        stdMgr.addStudent();
        stdMgr.printStudents();

    }

}
// 확장,출력