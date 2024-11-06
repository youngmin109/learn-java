package Java200.Chap03;

import java.util.Scanner;

public class J3_8 {
    public static void main(String[] args) {
        // 입력한 정숫값이 5로 나누어떨어지면 통과, 아니면 재입력
        Scanner sc = new Scanner(System.in);
        // 무한반복
        while(true){
            // 값을 입력받는다
            int inputValue = sc.nextInt();
            // 조건, 그 값이 5로 나누어 떨어지면 break
            if(inputValue%5==0){
                break;
            }
            System.out.println("5로 나누어 떨어지지 않습니다.");
            // 안 떨어지면 반복

        }

        // 무사통과
        System.out.println("yes 통과");
        // 정리
        sc.close();
    }
}
