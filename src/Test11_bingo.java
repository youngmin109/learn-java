import java.util.Scanner;

public class Test11_bingo {

    // 1 -> 매트릭스 생성 메서드
    static int[][][] creatMatrix(int N, int startValue, int endValue, int M) {

        // 먼저 Tensor 배열 생성
        int[][][] tensorMatrix = new int[M][N][N];

        // 랜덤 값 생성
        int randValue = 0;

        // 중복값 검사 변수 선언
        int matrixNum = 0;

        // M수 만큼 반복 하는 중첩 for문 작성
        // M 개수 (빙고판 개수)
        for (int num = 0; num < tensorMatrix.length; num++) {
            for (int i = 0; i < tensorMatrix[num].length; i++) {
                for (int j = 0; j < tensorMatrix[num][i].length; j++) {
                    // 중복값 검사 메서드
                    while (true) {
                        randValue = (int) (Math.random() * (endValue - startValue + 1)) + startValue;
                        if (!checkDuplicate(tensorMatrix, randValue, matrixNum)) {
                            break;
                        }
                    }
                    tensorMatrix[num][i][j] = randValue;
                }
            }
            matrixNum++;
        }
        return tensorMatrix;
    }

    // 1-1 랜덤 값 중복 테스트
    static boolean checkDuplicate(int[][][] matrix, int value, int matrixNum) {
        // 중복 값 있을 시 -1 return
        for (int num = matrixNum; num < matrix.length; num++) {
            for (int i = 0; i < matrix[num].length; i++) {
                for (int j = 0; j < matrix[num][i].length; j++) {
                    if (matrix[num][i][j] == value) {
                        return true;
                    }
                }
            }
        } // 중복 값 없을 시 0 return
        return false;
    }

    // 2 -> 숫자별 발생 빈도 메서드
    static int[] countFrequencies(int[][][] matrix, int countArray[], int valueN) {
        for (int num = 0; num < matrix.length; num++) {
            for (int i = 0; i < matrix[num].length; i++) {
                for (int j = 0; j < matrix[num][i].length; j++) {
                    countArray[Math.abs(valueN - matrix[num][i][j])] += 1;
                }
            }
        }
        return countArray;
    }

    // 메인 메서드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String MENU = """
                ===== 빙고 게임 메뉴 =====
                1. 빙고판 생성
                2. 숫자별 발생 빈도 분석
                3. 빙고판 출력
                4. 종료
                메뉴 선택:""";
        int inputValue = 0;

        // 빙고 사이즈 ,시작값, 종료값, 빙고 매트릭스 수
        int bingoSize = 0, randNum_start = 0, randNum_end = 0, bingoNum = 0;

        // 빙고 초기화
        int[][][] bingoMatrix = new int[0][][];

        // 게임 시작
        while (true) {
            System.out.print(MENU);
            inputValue = sc.nextInt();

            // 4: 종료
            if (inputValue == 4) {
                System.out.println("프로그램 종료");
                break;
            }
            // 입력 값 할당
            switch (inputValue) {
                // 1: 빙고판 생성
                case 1:
                    // 3이상 9이하의 홀수로 입력 (빙고판 크기)
                    while (true) {
                        System.out.print("빙고 매트릭스의 N값을 입력하세요 (3이상 9이하 홀수): ");
                        bingoSize = sc.nextInt();
                        if (3 <= bingoSize && bingoSize <= 9 && bingoSize % 2 == 1) {
                            break;
                        }
                        System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능합니다.");
                    }
                    // 난수 범위 '시작 값', '종료 값'
                    // 조건은 (종료 값 - 시작 값 + 1) >= N * N
                    // 맞지않으면 재입력
                    while (true) {
                        System.out.print("난수 범위의 시작값을 입력하세요: ");
                        randNum_start = sc.nextInt();
                        System.out.print("난수 범위의 종료값을 입력하세요: ");
                        randNum_end = sc.nextInt();

                        if ((randNum_end - randNum_start + 1) >= bingoSize) {
                            break;
                        }
                        System.out.println("시작 값이 N X N 보다 크거나 같아야 합니다.");
                    }

                    // 빙고 매트릭스 수 ( 1 이상 7 이하의 정수 )
                    // 유효하지 않으면 재입력
                    while (true) {
                        System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하)");
                        bingoNum = sc.nextInt();
                        if (1 <= bingoNum && bingoNum <= 7) {
                            break;
                        }
                        System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
                    }

                    // 중복되지 않은 숫자(시작 값 ~ 종료 값)으로 N 개의 빙고판 생성(Tensor)
                    bingoMatrix = creatMatrix(bingoSize, randNum_start, randNum_end, bingoNum);
                    break;

                case 2:
                    // 2: 빈도 분석
                    // 숫자 : N회 (~%) 10단위 스케일링 히스토그램 시각화
                    System.out.println("==== 숫자별 발생 빈도 ====");
                    // 배열 생성
                    int[] bar = new int[randNum_end - randNum_start + 1];
                    // Shallow Copy
                    int[] countArray = countFrequencies(bingoMatrix, bar, randNum_start);
                    // 출력
                    for (int i = 0; i < countArray.length; i++) {
                        int frequency = countArray[i];
                        double percentage = (frequency * 100.0) / (bingoSize * bingoSize * bingoNum);
                        percentage = Math.round(percentage * 100) / 100.0;
                        System.out.print((randNum_start + i) + ": " + frequency + "회 (" + percentage + "%)");
                        for (int j = 0; j < frequency; j++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }

                    break;

                case 3:
                    // 3: 빙고판 출력
                    // 모든 빙고판 출력
                    for (int num = 0; num < bingoMatrix.length; num++) {
                        System.out.println("빙고 매트릭스" + (num + 1));
                        for (int i = 0; i < bingoMatrix[num].length; i++) {
                            for (int j = 0; j < bingoMatrix[num][i].length; j++) {
                                System.out.print(bingoMatrix[num][i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("입력값 오류");
            }
        }
    }
}
