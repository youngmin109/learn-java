package Lab1_4;
import java.util.Scanner;
// Lab1 자료형 선택 및 활용
public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 나이 입력 (정수형)
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        // 키 입력 (소수점 포함)
        System.out.print("키를 입력하세요: ");
        double height = sc.nextFloat();

        // 신용정수 입력 (정수형)
        System.out.print("신용점수를 입력하세요:");
        int creditPoints = sc.nextInt();

        // 합계 및 평균 값 저장
        double sum = age + height + creditPoints;
        double avg = sum / 3;

        // 합계 출력
        System.out.println("합계: " + sum);
        // 평균 출력
        System.out.println("평균: " + avg);

        sc.close();
    }
}
