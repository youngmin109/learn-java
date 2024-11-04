package Studying;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Test7_kaibaipo {
    public static void main(String[] args) {
        // 가위, 바위, 보 게임 만들기
        // 사용자로부터 Scissors, Rock, Paper 중 하나 입력
        //  - 예시 : Scissors, Rock, Paper 중 하나를 입력 하세요:
        // 컴퓨터가 난수를 이용해, 가위-바위-보 중 하나 선택
        // 결과 출력
        //  - 예 1) 승리 : 사용자 - 가위, 컴퓨터-보
        //  - 예 2) 패배 : 사용자 - 가위, 컴퓨터-바위
        //  - 예 3) 무승부 : 사용자 - 가위, 컴퓨터 가위
        // 그리고 게임 재실행

        // 사용자로부터 Scissors, Rock, Paper 입력 예외 처리
        //  - Scissors, Rock, Paper 이외의 값이 입력 될 경우
        //    "잘못된 입력 값 입니다, Scissors, Rock, Paper 중 하나를 입력 하세요"
        //    출력 후 재입력
        // "quit"를 입력하면 프로그램 종료

        Scanner sc = new Scanner(System.in);

        // 무한루프
        while (true) {

            System.out.println("Scissors, Rock, Paper 중 하나를 입력 하세요");
            String userInput = sc.nextLine();

            // 예외 처리
            // 1: quit 이면 -> 프로그램 종료 -> break
            // 2: 잘못된 입력 -> 재입력 -> continue
            if (userInput.equals("quit")) {
                break;
            }
            if (!userInput.equals("Scissors")&&!userInput.equals("Paper")&&!userInput.equals("Rock")){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            // 컴퓨터 선택 : 가위, 바위, 보 중 하나 선택
            // 난수 이용 : 0 ~ 2 사이 난수 발생 후 "가위, 바위, 보"에 매칭
            String sciRockPaer[] = {"Scissors", "Rock", "Papers"};

            int computerInput = (int) (Math.random() * 3);

            // switch expression 사용
            // 승패 계산
            int user = switch (userInput) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                default -> -1;
            };
            // 결과값 변수


            // 무승부
            if (user == computerInput) {

            }
        }
    }
}
