package ransue;

import java.awt.dnd.DragSourceDragEvent;
import java.util.Scanner;

import static java.lang.System.*;

public class FlowControl {
    public static void main(String[] args) {

        // 사용자로부터 정수를 입력
        String yesterday = "thursday";
        String today = "Friday";
        String tomorrow = "Saturday";

        switch (today) {
            case "Saturday":
                System.out.println("Saturday");
            case "Sunday":
                System.out.println("Sunday");
                break;
            case "Monday":
                System.out.println("Monday");
            case "Tuesday":
                System.out.println("Tuesday");
            case "Wednesday":
            case "Thursday":

        }
    }
}