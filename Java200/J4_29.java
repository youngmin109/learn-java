package Java200.Chap04;

import java.util.Scanner;

public class J4_29 {
    public static void main(String[] args) {

        // 정수값을 그룹별로 읽어서 합산 (정수 5개 X 10그룹 )
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 더합니다.");
        int total = 0;  // 전체 그룹의 합계

        // 레이블 지정문은 어디까지나 다른 코드를 해석하기 위해 배운다.
        // 쓰지않는것을 지향
    Outer:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "그룹");

            for (int j = 0; j < 5; j++) {
                System.out.print("정수: ");
                int t = sc.nextInt();
                if (t == 99999)
                    break Outer;
                else if (t == 88888)
                    continue Outer;
                total += t;
            }
        }
        System.out.println("\n합계는 " + total + "입니다.");
    }
}
