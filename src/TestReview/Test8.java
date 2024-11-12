package TestReview;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // L1
        // 사용자로부터 M, inputN 정수를 입력받아, M X inputN Matrix를 출력하세요
        // 예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
        // 변수 값  초기화
        int inputM = 0, inputN = 0;

        // 사용자 입력 (재입력 무한루프)
        while (true) {
            inputM = sc.nextInt();
            inputN = sc.nextInt();
            if ((inputM > 0) && (inputN > 0)) {
                break;
            }
            System.out.println("양의 정수 입력");
        }
        // for 중첩문 출력
        for (int i = 0; i < inputM; i++) {
            for (int j = 0; j < inputN; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // L2
        // 문제는 동일, 출력값 변경

        // 변수 값 초기화
        int inputFirst = 0; // 자바에서 변수의 이름이 모두 대문자일 경우 -> 상수, 변수명이 암호화......
        int inputSecond = 0;

        // 사용자 입력 (재입력 무한루프)
        while (true) {
            inputFirst = sc.nextInt();
            inputSecond = sc.nextInt();
            if (inputFirst > 0 && inputSecond > 0) {
                break;
            }
            System.out.println("양의 정수 입력");
        }
        // for 중첩문 출력
        for (int i = 0; i < inputFirst; i++) {
            for (int j = 0; j < inputSecond; j++) {
                if (i == j) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

