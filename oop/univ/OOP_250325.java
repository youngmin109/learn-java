package oop.univ;

// 이 경우는 자원을 같이 공유하는 것

class ItemBox {
    int numOfBoxes;
    void push() {numOfBoxes++;}
    void pop() {numOfBoxes--;}
}
class Foo2 {
    ItemBox box;
    Foo2(ItemBox argBox) {box = argBox;}
}
class Pos2 {
    ItemBox box;
    Pos2(ItemBox argBox) {box = argBox;}
}
public class OOP_250325 {
    public static void main(String[] args) {
        ItemBox box = new ItemBox();
        Foo2 foo = new Foo2(box);
        Pos2 pos = new Pos2(box);
        foo.box.push();
        System.out.println(box.numOfBoxes);
        foo.box.push();
        System.out.println(box.numOfBoxes);
        pos.box.pop();
        System.out.println(box.numOfBoxes);
        pos.box.pop();
        System.out.println(box.numOfBoxes);
    }
}
