package Review;

import java.util.Scanner;

public class SrpReview2 {
    public static void main(String[] args) {
        // 가위, 바위, 보 게임 만들기
        Scanner sc = new Scanner(System.in);

        // 게임 관련 상수
        final String[] OPTIONS = {"Scissors","Rock", "Paper"};
        final int WIN_THRESHOLD = 7;
        final int LOSE_THRESHOLD = -7;

        // 변수 값 초기화
        int winCount = 0;
        int score = 0;

        // 무한루프
        while (true) {
            // 사용자 입력
            System.out.println("Scissors, Rock, Paper 중 하나를 입력하세요");
           String userInput = sc.next();

            // Switch 입력값 반환
            int userSelection = switch (userInput) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Quit" -> 3;
                default -> -1;
            };

            // 컴퓨터 값 설정
            int comSelection = (int) (Math.random() * 3);

            // 결과값 판별
            String result = "";
            if (userSelection == comSelection) {
                result = "무승부";
                winCount = 0;
            } else if ((userSelection == 0 && comSelection == 2) ||
                    (userSelection == 1 && comSelection == 0) ||
                    (userSelection == 2 && comSelection == 1)) {
                result = "승리";
                winCount++;
                // 삼항연산자
                score += (winCount >= 2) ? 3 : 1;
                if (winCount >= 2) System.out.println("보너스포인트 3점!");
            } else {
                result = "패배";
                score -= 1;
                winCount = 0;
            }

            // 예외처리
            // quit -> 게임종료
            if (userSelection == 3) {
                break;
            }
            // "Scissors, Rock, Paper" 이외 값은 재입력
            if (userSelection == -1) {
                System.out.println("Scissors, Rock, Paper 입력");
                continue;
            }
            // 결과값 출력
            // 배열 선언
            System.out.println("현재 점수: " + score);
            System.out.println(result + "\t사용자: " + userInput +
                    "\t 컴퓨터" + OPTIONS[comSelection]);

            // 게임종료 조건 추가
            if (score >= WIN_THRESHOLD) {
                System.out.println("win!! 게임 종료~");
                break;
            } else if (score <= LOSE_THRESHOLD) {
                System.out.println("패배ㅠㅠ 게임종료");
                break;
            }
        }
        sc.close();
    }
}
