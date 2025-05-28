package oop.univ;

class Board {
    static int x = 3;
    static class Display {
        static void prt() {
            System.out.println(x);
        }
    }
    static class Pagination {
        static int getCurrentPage() { return 0;}
    }
}
public class OOP_250528 {
    public static void main(String[] args) {

        Board.Display.prt();
        Board.Pagination.getCurrentPage();
    }
}
