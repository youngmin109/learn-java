package Studying;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bar = sc.nextLine();
        String foo = sc.nextLine();

        if (bar.equals(foo)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

}