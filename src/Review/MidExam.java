package Review;

import java.util.Scanner;

public class MidExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 연산자 배열 생성
        char[] items = {'+', '-', '*'};
        char seletedItem = 0;
        // 배열 생성
        int[] randArrays = new int[3];
        // 변수 초기화
        int gameScore = 0, gameRound = 1, itemPoint = 0;

        // 게임 시작
        while (true) {
            System.out.println(gameRound + "번째 게임");
            // 사용자로부터 아무키나 입력
            System.out.print("게임을 시작하려면 아무 값이나 입력");
            sc.next();

            // 랜덤하게 아이템 3개를 선택하여 1차원 배열에 저장
            for (int i = 0; i < randArrays.length; i++) {
                randArrays[i] = (int) (Math.random() * 3);
            }

            // 점수 계산
            int comboPoint = 0; // 매번 초기화

            // 점수 계산
            for (int i = 0; i < randArrays.length - 1; i++) {
                if (randArrays[i] == randArrays[i + 1]) {
                    comboPoint++;
                    // 연속된 문자 종류 저장
                    seletedItem = items[i];
                }
            }
            // 연속된 연산자가 두 개일 경우
            if (comboPoint == 1) {
                switch (seletedItem) {
                    case '+':
                        itemPoint = 1;
                        gameScore += itemPoint;
                        break;
                    case '-':
                        itemPoint = -1;
                        gameScore += itemPoint;
                        break;
                    case '*':
                        itemPoint = 2;
                        gameScore += itemPoint;
                        break;
                }
            }
            // 연속된 연산자가 세 개일 경우
            else if (comboPoint == 2) {
                switch (seletedItem) {
                    case '+':
                        itemPoint = 3;
                        gameScore += itemPoint;
                        break;
                    case '-':
                        itemPoint = -3;
                        gameScore += itemPoint;
                        break;
                    case '*':
                        itemPoint = 5;
                        gameScore += itemPoint;
                        break;
                }
            }

            // 항목 출력
            System.out.println("-------------------------");
            for (int randValue : randArrays)
                System.out.print("\t" + items[randValue] + "\t:");
            System.out.println("\n------------------------");
            System.out.println(seletedItem + (comboPoint + 1) +" combo - 보너스 점수 " + itemPoint + "획득!");
            System.out.println("현재 점수 " + gameScore);

            // 게임 종료 조건
            // 점수가 5 이상이면 "승리"
            if (gameScore >= 5) {
                System.out.println("승리");
                break;
                // 점수가 -5 이하이면 "패배"
            } else if (gameScore <= -5) {
                System.out.println("패배");
                break;
            }
            gameRound++; // 게임횟수 증가
        }
    }
}

