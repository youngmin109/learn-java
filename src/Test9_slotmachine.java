import java.util.Scanner;

public class Test9_slotmachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 슬롯 개수 입력
        // 사용자로부터 3~7 사이의 정수를 입력받는다
        // 입력값이 유효하지 않으면 오류메세지 출력 및 재입력
        char[] bar = {'+', '-', '*'};
        int inputValue = 0, roundCount = 1, score = 0;
        while (true) {
            System.out.print("3~7사이의 정수 입력: ");
            inputValue = sc.nextInt();
            if (3 <= inputValue && inputValue <= 7) {
                break;
            }
            System.out.println("Invalid input. Please enter a number between 3 and 7.");
        }
        // 연산자 배열 생성
        int[] randSlot = new int[inputValue];

        // 게임 시작
        while (true) {
            System.out.println("-----" + "Round " + roundCount + "-----");
            System.out.print("아무키 입력시 게임 시작");
            sc.next(); // 아무키 입력시 게임 시작

            // 랜덤 슬롯 결과 생성
            for (int i = 0; i < randSlot.length; i++) {
                randSlot[i] = (int) (Math.random() * 3);
            }
            // 슬롯결과 출력
            for (int value : randSlot) {
                System.out.print(bar[value] + ", ");
            }

            // 결과 판별
            // 변수 초기화
            int contiguousCount = 1;
            int bonusPoint = 0;

            for (int i = 0; i < randSlot.length; i++) {
                // 연속된 연산자 발생 시 카운트 ++
                if (i < randSlot.length - 1 && randSlot[i] == randSlot[i + 1]) {
                    contiguousCount++;
                } else { // 연속된 연산자가 끝난 경우
                    if (contiguousCount == 2) {
                        switch (bar[randSlot[i]]) {
                            case '+':
                                bonusPoint += 1;
                                break;
                            case '-':
                                bonusPoint -= 1;
                                break;
                            case '*':
                                bonusPoint += 2;
                                break;
                        }
                    } else if (contiguousCount >= 3) {
                        switch (bar[randSlot[i]]) {
                            case '+':
                                bonusPoint += 3;
                                break;
                            case '-':
                                bonusPoint -= 3;
                                break;
                            case '*':
                                bonusPoint += 5;
                                break;
                        }
                    }
                }
                score += bonusPoint;
            }
            System.out.println("Group Scores: " + bonusPoint);
            System.out.println("Total Score: " + score);
            // 종료 조건
            if (bonusPoint >= 5) {
                System.out.println("게임 승리");
                break;
            } else if (bonusPoint <= -5) {
                System.out.println("게임 패배");
                break;
            } roundCount++;
        }
    }
}
