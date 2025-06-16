package oop.univ;
import java.util.ArrayList;
import java.util.function.Consumer;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name=name; this.age=age; }
}

public class OOP_250616 {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person("Yon", 20));
        list.add(new Person("Jane", 31));
        list.add(new Person("Bae", 28));
        list.add(new Person("Qid", 51));

        interface Prt { void print(Person P); }

        // Consumer 인터페이스를 사용하여 Person 객체를 출력하는 람다 표현식
        Consumer<Person> prt = (obj) -> System.out.println(obj.name + ":" + obj.age);

        // 메서드 체인
        list.stream().filter((obj) -> obj.age > 30).forEach(prt);

        // 래퍼 클래스 사용 예
        // 래퍼 클래스는 기본 타입을 객체로 감싸는 클래스입니다.
        // 오토박싱 과 언박싱을 통해 기본 타입과 래퍼 클래스 간의 변환이 자동으로 이루어집니다.
        Integer value = 3; // 기본 타입 int를 래퍼 클래스 Integer로 감싸기
    }
}