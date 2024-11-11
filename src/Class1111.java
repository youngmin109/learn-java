import java.util.Scanner;

public class Class1111 {
    public static void main(String[] args) {

        // 가위, 바위, 보 게임을 구현
        // 사용자로부터 "Scissors, Rock, Paper" 를 입력
        // - "Scissors, Rock, Paper" 이외 값은 재입력 처리
        // 컴퓨터는 "Scissors, Rock, Paper" 중 하나를 랜덤하게 선택

        // 결과 값 출력:
        // 예) 승리 - 사용자 : 가위, 컴퓨터 : 보

        // "Exit"를 입력하기 전까지 계속해서 게임 실행
        // 보너스 점수 구현
        // 사용자 승리 시 : 1점, 패배 시 : -1
        // 연속 승리 시 : 3점 , 2-> 3 -> 4...
        // 보너스 점수가 7점 이상 또는 -7점 이면 종료
        // - 사용자 승리 : 보너스 점수 XX점
        // - 사용자 패배 : 보너스 점수 XX점

        Scanner sc = new Scanner(System.in);
        String[] srpNumber = {"Scissors", "Rock", "Paper" };

        // 변수 초기화 설정
        int winCount = 0; // 승리 카운트
        int score = 0; // 현재 포인트
        String userInput = "";
        int userScore = 0, cpuScore = 0, drawScore = 0;

        // 무한루프 - 게임시작
        while (true) {
            // 사용자로 부터 입력
            System.out.print("Scissors, Rock, Paper 중에 입력: ");
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

            // 컴퓨터 0~2 랜덤값 정수형으로 받기
            int comNumber = (int) (Math.random() * 3);

            // 결과값 판별
            String result = "";
            // 무승부
            if (userNumber == comNumber) {
                result = "무승부";
                winCount = 0; drawScore++;
            } else if // 승리
            ((userNumber == 0 && comNumber == 2) ||
                            (userNumber == 1 && comNumber == 0) ||
                            (userNumber == 2 && comNumber == 1)) {
                result = "승리";
                winCount++; // 승리시 카운트 up
                score += (winCount >= 2) ? 3 : 1; // true == 3, false == 1
                if (winCount >= 2) {
                    System.out.println("연속 승리 보너스 포인트!");
                } userScore++;
            }
            // 패배
            else {
                result = "패배";
                winCount = 0;
                score -= 1; comNumber++;
            }

            // 결과값 출력
            System.out.println("현재스코어: " + score + "\n"
                    + result + "\t사용자 - " + srpNumber[userNumber]
                    + " 컴퓨터 - " + srpNumber[comNumber] + "\n"+
                    "승리: " + userScore + " 패배: " + cpuScore + " 무승부: " + drawScore);

            // 게임종료 -7 또는 +7
            if (score <= -7 || score >= 7) {
                String resultMsg = (score <= -7) ? "게임 패배" : "게임 승리";
                System.out.print(resultMsg);
            }
        }
    }
}
