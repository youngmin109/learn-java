package Review;

import java.util.Scanner;

public class SrpReview3 {
    public static void main(String[] args) {
        // 가위, 바위, 보 게임을 구현
        // 사용자로부터 "Scissors, Rock, Paper" 를 입력
        // - "Scissors, Rock, Paper" 이외 값은 재입력 처리
        // 컴퓨터는 "Scissors, Rock, Paper" 중 하나를 랜덤하게 선택

        // 결과 값 출력:
        // 예) 승리 - 사용자 : 가위, 컴퓨터 : 보

        // "Exit"를 입력하기 전까지 계속해서 게임 실행

        Scanner sc = new Scanner(System.in);
        // 변수 초기화 설정
        String userInput = "";

        // 무한루프 - 게임시작
        while (true) {
            // 사용자로 부터 입력
            userInput = sc.next();

            // 입력값 설정 (switch)
            int userNumber = switch (userInput) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Quit" -> 3;
                default -> -1;
            };

            // 예외 처리
            // 1. "Scissors, Rock, Paper" 이외 입력
            if (userNumber == -1) {
                System.out.println("Scissors, Rock, Paper 중 입력");
                continue;
            }
            // 2. "Quit" 입력 시 반복 종료
            if (userNumber == 3) {
                System.out.println("게임 종료!");
                break;
            }

            // 컴퓨터 값 설정
            int comNumber = (int)(Math.random() * 3);

            // 결과값 판별
            String result = "";
            // 무승부
            if (userNumber == comNumber) result = "무승부";
                // 승리
            else if ((userNumber == 0 && comNumber == 2) || (userNumber == 1 && comNumber == 0) || (userNumber == 2 && comNumber == 1))
                result = "승리";
                // 패배
            else result = "패배";

            // 결과값 출력
            // 배열 설정
            String[] srpNumber = {"Scissors", "Rock", "Paper" };
            System.out.println(result + "\t사용자: " + srpNumber[userNumber]
                    + "\t컴퓨터" + srpNumber[comNumber]);
        }
    }
}