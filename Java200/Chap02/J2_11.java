package Java200.Chap02;

import java.util.Random;

public class J2_11 {
    public static void main(String[] args) {
        // 한 자리 양의 정숫값을 랜덤으로 생성해서 표시
        // 한 자리 음의 정숫값을 랜덤으로 생성해서 표시
        // 두 자리 양의 정숫값을 랜덤으로 생성해서 표시

        Random rand = new Random();

        // 난수 생성
        int n1 = 1 + rand.nextInt(9);
        int n2 = -1 - rand.nextInt(9);
        int n3 = 10 + rand.nextInt(90);

        System.out.println("3개의 난수를 생성했습니다.");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
