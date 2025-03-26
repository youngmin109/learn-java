package OOP;

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
        foo.box.push();
        pos.box.pop();
        pos.box.pop();
    }
}
