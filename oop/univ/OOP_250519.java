package oop.univ;

public class OOP_250519 {
    public static void main(String[] args) {


        int pos = 0;
        try {
            System.out.println("1");

            if (pos == 0) throw new Exception();

            System.out.println("2");
        } catch (Exception e) {
            System.out.println("exception");
        }

        System.out.println("3");
        }
    }

