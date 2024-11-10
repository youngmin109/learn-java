package Java200.Chap04;

import java.util.Random;
import java.util.Scanner;

public class J4_30 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // 0 ~ 99 랜덤값 설정
        int randValue = rand.nextInt(100);

        // 숫자맞추기 게임
        // do-while문

        int inputValue = 0;
        do {
            System.out.print("0 ~ 99 숫자 맞춰봐!: ");
            inputValue = sc.nextInt();

            if (inputValue > randValue)
                System.out.println("더 작은 숫자입니다.");
            else if (inputValue < randValue)
                System.out.println("더 큰 숫자입니다.");
        } while (randValue != inputValue);


        System.out.print("맞췄습니다!");
        // <do> if문 큰 값인 경우
        // else 작은 경우

        // <while> 입력값과 랜덤값이 같을 때 까지


    }
}



