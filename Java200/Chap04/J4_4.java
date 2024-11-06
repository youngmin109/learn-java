package Java200.Chap04;

import java.util.Scanner;

public class J4_4 {
    public static void main(String[] args) {
        // 2개의 정숫값을 읽어서 두 정수 사이에 있는
        // 모든 정숫값 작은 것부터 큰 순으로 표시
        Scanner sc = new Scanner(System.in);

        // 2개의 정수를 받는다.
        System.out.print("정수 A: "); int numA = sc.nextInt();
        System.out.print("정수 B: "); int numB = sc.nextInt();

        // A보다 B가 크다면 값을 교체
        if (numA > numB){
            int N = numA;
            numA = numB;
            numB = N;
        }

        do { // do문의 루프바디
            System.out.print(numA + " ");
            numA = numA + 1;
        } while (numA <= numB);
        System.out.println();
    }
}
