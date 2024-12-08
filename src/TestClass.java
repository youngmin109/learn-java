public class TestClass {
    public static void main(String[] args) {

        int arrays[] = new int[5];

        int start = 5, end = 10;
        int randValue = 0;
        for (int i = 0; i < 5; i++) {
            randValue = (int) (Math.random() * (end - start + 1)) + start;
            arrays[i] = randValue;
        }
        for (int i = 0; i < arrays.length; i++){
            System.out.print(arrays[i] + "\t");
        }
    }
}
