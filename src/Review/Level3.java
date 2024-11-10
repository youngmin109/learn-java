package Review;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 정보 입력
        // 나이 입력
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        // 이벤트 코드 입력
        System.out.print("예약하려는 이벤트 코드를 입력하세요: ");
        String eventCode = sc.next();

        // 날짜 입력 (1~30 이외는 재입력)
        int date = 0;
        while (true) {
            System.out.print("원하는 예약 날짜를 입력하세요: ");
            date = sc.nextInt();
            if (1 <= date && date <= 30) {
                break;
            }
            System.out.println("1~30 입력");
        }

        // 큰 규칙은 코드이므로 코드로 Switch 코드작성
        // E1 코드
        switch (eventCode) {
            case "E1":
                if (age < 18) {
                    System.out.println("나이 제한으로 예약할 수 없습니다.");
                } else {
                    System.out.println("예약이 완료 되었습니다.");
                }
                break;
            case "E2":
                if (date % 2 != 0) {
                    System.out.println("선택하신 날짜에는 예약 할 수 없습니다.");
                } else {
                    System.out.println("예약이 완료 되었습니다.");
                }
                break;
            case "E3":
                if (age < 16) {
                    System.out.println("나이제한으로 예약할 수 없습니다.");
                } else if (date % 7 != 0) {
                    System.out.println("선택하신 날짜에는 예약 할 수 없습니다.");
                } else {
                    System.out.println("예약이 완료 되었습니다.");
                }
                break;
            default:
                System.out.println("잘못된 입력 입니다.");
        }
    }
}
