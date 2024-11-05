package Studying.JungQuiz;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {

        // 나이 입력
        // 이용권 판별 후 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("사용자의 나이를 입력해주세요: ");
        int age = sc.nextInt();

    

        String grade = "";
        if (age <= 12) {
            System.out.print("어린이 이용권을 사용할 수 있습니다.");
        } else if (age <= 18) {
            System.out.print("청소년 이용권을 사용할 수 있습니다.");
        } else {
            System.out.print("성인 이용권을 사용할 수 있습니다.");
        }
    }

}
