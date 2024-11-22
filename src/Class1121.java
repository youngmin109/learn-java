
public class Class1121 {
    static float[] getSumAvg(int a, int b, int c) {
        // 여기서 float[]은 return 값의 자료형을 말한다.
        float result[] = new float[2];

        result[0] = a + b + c;
        result[1] = result[0] / 3;

        return result; // JAVA와 C언어에서는 파이썬과 다르게 return값은 하나만 가능하다.
    }

    public static void main(String[] args) {

        float[] values = getSumAvg(1, 2, 3);
        System.out.println("sum : " + values[0] + "\navg : " + values[1]);


        int[][] bar = new int[3][3];

        int value = 10;
        // Loop : row 0 -> 2
        for (int row = 0; row < bar.length; row++) {
            // Loop : col 0 -> 2
            for (int col = 0; col < bar[row].length; col++) {
                bar[row][col] = value;
                value += 10;
            }
        }


        // 그림 그리기
        int kin[][] = new int[3][];
        // 행마다 열의 크기를 다르게 할당할 때 이렇게 배열을 선언한다.
        kin[0] = new int[20];
        kin[1] = new int[40];

        int[][] pos = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        // 실습

        char[][] foo = new char[4][];
        foo[0] = new char[5];
        foo[1] = new char[3];
        foo[2] = new char[1];
        foo[3] = new char[4];

        foo[0][0] = 'h';
        foo[0][1] = 'e';
        foo[0][2] = 'l';
        foo[0][3] = 'l';
        foo[0][4] = 'o';

        foo[1][0] = 'h';
        foo[1][1] = 'o';
        foo[1][2] = 'w';

        foo[2][0] = 'a';

        foo[3][0] = 't';
        foo[3][1] = 'o';
        foo[3][2] = 'p';
        foo[3][3] = 's';

        for (int i = 0; i < foo.length; i++) {
            for (int j = 0; j < foo[i].length; j++) {
                System.out.print(foo[i][j]);
            }
            System.out.println();
        }

        // for - each

        for (char[] charValue : foo) {
            System.out.println(charValue);
        }
    }
}



