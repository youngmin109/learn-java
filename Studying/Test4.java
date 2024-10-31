import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // switch 문을 이용하여 아래 프로그램 작성
        // 키보드로부터 정수를 입력
        System.out.print("1~4 입력: ");
        int inputValue = sc.nextInt();
        sc.close();

        // 1이면 python 출력
        // 2이면 Java 출력
        // 3이면 C++ 출력
        // 4이면 javaScript 출력
        switch (inputValue) {
            case 1: {
                System.out.println("python");
                break;
            }
            case 2: {
                System.out.println("Java");
                break;
            }
            case 3: {
                System.out.println("C++");
                break;
            }
            case 4: {
                System.out.println("javaScript");
                break;
            }
        }
    }
}
