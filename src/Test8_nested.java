import java.util.Scanner;

public class Test8_nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // L1
        // 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        // * *
        // * *
        // * *
        // 예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
        /*
        // M, N 사용자로 부터 입력받기
        int M = sc.nextInt(), N = sc.nextInt();

        // 중첩 반복분
        // M값 반복
        for (int i = 0; i < M; i++) {
            // N값 반복
            for (int j = 0; j < N; j++) {
                // * 출력
                System.out.print("*");
            }
            System.out.println();
        }
        // L2
        // 문제는 동일, 출력값 변경
        // 예) A : 3, B : 3
        //   * *
        // *   *
        // * *
        int A = sc.nextInt(), B = sc.nextInt();

        for (int i = 0; i < M; i++) {
            // N값 반복
            for (int j = 0; j < N; j++) {
                // * 출력
                if (i == j) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // L3
        // 문제는 동일, 출력값 변경
        // 예) M : 3, N : 3
        //   *
        // *   *
        //   *
        // 변수 초기화
        int inputValue1 = 0, inputValue2 = 0;

        while (true) {
            inputValue1 = sc.nextInt();
            inputValue2 = sc.nextInt();
            if (inputValue1 > 0 && inputValue2 > 0) {
                break;
            }
            System.out.println("재입력");
        }
        for (int i = 0; i < inputValue1; i++) {
            for (int j = 0; j < inputValue2; j++) {
                if (i == j || inputValue1 - 1 - i == j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        } */

        // L4
        // 입력값은 ROW, 홀수만 입력 가능, 짝수 입력 시 재입력
        // 따개거나, while문에 for문
        int inputRow = 0;

        // 짝수 시 재입력
        while (true) {
            inputRow = sc.nextInt();
            if (inputRow%2==1){
                break;
            }System.out.println("재입력");
        }

        for (int i = 0; i < (int)(inputRow/2); i++) {
            System.out.print("*");
            if (i == im) {
                System.out.println();
            }
        }
    }
}
