package TestReview;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // task1
        // N값을 입력받아 1차원배열 생성 (단, N은 1이상 10이하)
        Scanner sc = new Scanner(System.in);

        // 입력값 초기화
        int N = 0;
        // 무한반복
        while (true) {
            // N값을 입력받는다
            System.out.print("N값 입력(1 이상 10 이하): ");
            N = sc.nextInt();
            if (1 <= N && N <= 10) {
                break;
                // 1이상 10이하시 break
            }
        }
        // 입력값으로 1차원 배열 생성
        int bar[] = new int[N];

        // task2
        // 생성된 1차원 배열에 사용자로부터 값을 입력 받아 배열에 순차적으로 저장
        // 전체를 한번도는 반복문
        for (int i = 0; i < bar.length; i++) {
            // 순차적으로 값을 입력받는다
            int inputValue = sc.nextInt();
            bar[i] = inputValue;
        }

        sc.close();

        // task3
        // 현재 1차원 배열에 입력된 값을 역순으로 출력하라
        // 인덱스 끝 부터 감소하며 도는 반복문 작성
        for (int i = bar.length - 1; i >= 0; i--) {
            System.out.print(bar[i] + " ");
        }
    }
}
