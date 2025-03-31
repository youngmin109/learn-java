package OOP;

class Bar3 {
    static int x;
    int y;
    static void prtX() {
        System.out.println(x);
        //  System.out.println(y);
        // 클래스 맴버는 객체 생성없이 이름을 가지고 호출이 가능하다.
        // 객체 생성 없이
    }
    void prtY() {
        System.out.println(y);
    }
}

public class OOP_250331 {
    public static void main(String[] args) {
        Bar3.prtX();
        Bar3 b1 = new Bar3();
    }
}
