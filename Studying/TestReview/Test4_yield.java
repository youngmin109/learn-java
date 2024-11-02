package TestReview;

import java.util.Scanner;

public class Test4_yield {
    public static void main(String[] args) {

        int score = 75;
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> {
                if (score >= 75) yield "C+";
                else yield "C";
            }
            default -> "F";
        };
        System.out.println(grade);
    }
}
class review{
    public static void main(String[] args) {
        // 1이면 python 출력
        // 2이면 Java 출력
        // 3이면 C++ 출력
        // 4이면 javaScript 출력
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.close();
        // 조건에 따라 값을 반환 -> switch expression
        String lang = switch (value / 10) {
            case 1 -> "python";
            case 2 -> "Java";
            case 3 -> {if (value < 35) yield "C";
                    else yield "C++";}
            case 4 -> "javaScript";
            default -> "unknown";

        };
        System.out.println(lang);
    }
}