package oop.univ;

// 이 경우는 자원을 공유하지 않는다.
// 1,2 중 모델링 할 줄 있어야한다.

class ItemBox3 {
    int numOfBoxes;
    void push() {numOfBoxes++;}
    void pop() {numOfBoxes--;}
}
class Foo3 {
    ItemBox box;
    Foo3(ItemBox argBox) {box = argBox;}
}
class Pos3 {
    ItemBox box;
    Pos3(ItemBox argBox) {box = argBox;}
}
public class OOP_250327 {
    public static void main(String[] args) {
        Foo3 foo = new Foo3(new ItemBox());
        Pos3 pos = new Pos3(new ItemBox());
        foo.box.push();
        foo.box.push();
        pos.box.pop();
        pos.box.pop();
    }
}
