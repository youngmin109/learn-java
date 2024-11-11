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

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
