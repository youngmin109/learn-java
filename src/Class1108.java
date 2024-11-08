
import java.util.Scanner;

public class Class1108 {
    public static void main(String[] args) {

        // 가위, 바위, 보 게임 만들기

        // 키보드로부타 Scissors, Rock, Paper를 입력받아,
        // 아래와 같이 결과를 출력하라
        // 예 1) 승리   - 사용자 : Scissors, 컴퓨터 : Paper
        // 예 2) 패배   - 사용자 : Scissors, 컴퓨터 : Rock
        // 예 3) 무승부  - 사용자 : Scissors, 컴퓨터 : Scissors

        // 고려사항
        // 1. 사용자로부터 입력 시 "Scissors, Rock, Paper" 이외 값은
        //    재입력 처리
        // 2. "Quit" 입력 전까지 계속해서 게임 실행
        // ++++
        // 3. 승리 시 보너스 포인트 1점 증가, 패배 시 보너스 포인트 1점 차감
        //    연속으로 승리 시 보너스 포인트 3점 추가
        // 4. 결과값 판별 후 현재 포인트 출력
        // 예) 현재포인트 : 1점
        // 5. 게임 종료 조건 추가
        //    사용자 포인트가 7점 이상 또는 -7점 이하이면 종료
        //    7점이상이면 : "축하합니다. 승리~" -7이하이면 "다음 기회에"

        Scanner sc = new Scanner(System.in);

        while (true) {
            // 사용자로부터 입력 : "Scissors, Rock, Paper"
            String inputValue = sc.next();

            int userSelection = switch (inputValue) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Quit" -> 3;
                default -> -1;
            };

            // Quit 입력 시 종료
            if (userSelection == 3) {
                System.out.println("프로그램 종료");
                break;
            }

            // "Scissors, Rock, Paper" 이외 값 입력 재입력
            if (userSelection == -1) {
                System.out.println("Scissors, Rock, Paper 중 하나를 입력하세요");
                continue;
            }

            // 컴퓨터 선택
            int computerSelection = (int) Math.random() * 3; // 0~2

            String result = "";

            // 결과값 판별
            if (userSelection == computerSelection) {
                result = "무승부";
            } else if ((userSelection == 0 && computerSelection == 2) ||
                    (userSelection == 1 && computerSelection == 0) ||
                    (userSelection == 2 && computerSelection == 1)) {
                result = "승리";
            } else {
                result = "패배";
            }

            // 결과값 출력
            String srpStrToInt[] = {"Scissors", "Rock", "Paper"};
            System.out.println(result + "\tUser : " + srpStrToInt[userSelection]
                    + "\tComputer : " + srpStrToInt[computerSelection]);
        }


    }
}
