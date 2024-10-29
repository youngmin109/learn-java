package Review;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int age = sc.nextInt();

        String grade = "";

        if (age <= 12) {
            grade = "어린이";
        } else if (age <= 18) {
            grade = "청소년";
        } else {
            grade = "성인";
        }
        System.out.println(grade + "이용권을 사용할 수 있습니다." );
        sc.close();
    }
}
