package oop.univ;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class InnerClassExample extends JFrame {
    private String originalTitle = "Original Title";

    public InnerClassExample() {
        setTitle(originalTitle);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 내부 클래스 객체 등록
        addMouseListener(new MouseEventHandler());

        setVisible(true);
    }

    // Member Inner Class
    class MouseEventHandler implements MouseListener {
        public void mouseEntered(MouseEvent e) { setTitle("Mouse on");}
        public void mouseExited(MouseEvent e) {setTitle(originalTitle);}

        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }
}


public class InnerClass {
    public static void main(String[] args) {
        new InnerClassExample();
    }
}
