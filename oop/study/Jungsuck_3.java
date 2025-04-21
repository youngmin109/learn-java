package oop.study;

class Jungsuck_3 {
    public static void main(String args[]) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card2 c1 = new Card2();
        c1.kind = "Heart";
        c1.number = 7;

        Card2 c2 = new Card2();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 카드: " + c1.kind + ", " + c1.number + "번, 크기 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2 카드: " + c2.kind + ", " + c2.number + "번, 크기 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c1의 width와 height를 50, 80으로 변경합니다.");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1 카드: " + c1.kind + ", " + c1.number + "번, 크기 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2 카드: " + c2.kind + ", " + c2.number + "번, 크기 (" + c2.width + ", " + c2.height + ")");
    }
}

class Card2 {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
