package src;

public class Class1128 {
    public int num = 3;
    protected int bar = 20;
    int foo = 3;

    public static void main(String[] args) {
        final int FRAME_NUM = 10000;
        int ITEM_NUM = 20;

        // 내가 사용하는 목적에 맞게 다차원 배열을 생성한다.

        // 한방에 다 만들거나, 그 때 그 때, 만들거나
        // 운영체제와 리소스를 고려해서 만든다.
        float[][] noiseMatrix;

        noiseMatrix = new float[FRAME_NUM][];

        noiseMatrix[0] = new float[ITEM_NUM];
        noiseMatrix[1] = new float[ITEM_NUM];
        noiseMatrix[9999] = new float[ITEM_NUM];

        // 이런식으로
        // new float[FRAME_NUM][ITEM_NUM] 처럼 한번에 생성하지 않고,
        // 필요한 행만 할당하면 메모리 사용을 최소화 할 수 있다.
        //
    }
}
