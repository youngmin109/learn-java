package MyFristJava;

import java.util.Scanner;

public class Class1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// L1
		// 사용자로부터 M, N 정수를 입력받아, M X N Matrix를 출력하세요
		// 예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
		// 변수 값  초기화
		int M = 0;
		int N = 0;
		
		// 사용자 입력 (재입력 무한루프)
		while (true) {
			M = sc.nextInt();
			N = sc.nextInt();
			if ((M > 0) && (N > 0)) {
				break;	
			} System.out.println("양의 정수 입력");
		}
		// for 중첩문 출력
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		// L2
		// 문제는 동일, 출력값 변경
	
		// 변수 값 초기화
		int A = 0;
		int B = 0;
		
		// 사용자 입력 (재입력 무한루프)
				while (true) {
					A = sc.nextInt();
					B = sc.nextInt();
					if ((A > 0) && (B > 0)) {
						break;	
					} System.out.println("양의 정수 입력");
				}
				// for 중첩문 출력
				for (int i = 1; i <= A; i++) {
					for (int j = 1; j <= B; j++) {
						if (i == j) {
							continue;
						}
						System.out.print("*");
					} System.out.println();
				}
				sc.close();
	}
} 

