package Studying.Review;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("삼각형 형성 불가");
        } else {
            if (a == b && a == c) {
                System.out.println("정삼각형");
            } else if (a == b || a == c || b == c) {
                System.out.println("이등변삼각형");
            } else {
                System.out.println("부등변삼각형");
            }
        }
    }
}
