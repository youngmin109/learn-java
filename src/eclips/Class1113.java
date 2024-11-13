package eclips;

import java.util.Scanner;

public class Class1113 {
	public static void printDiagonalMatrix(int argRow, int argCol, boolean deleteSingle, boolean isBidirectional) {
		for (int i = 0; i < argRow; i++) {
			for (int j = 0; j < argCol; j++) {
				if (isBidirectional) {
					if (i == j) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
					
				} 
				else { 
					if (i == j || argRow - (1 + i) == j) {
						System.out.print(" ");
						} else {
						System.out.print("*");
						}
				}
			} 
			System.out.println();
		} 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 메뉴를 선택하세요
		// 1번째 실행 // 게임 실행 횟수 출력
		// 1. M X N Matrix를 출력
		// 2. 좌상단 -> 우하단 대각선 삭제 후 M X N Matrix 출력
		// 3. 좌상단 -> 우하단 + 우상단 -> 좌하단 대각선 삭제 후 M X N Matrix 출력
		// 4. 종료

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
		
		// 변수 초기화
		int count = 0;

		
		while (true) {
			// 메뉴 출력
			System.out.println(MENU);
			System.out.println("현재 게임카운트" + count);
//		
			// 사용자 입력
			int choice = 0;
			while (true) {
				choice = sc.nextInt();
				// 1 ~ 4 이외 값 예외 처리
				if (choice >= 1 && choice <= 4) {
					break;
				}
				System.out.println("재입력");
			}

			// 4번 선택 시 프로그램 종료
			if (choice == 4) {
				System.out.println("게임종료");
				break;
			}

			// M값 N값 입력받기
			int rows = 0, cols = 0;

			// 음수 입력시 재입력
			while (true) {
				System.out.print("M값 입력 (행): ");
				rows = sc.nextInt();
				System.out.print("N값 입력 (줄): ");
				cols = sc.nextInt();

				if (rows > 0 && cols > 0)
					break;
			}

			// 값에 따른 출력
			switch (choice) {
			// 1번 선택 시 1번 프로그램 실행
			case 1 -> printDiagonalMatrix(rows, cols, true);
			// 2번 선택 시 2번 프로그램 실행
			case 2 -> printDiagonalMatrix(rows, cols, true);
			// 3번 선택 시 3번 프로그램 실행
			case 3 -> printDiagonalMatrix(rows, cols, false);
			};
			
			count++; // 게임카운트 ++
		}
	}
}