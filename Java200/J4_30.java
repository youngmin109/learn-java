package Java200.Chap04;

import java.util.Random;
import java.util.Scanner;

public class J4_30 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // 숫자 맞추기 게임
        // 0~99 랜덤 숫자를 생성하고
        // 플레이가 입력할 수 있는 횟수 8회

        // 랜덤 숫자 생성
        int N = rand.nextInt(100);

        // 변수 값 초기화
        // 입력 횟수 카운트
        int inputCount = 0;
        int inputValue = 0;

        // do while 문
        // <do> 사용자 입력 ++카운트
        do {
            inputValue = sc.nextInt();
            inputCount++;
            // 큰 숫자일 경우
            if (inputValue > N) {
                System.out.println("더 작은 숫자 입니다.");
            }
            // 작은 숫자일 경우
            else if (inputValue < N) {
                System.out.println("더 큰 숫자 입니다.");
            }
            // <while> () 조건식 참일 경우 반복
        } while (inputCount < 8 && inputValue != N);

        // 카운트 종료 출력
        if (inputCount >= 8)
            System.out.print("아쉽네요. 정답은" + N + "입니다.");
            // 정답 출력
        else
            System.out.print("정답!");

        sc.close();
    }
}



