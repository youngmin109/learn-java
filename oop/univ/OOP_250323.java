package oop.univ;

class Student1 {
    String name; // 멤버 변수 - 객체의 속성을 정의
    static int age; // cv
    // 초기화 블록 - 공통 초기화 코드
    {
        System.out.println("초기화 블록 실행");
    }

    // 생성자
    Student1(String name) {
        this.name = name;
    }

    // 멤버 메서드 - 객체의 기능을 수행
    void greet() {
        System.out.println("Hi, " + name + ", Age" + age);
    }

    static void setAge(int newAge) {
                age = newAge;
    }
}
public class OOP_250323 {
    public static void main(String[] args) {

        // 클래스 메서드 호출
        Student1.setAge(28);
        Student1 st = new Student1("배영민");
        st.greet();
        // st는 단순한 포인터, 이 포인터가 가리키는 곳은 객체의 데이터 뿐만 아니라, 메서드 테이블도 같이있다.

        // later 1 year
        // 클래스 메서드 호출
        Student1.setAge(29);
        st.greet();

    }
}
