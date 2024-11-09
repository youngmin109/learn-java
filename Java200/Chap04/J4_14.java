package Java200.Chap04;

import java.util.Scanner;

public class J4_14 {
    public static void main(String[] args) {
        // 1부터 n까지의 합 구하기
        // 변수 초기화
        int sumValue = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);

        // n입력 받기 (do while)
        do {
            System.out.print("n의 값: ");
            n = sc.nextInt();
            // 양의정수 입력까지 반복
        } while (n <= 0);

        // for문으로 하나씩 출력하며 변수에 값 저장
        for (int i = 0; i <= n; i++) {
            sumValue += i;
        }

        // 출력
        System.out.print("1부터" + n + "까지의 합은" + sumValue);
    }

}

