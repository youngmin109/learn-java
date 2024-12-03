package Java200.Chap06;
// 점수를 입력받아서 합계, 평균, 최고점, 최저점을 표시

import java.util.Scanner;

public class J6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사람 수: ");
        int numPeople = sc.nextInt();
        int[] points = new int[numPeople];

        System.out.println("점수를 입력하세요.");
        int sum = 0;
        for (int i = 0; i < numPeople; i++) {
            System.out.print((i+1) + "번의 점수:");
            points[i] = sc.nextInt();
            sum += points[i];
        }

        int max = points[0];
        int min = points[0];
        for (int i = 0; i < numPeople; i++) {
            if (points[i] > max) max = points[i];
            if (points[i] < min) min = points[i];
        }
        System.out.println("합계는 " + sum + "점입니다.");
        System.out.println("평균은 " + (double) sum / numPeople + "점입니다.");
        System.out.println("최고점은 " + max + "점입니다.");
        System.out.println("최저점은 " + min + "점입니다.");
    }
}
