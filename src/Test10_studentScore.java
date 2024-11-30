package src;

import java.util.Scanner;

// 2차원 배열 활용 학생 성적 계산기
public class Test10_studentScore {

    // 전체 학생 목록 출력

    // 학생목록 출력
    static void prtMatrix(float[][] argMatrix, int argNumOfStd) {
        // 학생 정보 없을 시
        if (argNumOfStd == 0) {
            System.out.println("입력된 학생 정보가 없습니다.");
            return;
        }

        // 목록 배열 생성 (제목은 한 번씩만 생성)
        String[] title = {"학번", "국어", "영어", "수학", "합계", "평균"};
    for (String t : title) {
        System.out.print(t + "\t");
    }
    System.out.println();

    for (int i = 0; i < argNumOfStd; i++) {
        for (int j = 0; j < argMatrix[i].length; j++) {
            System.out.print(argMatrix[i][j] + "\t");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 수, 목록 상수 선언
        final int NUM_OF_STUDENTS = 3;
        final int NUM_OF_FIELDS = 6;
        int inputValue = 0;
        int numOfStudents = 0;

        // 2차원 배열의 초기선언
        float studentArray[][] = new float[NUM_OF_STUDENTS][NUM_OF_FIELDS];

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
                    // 배열에 저장
                    System.out.print("학번 입력: ");
                    studentArray[numOfStudents][0] = sc.nextInt();

                    System.out.print("국어 성적: ");
                    studentArray[numOfStudents][1] = sc.nextFloat();

                    System.out.print("영어 성적: ");
                    studentArray[numOfStudents][2] = sc.nextFloat();

                    System.out.print("수학 성적: ");
                    studentArray[numOfStudents][3] = sc.nextFloat();

                    studentArray[numOfStudents][4] = studentArray[numOfStudents][1] +
                            studentArray[numOfStudents][2] + studentArray[numOfStudents][3];
                    studentArray[numOfStudents][5] = studentArray[numOfStudents][4] / NUM_OF_STUDENTS;

                    numOfStudents++;
                    break;

                // case 2 입력된 학생 목록 출력
                case 2:
                    System.out.println("학생목록");
                    prtMatrix(studentArray, numOfStudents);
                    break;

                // case 3 학생 삭제하기
                case 3:
                    // 학생 수 0명
                    if (numOfStudents == 0) {
                        System.out.println("삭제할 학생 정보가 없습니다.");
                        break;
                    }

                    prtMatrix(studentArray, numOfStudents);
                    System.out.println("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로)");
                    int deleteId = sc.nextInt();
                    
                    if (deleteId == -1) break;

                    // 학번 검색
                    int deletIndex = -1;
                    for (int i = 0; i < numOfStudents; i++) {
                        if (studentArray[i][0] == deleteId) {
                            deletIndex = i;
                            break;
                        }
                    }

                    // 해당 학번이 없을 경우
                    if (deletIndex == -1) {
                        System.out.println("해당 학번이 존재하지 않습니다.");
                        break;
                    }
                    
                    // 배열 갱신
                    for (int i = deletIndex; i < numOfStudents - 1; i++){
                        studentArray[i] = studentArray[i + 1];
                    }
                    numOfStudents--; // 유효 학생 수 감소
                    System.out.println("삭제 후 학생 목록");
                    prtMatrix(studentArray, numOfStudents);
                    break;

                    // // 삭제하기 위한 배열 선언
                    // int totalRows = studentArray.length; // 행렬의 행 개수 저장
                    // for (int i = deleteId; i < totalRows; i++) {
                    //     studentArray[i - 1] = studentArray[i];
                    // }
                    // // 마지막 행을 0으로 초기화
                    // for (int j = 0; j < studentArray[totalRows - 1].length; j++) {
                    //     studentArray[totalRows - 1][j] = 0;
                    // }

         

    
                // case 4 종료
                case 4:
                    System.out.print("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력");
            }
        }
    }
}
