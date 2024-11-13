package eclips;

import java.util.Scanner;

public class Review1113 {
    // 매트릭스 메서드 생성
    public static void printMatrix(int argRows, int argCols, boolean deleteSingle, boolean deleteDouble) {
        for (int i = 0; i < argRows; i++) {
            for (int j = 0; j < argCols; j++) {
                // 2, 3번 조건 true 시 출력
                if ((deleteSingle && i == j) || (deleteDouble && argRows - (1 + i) == j)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 메뉴 문자열 정의
        final String MENU = """
                ====================
                메뉴를 선택하세요
                1. M X N Matrix를 출력
                2. 좌상단 -> 우하단 대각선 삭제 Matrix
                3. 좌상단 -> 우하단 + 우상단 -> 좌하단 대각선 삭제 Matrix
                4. 종료
                ====================
                """;

        // 카운트 변수 생성
        int count = 0;

        // 사용자 입력 변수
        int choice = 0;

        // 행과 열 입력받기
        int rows = 0, cols = 0;

        // 무한루프
        while (true) {

            // 메뉴출력
            System.out.println(MENU);

            // 예외처리
            while (true) {
                // 사용자 입력
                choice = sc.nextInt();
                // 1 ~ 4 예외 입력시 재입력
                if (1 <= choice && choice <= 4) {
                    break;
                }
                System.out.print("재입력: ");
            }

            // 4번 입력시 게임종료
            if (choice == 4) {
                System.out.println("게임종료");
                break;
            }

            // 행과 열 입력 받기
            while (true) {
                System.out.print("행 입력: ");
                rows = sc.nextInt();
                System.out.print("열 입력: ");
                cols = sc.nextInt();

                // 예외처리
                if (rows > 0 && cols > 0) {
                    break;
                }
                System.out.println("양수 입력");
            }

            // 선택에 따른 출력
            switch (choice) {
                // 1번 입력시
                case 1 -> printMatrix(rows, cols, false, false);

                // 2번 입력시
                case 2 -> printMatrix(rows, cols, true, false);

                // 3번 입력시
                case 3 -> printMatrix(rows, cols, true, true);
            }
            ;


            // 게임카운트 출력
            count++;
            System.out.println("현재 카운트" + count);
        }

        sc.close();
    }
}
