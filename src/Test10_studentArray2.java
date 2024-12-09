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

        for (int i = 0; i < matrix[numStudents].length - 2; i++) {
            System.out.println(fieldTitles[i] + "을 입력하세요");

            // 중복 학번 검증
            String choiceYq = "";
            matrix[numStudents][i] = sc.nextFloat();
            for (int j = 0; j < numStudents; j++) {
                // 중복된 학번이 있을 시
                if ((int) matrix[j][0] == matrix[numStudents][0]) {
                    System.out.println("중복된 입력이 있습니다.");
                    System.out.print("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행, q: 메뉴로 돌아가기):");
                    choiceYq = sc.next();

                    // q 입력 시 메뉴로 Back
                    if (choiceYq.equals("q")) {
                        return numStudents;
                    } else if (choiceYq.equals("Y")) {
                        coverStudentId(matrix, numStudents, fieldTitles);
                        System.out.println("덮어쓰기가 완료되었습니다.");
                        return numStudents;
                    }
                }
            }
        }
        // 합계 및 평균 계산
        matrix[numStudents][4] = matrix[numStudents][1] + matrix[numStudents][2] + matrix[numStudents][3];
        matrix[numStudents][5] = matrix[numStudents][4] / 3.0f;

        return ++numStudents;
    }

    // 덮어쓰기 희망 시
    static void coverStudentId(float[][] matrix, int numStudents, String[] fieldTitles) {
        Scanner sc = new Scanner(System.in);

        // 중복값 검사
        int duplicateId = -1;
        for (int i = 0; i < numStudents; i++) {
            if (matrix[i][0] == matrix[numStudents][0]) {
                duplicateId = i;
            }
        }

        // 중복된 학번 인덱스에 덮어쓰기
        for (int i = 1; i < matrix[numStudents].length - 2; i++) {
            System.out.println(fieldTitles[i] + "을 입력하세요");
            matrix[duplicateId][i] = sc.nextFloat();
            // 합계 및 평균 계산
            matrix[duplicateId][4] = matrix[duplicateId][1] + matrix[duplicateId][2] + matrix[duplicateId][3];
            matrix[duplicateId][5] = matrix[duplicateId][4] / 3.0f;
        }
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
                --------------------
                1. 학생 성적 입력
                2. 학생 목록 출력
                3. 학생 삭제
                4. 종료
                --------------------
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
                    if (numStudents >= studentMatrix.length) {
                        // 2배로 확장된 배열 생성
                        float[][] expandArray = new float[studentMatrix.length * 2][fieldTitles.length];

                        // 기존배열을 복사
                        for (int i = 0; i < studentMatrix.length; i++) {
                            for (int j = 0; j < studentMatrix[i].length; j++) {
                                expandArray[i][j] = studentMatrix[i][j];
                            }
                        }
                        // 기존배열 확장된 배열로 주소값 변경
                        studentMatrix = expandArray;
                        System.out.println("배열이 확장 되었습니다.");
                    }

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
                    while (true) {
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

