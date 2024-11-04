package Studying;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 변수 초기화
        int N = 0;

        // Task1
        // 반복문 사용하여 N값 입력
        while (true) {
            System.out.print("N값 입력: ");
            N = sc.nextInt();
            // 조건문 N값 1이상 10이하
            if (1 <= N && N <= 10) {
                break;// 반복 탈출
            }
        }

        // Task2
        // 생성된 1차원 배열에 사용자로부터 값을 입력 받아 배열에 순차적으로 저장
        // 배열에 값 할당
        int bar[] = new int[N];
        int count = 0; // 반복 카운트

        // for문으로 입력된 값으로 배열에 저장
        for (int i = 0; i < bar.length; i++) {
            // 무한반복
            while (true) {
                // 사용자로부터 값 입력
                int inputValue = sc.nextInt();
                // 입력받은 값이 양수인 경우이면
                if (inputValue > 0) {
                    // 현재 인덱스에 값을 저장
                    bar[i] = inputValue;
                    // 반복문 탈출
                    break;
                }
            }
        }
        // Task3
        // 현재 1차원 배열에 입력된 값을 역순으로 출력하라
        // 반복문
        for (int i = bar.length - 1; i >= 0; i--) {
            // 배열의 값을 역순으로 출력
            int value = bar[i];
            System.out.print(value + " ");
        }
    }
}

