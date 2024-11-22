
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
        int foo[][] = new int[3][];
        foo[0] = new int[20];
        foo[1] = new int[40];

        int[][] pos = {{10,20,30},{40,50,60},{70,80,90}};
        }
    }
}
