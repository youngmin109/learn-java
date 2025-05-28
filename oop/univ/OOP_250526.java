package oop.univ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
class Bon implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Bon - close");

        // 자원 정리 중 예외 발생을 테스트 하려면 아래 주석 해제
       // throw new Exception("Boo 자원 정리 중 예외 발생");
    }
}

public class OOP_250526 {
    public static void main(String[] args) throws Exception {
        // AutoCloseable 인터페이스를 구현한 자원 클래스


        // 다형성 적용
        AutoCloseable res = new Bon();

        // Try-with-resource 사용
        try (res) {
            // 자원 사용
        }

        // try 블록 종료 시
        // JVM이 res.close() 호출
        // -> 다형성과 동적 바인딩에 의해 Bar 클래스의 close()가 실행 됨

        try (Bon bon = new Bon()) {
            System.out.print("숫자를 입력하세요 (1: 정상 실행, 그 외: IOException 발생): ");
            int input = new Scanner(System.in).nextInt();

            if (input == 1) {
                System.out.println("try블록 정상 실행");
            } else {
                // 일부러 IOException 발생
                throw new IOException("입력값이 1이 아님");
            }

        } catch (IOException e) {
            // IOException이 발생한 경우 (입력값이 1이 아닌 경우)
            System.out.println("catch - IOExceptionL: " + e.getMessage());

            // 억제된 예외(suppressed exception)가 있는 경우 출력
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("-> Suppressed: " + suppressed);
            }

        } catch (Exception e) {
            // 기타 Exception 처리 (Bar.close() 중 발생할 수 있음)
            System.out.println("catch - Exception: " + e.getMessage());
        }
    }
}
