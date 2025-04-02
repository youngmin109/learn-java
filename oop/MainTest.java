package oop;
import java.net.URLEncoder;


class HttpBuffer {
    char[] buffer;
    HttpBuffer(int size) {
        buffer = new char[size];
    }
    // 디폴트 생성자는 막겠다.
    // 아예 제한을 주고 싶으면 앞에 Private를 붙인다.
    // 클래스 안에 메서드만 호출 가능 - Private 제어자

    void setBuffer(String argMsg) {
        buffer = argMsg.toCharArray();
    }
    // encoding
    String encode() {
        return URLEncoder.encode(new String(buffer));
    }
}
public class MainTest {
    public static void main(String[] args) {
        // HttpBuffer test =  new HttpBuffer();
        HttpBuffer test = new HttpBuffer(1024);
        test.setBuffer("http://www.naver.com/?name='정영철'");
        System.out.println(test.encode());
    }

}


