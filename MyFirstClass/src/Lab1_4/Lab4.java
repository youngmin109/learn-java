package Lab1_4;
// Lab4 형변환과 변수 사용
import java.util.*;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 나이를 입력 받고, int 변수에 저장
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        // 몸무게 입력 받고, double 변수에 저장
        System.out.print("몸무게를 입력하세요: ");
        double weight = sc.nextDouble();

        // 나이를 double 명시적 형변환하여 몸무게와 더한 결과 출력
        double sum_AgeWeight = (double)age + weight;
        System.out.println("나이를 double 로 변환한 후 몸무게와 더한 결과: " + sum_AgeWeight);

        // 몸무게를 int 타입으로 명시적 형변환하여 나이와 더한 결과를 출력
        int int_AgeWeight = (int)weight + age;
        System.out.println("몸무게를 int 로 변환한 후 나이와 더한 결과: " + int_AgeWeight);


        sc.close();
    }
}
