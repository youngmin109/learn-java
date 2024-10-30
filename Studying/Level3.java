public class Level3 {
    public static void main(String[] args) {
        int age = 17; // 나이
        String eventCode = "E3"; // 변수명 선언 시 파이썬 처럼 _ 쓰지말기
        int reserveDate = 14;

        if (eventCode == "E1") {
            if (age >= 18)
                ;
            {
                System.out.println("예약완료!");
            }
        } else if (eventCode == "E2") {
            if (reserveDate % 2 == 0) {
                System.out.println("예약완료!");
            }
        } else if (eventCode == "E3") {
            if (age >= 16 && reserveDate % 7 == 0) {
                if (age < 16) {
                    System.out.println("나이 제한");
                    return;
                } else {
                    System.out.println("날짜 제한");
                    return;
                }}
            else {
                System.out.println("예약완료!");
                }
            else if
            
        } else {
            System.out.println("잘못된 입력입니다. 프로그램을 종료");
        }
    }
}
