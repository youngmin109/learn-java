import java.util.Scanner;

import static java.lang.System.exit;

public class Test10_studentArray2 {

    // 학생 성적 목록 출력
    static void printMatrix(float[][] matrix, int numRows, String[] fieldTitles) {
        if (numRows <= 0) {
            System.out.println("\t학생 목록이 없습니다.");
            return;
        }

        System.out.println("-----학생 성적 목록-----");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(fieldTitles[j] + ": " + matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

    // 학생 성적 추가
    static int addStudentToMatrix(float[][] matrix, int numStudents, String[] fieldTitles) {
        Scanner sc = new Scanner(System.in);

        if (numStudents >= matrix.length) {
            System.out.println("Matrix 입력 범위 초과, Matrix를 확장 해주세요");
            return -1;
        }

        for (int i = 0; i < matrix[numStudents].length - 2; i++) {
            System.out.println(fieldTitles[i] + "을 입력하세요");
            matrix[numStudents][i] = sc.nextFloat();
        }

        // 합계 및 평균 계산
        matrix[numStudents][4] = matrix[numStudents][1] + matrix[numStudents][2] + matrix[numStudents][3];
        matrix[numStudents][5] = matrix[numStudents][4] / 3.0f;

        return ++numStudents;
    }

    // 학생 삭제
    static int deleteStudentFromMatrix(float[][] matrix, int studentId, int numStudents) {
        int delindex = -1;

        // 학번 찾기
        for (int i = 0; i < numStudents; i++) {
            if (matrix[i][0] == studentId) {
                delindex = i;
                break;
            }
        }

        if (delindex == -1) {
            System.out.println("학번을 찾을 수 없습니다.");
            return -1;
        }
        // 삭제된 학생 이후의 데이터 이동
        for (int i = delindex; i < numStudents - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i + 1][j];
            }
        }
        // 마지막 줄 초기화
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[numStudents - 1][i] = 0.0f;
        }
        return --numStudents;
    }

    public static void main(String[] args) {
        final int MAX_STUDENTS = 3;
        final int NUM_FIELDS = 6;
        int numStudents = 0;

        final String MENU = """
                -----------------------
                1. 학생 성적 입력
                2. 학생 목록 출력
                3. 학생 삭제
                4. 종료
                -----------------------
                메뉴를 선택하세요:
                """;
        float[][] studentMatrix = new float[MAX_STUDENTS][NUM_FIELDS];
        String[] fieldTitles = {"학번", "국어", "영어", "수학", "합계", "평균"};

        Scanner sc = new Scanner(System.in);
        int menuChoice = -1;

        while (true) {
            System.out.print(MENU);
            menuChoice = sc.nextInt();

            if (menuChoice < 1 || menuChoice > 4) {
                System.out.println("1 ~ 4 사이 값을 입력하세요");
                continue;
            }

            if (menuChoice == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            int result = -1;

            switch (menuChoice) {
                case 1:
                    result = addStudentToMatrix(studentMatrix, numStudents, fieldTitles);
                    if (result > 0) {
                        numStudents = result;
                    } else {
                        System.out.println("학생 성적 입력 오류");
                    }
                    break;

                case 2:
                    printMatrix(studentMatrix, numStudents, fieldTitles);
                    break;

                case 3: // 학생 삭제
                    printMatrix(studentMatrix, numStudents, fieldTitles);
                    while(true) {
                        System.out.print("삭제할 학생의 학번을 입력하세요");
                        int studentId = sc.nextInt();
                        result = deleteStudentFromMatrix(studentMatrix, studentId, numStudents);
                        if (result >= 0) {
                            numStudents = result;
                            break;
                        }
                    }
                    printMatrix(studentMatrix, numStudents, fieldTitles);
                    break;

                default:
                    System.out.println("Something went wrong");
                    exit(-1);
            }
        }

    }
}


