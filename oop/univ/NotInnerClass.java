package oop.univ;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class NonInnerClassExample extends JFrame { // GUI 커모넌트를 상속
    private String originalTitle = "Original Title"; // 캡슐화, 간접접근만 가능

    public NonInnerClassExample() {
        setTitle(originalTitle);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // X누르면 종료

        // 외부 클래스 객체를 명시적으로 전달
        addMouseListener(new ExternalMouserEventHandler(this)); // 핵심

        setVisible(true);
    }

    // getter, setter 필요
    public void updateTitle(String title) { setTitle(title);}
    public String getOriginalTitle() { return originalTitle;}
}


// 외부 독립 클래스
class ExternalMouserEventHandler implements MouseListener {
    private  NonInnerClassExample frame;

    public ExternalMouserEventHandler(NonInnerClassExample frame) {this.frame = frame;}

    public void mouseEntered(MouseEvent e) { frame.updateTitle("mouse on");}
    public void mouseExited(MouseEvent e) {frame.updateTitle(frame.getOriginalTitle());}

    public void mouseClicked(MouseEvent e) {
        System.out.println("hi");
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}


public class NotInnerClass {
    public static void main(String[] args) {
        new NonInnerClassExample();
    }
}