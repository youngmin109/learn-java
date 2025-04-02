package uml;

import java.util.Scanner;


// 학생 클래스 정의

class SubjectInfo {
    String title;
    int score;
    SubjectInfo(String argTitle, int argScore) {
        title = argTitle;
        score = argScore;
    }
    SubjectInfo() {}
}

class Student {
    int id;
    String name;
    private static String university = "영진";
    SubjectInfo[] subList;
    int sum;
    float avg;

    Student(int subNum, String argName, int argId) {
        subList = new SubjectInfo[subNum];
        for(int i=0; i < subNum; i++) {

            System.out.println();

            subList[i] = new SubjectInfo();
        }
        name = argName;
        id = argId;
    }
    int getSum() {
        for (SubjectInfo temp : subList) {
            sum += temp.score;
        }
        return sum;
    }

    float getAvg() {
        avg = getSum() / subList.length;
        return avg; }
    static void prtUniversity() {
        System.out.println(university);
    }
    void setName(String argName) {  name = argName; };
}

public class UML_250402 {
    public static void main(String[] args) {

    }
}
