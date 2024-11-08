package Review;

import java.util.Scanner;

public class SrpReview {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 무한반복
        while (true) {

            // 유저값 입력
            String userInput = sc.nextLine();

            // Switch문
            int userSelection = switch (userInput) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Quit" -> 3;
                default -> -1;
            };

            // 예외처리
            if (userSelection == 3) {
                break;
            }
            if (userSelection == -1) {
                System.out.println("Scissors, Rock, Paper 중 하나를 입력하세요");
                continue;
            }

            // 컴퓨터 선택
            int computerInput = (int) (Math.random() * 3);
            // 결과값 판별
            String result = "";
            // 무승부
            if (computerInput == userSelection) {
                result = "무승부";
            } else if ((userSelection == 0 && computerInput == 2) ||
                    (userSelection == 1 && computerInput == 0) ||
                    (userSelection == 2 && computerInput == 1)) {
                result = "승리";
            } else {
                result = "패배";
            }
            // 결과값 출력
            String srpStrInput[] = {"Scissors", "Rock", "Paper"};
            System.out.println(result + "\tUser : " + srpStrInput[userSelection]
                    + "\tComputer: " + srpStrInput[computerInput]);

        }

    }
}
