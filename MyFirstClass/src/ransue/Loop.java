package ransue;

public class Loop {
    public static void main(String[] args) {

        int[] bar;
        bar = new int[5]; //정수형 변수를 연속적으로 3개
        // int bar[] = new int[5]; //

        for (int i = 0, j = 10; i < bar.length; i++, j += 10) {
            bar[i] = j;
        }
        for (int i = 0; i < bar.length; i++) {
            System.out.print(bar[i] + " ");
        }
        for (int index = 0, value = 5; index < bar.length; index++, value--) {
            bar[index] = value;
        }
        // 5 4 3 2 1 을 출력하라
        for (int index = 0; index < bar.length; index++) {
            System.out.print(bar[index] + " ");
        }
        // 간단하게 출력하기 위해 for-each를 만들었다.
        for (int value : bar){// 값을 저장하기 위한 변수 : 배열을 가리키는 참조변수
            System.out.print(value + " ");
        }
    }
}




