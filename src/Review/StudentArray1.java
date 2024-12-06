package Review;

import java.util.Scanner;

public class StudentArray1 {


    // 1 -> 학생성적 입력 메서드
    static int studentScoreInput(float[][] matrix, int numOfStudent, String[] FIELD) {
        Scanner sc = new Scanner(System.in);

        // 학생 수가 배열 행을 초과했을 시
        if (numOfStudent >= 3) {
            System.out.println("학생 입력 수 초과. 메뉴로 돌아갑니다.");
            return 0;
        }

        // 올바르게 학생 수가 입력 됐을 시
        // 학번 입력
        System.out.print("학번을 입력하세요: ");
        matrix[numOfStudent][0] = sc.nextFloat();

        for (int i = 1; i < matrix[numOfStudent].length - 2; i++) {
            System.out.print(FIELD[i] + "성적: ");
            matrix[numOfStudent][i] = sc.nextFloat();
        }

        // 합계와 평균
        matrix[numOfStudent][4] = matrix[numOfStudent][1] + matrix[numOfStudent][2] + matrix[numOfStudent][3];
        matrix[numOfStudent][5] = matrix[numOfStudent][4] / 3.0f;
        return 1;
    }

    // 2 -> 학생 목록 출력 메서드
    static void studentArrayInput(float[][] matrix, int numOfStudent, String[] FIELD) {
        for (int i = 0; i < numOfStudent; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(FIELD[j] + ": " + matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

    // 3 -> 학생 목록 삭제 메서드
    static int delIndexStudent(float[][] matrix, int numOfStudent, int delIndex) {

        // 덮어씌우기
        for (int i = delIndex; i < numOfStudent - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i + 1][j];
            }
        }

//		// 마지막 값 0으로 초기화
//		for (int i = 0; i < matrix[delIndex].length; i++) {
//			matrix[delIndex + 1][i] = 0.0f;
//		}
        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 메뉴 선언
        final String MENU = """
                ----------------
                1. 학생 성적 입력
                2. 입력된 학생 목록 출력
                3. 학생 삭제하기
                4. 종료
                ----------------""";
        // 열 목록 배열 생성
        final String[] FIELD_ROW = {"학번", "국어", "영어", "수학", "합계", "평균"};

        // 행 크기, 열 크기 상수 선언
        final int STUDENT_ROW = 3;
        final int STUDENT_COL = 6;

        // 3행 6열 2차원 배열 선언
        float[][] studentArray = new float[STUDENT_ROW][STUDENT_COL];

        // 사용자 입력 값, 학생 수 변수 초기화
        int inputValue = 0, numOfStudent = 0;

        // 무한반복
        while (true) {
            // 사용자 입력 받기
            System.out.println(MENU);
            System.out.print("선택: ");
            inputValue = sc.nextInt();

            // 예외 처리
            // 4 -> 게임 종료
            if (inputValue == 4) {
                System.out.print("게임종료");
                break;
            }

            // 이외 입력 시 다시 반복
            if (inputValue <= 0 || inputValue > 4) {
                System.out.println("1~4 사이 입력");
                continue;
            }

            // 사용자 입력
            int result = 0;

            switch (inputValue) {
                // 1 -> 학생 성적 입력
                case 1:
                    result = studentScoreInput(studentArray, numOfStudent, FIELD_ROW);

                    numOfStudent += result;
                    break;

                // 2 -> 입력된 학생 목록 출력
                case 2:
                    studentArrayInput(studentArray, numOfStudent, FIELD_ROW);
                    break;

                // 3 -> 학생 삭제하기
                case 3:
                    // 학생 0명이면 back
                    if (numOfStudent <= 0) {
                        System.out.println("등록된 학생이 없습니다.");
                        break;
                    }

                    int delIndex = -1;
                    studentArrayInput(studentArray, numOfStudent, FIELD_ROW);
                    // 삭제할 학번 입력받고 검사하기
                    System.out.print("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로): ");
                    float delStudent = sc.nextInt();

                    if (delStudent == -1) {
                        break;
                    }
                    // 인덱스 값 찾기
                    for (int i = 0; i < numOfStudent; i++) {
                        if ((int) studentArray[i][0] == delStudent) {
                            delIndex = i;
                        }
                    }
                    if (delIndex != -1) {
                        result = delIndexStudent(studentArray, numOfStudent, delIndex);
                    } else {
                        System.out.println("해당 학번이 없습니다.");
                    }

                    numOfStudent += result;
                    studentArrayInput(studentArray, numOfStudent, FIELD_ROW);
                    break;

                // 예외값 입력오류
                default:
                    System.out.println("입력오류");
            }
        }
    }
}
