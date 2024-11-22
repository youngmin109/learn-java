package Review;

import java.util.Scanner;

public class MidExam_gpt {
    private static final int WINNING_SCORE = 7;
    private static final int LOSING_SCORE = -7;
    private static final int SINGLE_COMBO_SCORE_PLUS = 1;
    private static final int SINGLE_COMBO_SCORE_MINUS = -1;
    private static final int SINGLE_COMBO_SCORE_MULTIPLY = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] items = {'+', '-', '*'};
        int gameScore = 0, gameRound = 1;

        while (true) {
            System.out.println(gameRound + "번째 게임");
            System.out.print("게임을 시작하려면 아무 값이나 입력: ");
            sc.next();

            char[] randArrays = generateRandomArray(items, 3);
            int itemPoint = calculateItemPoints(randArrays);

            gameScore += itemPoint;

            System.out.println("---------------------");
            System.out.print("랜덤 배열: ");
            for (char randValue : randArrays) {
                System.out.print(randValue + " ");
            }
            System.out.println("\n--------------------");

            System.out.println("현재 점수: " + gameScore);

            if (gameScore >= WINNING_SCORE) {
                System.out.println("승리");
                break;
            }
            if (gameScore <= LOSING_SCORE) {
                System.out.println("패배");
                break;
            }

            gameRound++;
        }
    }

    private static char[] generateRandomArray(char[] items, int length) {
        char[] randArrays = new char[length];
        for (int i = 0; i < length; i++) {
            randArrays[i] = items[(int) (Math.random() * items.length)];
        }
        return randArrays;
    }

    private static int calculateItemPoints(char[] randArrays) {
        int comboPoint = 0;
        char selectedItem = 0;

        for (int i = 0; i < randArrays.length - 1; i++) {
            if (randArrays[i] == randArrays[i + 1]) {
                comboPoint++;
                selectedItem = randArrays[i];
            }
        }

        return comboPoint == 1 ? getScoreForCombo(selectedItem, 1)
                : comboPoint == 2 ? getScoreForCombo(selectedItem, 2) : 0;
    }

    private static int getScoreForCombo(char selectedItem, int comboLevel) {
        switch (selectedItem) {
            case '+':
                return comboLevel == 1 ? SINGLE_COMBO_SCORE_PLUS : 3;
            case '-':
                return comboLevel == 1 ? SINGLE_COMBO_SCORE_MINUS : -3;
            case '*':
                return comboLevel == 1 ? SINGLE_COMBO_SCORE_MULTIPLY : 5;
            default:
                return 0;
        }
    }
}

