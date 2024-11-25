import java.util.Scanner;

// 2차원 배열 활용 학생 성적 계산기
public class Test10_studentScore {

    // 전체 학생 목록 출력

    // 학생목록 출력
    static void prtMatrix(float[][] argMatrix) {
        // 목록 배열 생성
        String bar[] = {"학번: ", " 국어: ", " 영어: ", " 수학: ", " 합계: ", " 평균: "};
        for (int i = 0; i < argMatrix.length; i++) {
            for (int j = 0; j < argMatrix[i].length; j++) {
                System.out.print(bar[j]);
                System.out.print(argMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 수, 목록 상수 선언
        final int studentCol = 3;
        final int dataRow = 6;
        int inputValue = 0;

        // 2차원 배열의 초기선언
        float studentArray[][] = new float[studentCol][dataRow];
        // 메뉴 상수 선언
        final String MENU = """
                1. 학생 성적 입력
                2. 입력된 학생 목록 출력
                3. 학생 삭제하기
                4. 종료
                """;

        // 2차원 배열 선언
        // 시작
        while (inputValue != 4) {
            // 메뉴 출력 및 선택 받기
            System.out.print(MENU);
            System.out.print("선택: ");
            inputValue = sc.nextInt();

            // 입력값에 따른 결과 출력
            switch (inputValue) {
                // case 1 학생 성적 입력
                case 1:
                    System.out.print("학번 입력: ");
                    int studentNumber = sc.nextInt();
                    System.out.print("국어 성적: ");
                    float language = sc.nextFloat();
                    System.out.print("영어 성적: ");
                    float english = sc.nextFloat();
                    System.out.print("수학 성적: ");
                    float math = sc.nextFloat();

                    float sum = language + english + math;
                    float average = sum / studentCol;

                    // 배열에 저장
                    studentArray[studentNumber - 1][0] = studentNumber;
                    studentArray[studentNumber - 1][1] = language;
                    studentArray[studentNumber - 1][2] = english;
                    studentArray[studentNumber - 1][3] = math;
                    studentArray[studentNumber - 1][4] = sum;
                    studentArray[studentNumber - 1][5] = average;
                    break;

                // case 2 입력된 학생 목록 출력
                case 2:
                    System.out.println("학생목록");
                    prtMatrix(studentArray);
                    break;

                // case 3 학생 삭제하기
                case 3:
                    prtMatrix(studentArray);
                    int schoolNum = 0;
                    System.out.println("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로)");

                    // 재입력 요구
                    while (true) {
                        schoolNum = sc.nextInt();
                        if (0 < schoolNum && schoolNum <= studentCol + 1) {
                            break;
                        }
                        System.out.print("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
                    }

                    // 해당 학번 삭제
                    for (; schoolNum < studentArray.length - 1; schoolNum++) {
                        studentArray[schoolNum - 1] = studentArray[schoolNum];
                    }
                    studentArray[studentArray.length - 1] = null;
                    prtMatrix(studentArray);
                    break;

                // case 4 종료
                case 4:
                    System.out.print("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력");
                break;
            }
        }
    }
}
