package OOP;

// 하나의 소스코드 안에는 하나의 class만 작성하는 것이 바람직
// public class와 src파일 이름은 일치해야한다!

public class Jungsuck_1 {
    public static void main(String[] args) {


        Tv t1 = new Tv(); // 리모콘을 생성 - 객체의 주소를 t에 저장

        t1.channel = 7;
    }
}
class hello1 {}
class hello2 {}

class Tv {
    String color;
    int channel;
}
// 1. 클래스 작성 (설계도)
// 2. 객체 생성 (제품)
// 3. 객체 사용 (제품의 속성과 기능을 사용)
// 객체를 사용하려면 리모콘 (참조하는 변수)이 필요하다. new

