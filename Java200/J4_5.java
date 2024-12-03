package Java200.Chap04;

import java.util.Scanner;

public class J4_5 {
    public static void main(String[] args) {
        // 입력받은 정숫값부터 0까지 카운트다운하는 프로그램 작성
        // 카운트 다운 종료 후의 변숫값을 확인할 수 있게 할 것

        Scanner sc = new Scanner(System.in);
        System.out.println("카운트 다운 시작.");
        int x;
        do {
            System.out.print("양의 정숫값:");
            x = sc.nextInt();
        } while (x <= 0);

        while (x >= 0)
            System.out.println(--x);
        System.out.println("x의 값이 " + x + "이 됐습니다.");
    }
}
