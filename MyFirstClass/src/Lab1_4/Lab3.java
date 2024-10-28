package Lab1_4;
// Lab3 상수와 변수를 활용한 원 면적 구하기
public class Lab3 {
    public static void main(String[] args) {
        // 원의 반지름 값 초기화
        double radius = 5.0;

        // 원주율 값 초기화 (상수)
        final double PI = 3.14159;

        // 원의 면적 구하기
        double area = PI * radius * radius;

        // 결과 출력
        System.out.printf("원의 면적: %.2f%n" , area);
    }
}
