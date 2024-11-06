package Java200.Chap02;

import java.util.Scanner;

public class J2_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("삼각형의 넓이를 구합니다.");

        System.out.print("밑변: ");
        double width = sc.nextDouble();

        System.out.print("높이: ");
        double height = sc.nextDouble();

        // 넓이를 구해서 표시
        System.out.println("넓이는 " + (width * height / 2) + "입니다");
    }
}
