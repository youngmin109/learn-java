package OOP;

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
}

public class Student_manage {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 학생 수: ");
        int stdNum = sc.nextInt();

        StdScoreMgr stdMgr = new StdScoreMgr(stdNum);
        stdMgr.addStudent();

    }

}
// 확장,출력