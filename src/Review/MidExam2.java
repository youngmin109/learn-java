package Review;

import java.util.Scanner;

public class MidExam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 연산자 배열 생성
        char[] items = {'+', '-', '*'};

        // 배열 생성
        char [] randArrays = new char [3];

        int gameScore = 0, gameRound = 1;

        while (true) {
            System.out.println(gameRound + "번째 게임");
            System.out.print("게임을 시작하려면 아무 값이나 입력");
            sc.next();

            // 랜덤하게 아이템 3개를 선택하여 1차원 배열에 저장
            for (int i = 0; i < randArrays.length; i++) {
                randArrays[i] = items[(int) (Math.random() * 3)];
            }

            // 점수 계산
            int comboPoint = 0;
            char selectedItem = 0;

            for (int i = 0; i < randArrays.length - 1; i++) {
                if (randArrays[i] == randArrays[i + 1]) {
                    comboPoint++;
                    selectedItem = randArrays[i];
                }
            }

            int itemPoint = 0;
            if (comboPoint == 1) {
                switch (selectedItem) {
                    case '+':
                        itemPoint = 1;
                        break;
                    case '-':
                        itemPoint = -1;
                        break;
                    case '*':
                        itemPoint = 2;
                        break;
                }
            } else if (comboPoint == 2) {
                switch (selectedItem) {
                    case '+':
                        itemPoint = 3;
                        break;
                    case '-':
                        itemPoint = -3;
                        break;
                    case '*':
                        itemPoint = 5;
                        break;
                }
            }
            gameScore += itemPoint;

            System.out.println("---------------------");
            for (char randValue : randArrays)
                System.out.print("\t" + randValue + "\t:");
            System.out.println("\n--------------------");
            System.out.println(selectedItem + (comboPoint + 1) +" combo - 보너스 점수 " + itemPoint + "획득!");
            System.out.println("현재 점수 " + gameScore);

            // 게임 종료 조건
            // 점수가 5 이상이면 "승리"
            if (gameScore >= 7) {
                System.out.println("승리");
                break;
                // 점수가 -5 이하이면 "패배"
            } else if (gameScore <= -7) {
                System.out.println("패배");
                break;
            }
            gameRound++; // 게임횟수 증가
        }
    }
}
