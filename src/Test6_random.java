
import java.util.Scanner;

public class Test6_random {
    public static void main(String[] args) {
        // 키보드로부터 정수 N을 입력 받아
        // N개의 정수형 원소를 가지는 1차원 배열을 생성하라
        // 만약 N이 0또는 음의 정수이면 재입력
        Scanner sc = new Scanner(System.in);
        // N값 초기화
        int N = 0;

        // 무한반복
        while (true) {
            // N 입력
            System.out.print("N값 입력: ");
            N = sc.nextInt();
            if (N > 0) {
                break;
            }
            System.out.println("양수 값만 입력!");
            // N이 양수일 경우에만 탈출
        }
        // N개의 정수형 원소를 가지는 1차원 배열 생성
        int bar[] = new int[N];

        // 변수 초기화 start / end
        int start = 0, end = 0;

        // 무한반복
        while (true) {
            // 사용자로부터 start / end 값 입력받는다
            System.out.print("start 값: ");
            start = sc.nextInt();
            System.out.print("end 값: ");
            end = sc.nextInt();
            // (end - start + 1) 값이 배열의 크기 N보다 크거나 같을경우 탈출
            if (N <= (end - start + 1)) {
                break;
            }
            System.out.println("end - start + 1이 N보다 크거나 같아야 해!");
        }

        // start <= 난수 값 <= end 범위의 난수를 생성하여 배열에 저장
        // math.random 사용하여
        // * (end - start + 1) + min
        // 원소 개수 만큼 저장해야하니까 반복문 사용
        for (int i = 0; i < bar.length; i++) {
            bar[i] = (int) (Math.random() * (end - start + 1)) + start;

            // 생성된 배열의 모든 원소 값 출력
            // for - each문으로 한 번에 값 출력
            for (int value : bar) {
                System.out.print(value + " ");
            }

            sc.close();

            // 사용자로부터 난수 범위를 지정할 start, end 값을 입력받아,
            // start <= 난수 값 <= end 범위의 난수를 생성하여 배열에 저장하라.
            // 단, (end - start + 1) 값이 배열의 크기 N보다 작을 경우
            // 다시 입력을 요구한다.
            // 예) N = 5 -> 5개의 원소를 가지는 1차원 배열 생성
            //     start = 10, end = 12 -> 배열 원소는 10, 11, 12 중 하나의 값이어야 함
            // 생성된 배열의 모든 원소 값을 출력하라.
        }
    }
}

/*
교수님 코드

Scanner sc = new Scanner(system.in);

int numOfElements = 0;

// 재입력은 무조건 무한루프
while (true) {
    numOfElements = sc.nextInt();
    if


int start = sc.nextInt();
int end = sc.nextInt();


 */
