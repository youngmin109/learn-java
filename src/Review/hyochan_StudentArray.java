package Review;

import java.util.Scanner;

public class hyochan_StudentArray {

    // 2차원 배열 활용 학생 성적 계산기

    // 총 학생 수 : 3명
    // 입력: 학번, 국어, 영어, 수학 / 자동 계산: 합계, 평균
    // 3 x 6 Matrix(float)

    // 메뉴 출력
    // 메뉴
    // 1. 학생 성적 입력
    // 2. 입력된 학생 목록 출력
    // 3. 학생 삭제하기
    // 4. 종료

    // 메뉴를 출력하는 매서드
    static void menuPrint() {
        System.out.println("메뉴");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제하기");
        System.out.println("4. 종료");
    }

    // 입력된 학생 목록 출력 매서드
    static void prtMatrix(float[][] argMatrix, int argNumOfStudent) {
        for (int i = 0; i < argNumOfStudent; i++) {
            // 만약 학번이 0일 경우 출력하지 않는다. -> 건너뛰기
            if (argMatrix[i][0] == 0) {
                continue;
            }

            // 학번이 0이 아닌 경우 해당 학번 정보 출력
            System.out.println("[학번: " + (int) argMatrix[i][0] + "]" +
                    " 국어: " + argMatrix[i][1] +
                    ", 영어: " + argMatrix[i][2] +
                    ", 수학: " + argMatrix[i][3] +
                    ", 합계: " + argMatrix[i][4] +
                    ", 평균: " + argMatrix[i][5]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 변수 초기화
        final int NUM_OF_STUDENTS = 3;
        final int NUM_OF_FIELDS = 6;

        int inputValue = 0; // 메뉴 입력 변수
        float studentID = 0; // 학번 변수
        int numOfStudent = 0; // 현재 학생 수 변수
        int delIndex = 0; // 삭제할 인덱스 변수

        boolean isRunning = true; // 게임 플래그 변수

        // 입력된 학생 성적을 저장하는 배열 생성
        float[][] stuTable = new float[NUM_OF_STUDENTS][NUM_OF_FIELDS];

        // 무한루프 -> 동작이 이루어질 때마다 메뉴가 계속 출력됨
        while (isRunning) {
            // 메뉴판 출력
            menuPrint();

            // 메뉴판 선택
            System.out.print("선택: ");
            inputValue = sc.nextInt(); // 메뉴판 입력

            // switch
            switch (inputValue) {
                case 1:
                    // 1. 학생 성적 입력
                    // 변수 생성
                    boolean checkOverlap = false; // 중복값 플래그 변수
                    char overlapInput = 0; // 중복값 덮어쓰기 결정 변수

                    // 학번과 국어, 영어, 수학 성적을 차례대로 입력 받는다.
                    System.out.print("학번을 입력하세요: ");
                    studentID = sc.nextFloat();

                    // 중복값 검사
                    for (int i = 0; i < numOfStudent; i++) {
                        // 이전에 입력된 학번과 현재 입력한 학번에 중복될 경우
                        if (stuTable[i][0] == studentID) {
                            checkOverlap = true;
                        }
                    }

                    // 'Y'나 'q' 입력 시 반복문 탈출 / 그 외 값 입력 시 재입력 요구
                    while (checkOverlap) {
                        System.out.println("중복된 입력이 있습니다.");
                        System.out.print("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행, q: 메뉴로 돌아가기): ");
                        overlapInput = sc.next().charAt(0);

                        // 'Y' 또는 'q' 입력 시 반복문 탈출
                        if (overlapInput == 'Y') {
                            numOfStudent--; // 'Y' 입력 시 현재 학생 수 감소
                            break;
                        } else if (overlapInput == 'q') {
                            break;
                        }
                        // 'Y', 'q' 이외의 다른 값을 입력 했을 경우, 재입력 요구
                        else {
                            System.out.println("재입력하세요. 잘못된 입력입니다.");
                        }
                    }

                    // 'q' 입력 시 메뉴로 돌아가기
                    if (overlapInput == 'q') {
                        System.out.println("입력이 취소 되었습니다. 메뉴로 돌아갑니다.");
                        break;
                    }

                    // 'Y' 입력이나 중복값이 없을 경우, 성적 입력
                    else {
                        stuTable[numOfStudent][0] = studentID; // 학번 성적을 실수로 입력
                        System.out.print("국어 성적: ");
                        stuTable[numOfStudent][1] = sc.nextFloat(); // 국어 성적을 실수로 입력
                        System.out.print("영어 성적: ");
                        stuTable[numOfStudent][2] = sc.nextFloat(); // 영어 성적을 실수로 입력
                        System.out.print("수학 성적: ");
                        stuTable[numOfStudent][3] = sc.nextFloat(); // 수학 성적을 실수로 입력
                        System.out.println("입력이 완료되었습니다.");

                        // 합계 계산
                        stuTable[numOfStudent][4] = stuTable[numOfStudent][1] + stuTable[numOfStudent][2] + stuTable[numOfStudent][3];

                        // 평균 계산
                        stuTable[numOfStudent][5] = stuTable[numOfStudent][4] / 3.0f;

                        numOfStudent++; // 현재 입력된 학생 수 증가

                        // 덮어쓰기의 경우
                        if (overlapInput == 'Y') {
                            System.out.println("덮어쓰기가 완료되었습니다.");
                        }
                    }
                    break;
                case 2:
                    // 2. 입력된 학생 목록 출력
                    // 출력 형식: [학번] 국어: xx, 영어: xx, 수학: xx, 합계: xx, 평균: xx.xx
                    // 만약 0 < numOfStudent <= NUM_OF_STUDENTS
                    if (numOfStudent > 0) {
                        System.out.println("학생 목록: ");
                        prtMatrix(stuTable, numOfStudent);
                    } else {
                        System.out.println("입력된 학생 정보가 없습니다.");
                    }
                    break;
                case 3:
                    // 3. 학생 삭제하기
                    // 무한루프 -> 삭제할 학생 목록을 출력하고 '-1' 입력 전까지 계속 출력
                    while (true) {
                        // 삭제 플래그 변수 false로 초기화
                        boolean found = false;

                        // 현재까지 입력된 학생 목록을 출력한다.
                        System.out.println("학생 목록: ");
                        prtMatrix(stuTable, numOfStudent);

                        // 삭제할 학생의 학번을 입력 받는다. (-1 입력 시 메뉴 출력으로 돌아감)
                        System.out.println("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로): ");
                        int delStuID = sc.nextInt();

                        // 무한루프 -> -1 입력 시 이전 메뉴로, 범위 외 값 입력 시 재입력
                        if (delStuID == -1) {
                            System.out.println("이전 메뉴로 돌아갑니다.");
                            break;
                        }

                        // 삭제 작업
                        // 삭제할 학생을 배열에서 찾았을 경우, 삭제 후 초기화
                        for (int i = 0; i < numOfStudent; i++) {
                            // 학생 목록의 학번과 입력 받은 삭제할 학번이 같다면 학생 삭제
                            if (stuTable[i][0] == delStuID) {
                                // 삭제할 학생을 찾았다면
                                found = true; // 플래그 변수 true

                                // 삭제된 학생 이후의 데이터 이동 -> 마지막 행은 패스
                                for (int j = i; j < numOfStudent - 1; j++) {
                                    stuTable[j] = stuTable[j + 1];
                                }

                                // 마지막 행을 초기화 -> 해당 행의 열을 모두 0.0f로 초기화
                                stuTable[numOfStudent - 1] = new float[NUM_OF_FIELDS];

                                // 삭제를 완료하면 입력된 학생 수를 1 감소시킨 후 삭제 완료 문구 출력
                                numOfStudent--;
                                System.out.println("삭제가 완료되었습니다.");
                                break;
                            }
                        }

                        // 삭제할 학생을 찾지 못했다면 "해당 학번이 존재하지 않습니다. 다시 입력해주세요." 문구 출력
                        if (found == false) {
                            System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
                        }
                    }
                    break;
                case 4:
                    // 4. 종료
                    System.out.println("프로그램을 종료합니다.");
                    isRunning = false; // 반복문 종료
                    break;
                // 1~4의 정수를 입력 받지 못한 경우 재입력 요구
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}


