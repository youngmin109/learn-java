package OOP;


class Bar3 {
    // 관례적으로 멤버 변수를 가장 위에 쓴다.
    int x; // 0으로 초기화
    String y; // 0도 주소값으로 처리, => null
    boolean z; // false로 초기화


   void prt() {
       {
            int a = 3;
           {
               System.out.println(a);
               int b = 5;
           }
           // System.out.println(b);
       }
       // System.out.println(x + ":" + this.x);
       // this. 해당 객체의 멤버변수를 참조하겠다!
   }

}

// int x = 3;
// Java에서는 모든게 클래스 안에 있어야 함 -> 객체 지향
// 프로그래밍이란? 자료구조 + 알고리즘
// 클래스 단위로 묶어서 객체로 만든다.

class Foo1 {


}
public class OOP_250331 {
    public static void main(String[] args) {
        (new Bar3()).prt();
    }
}
