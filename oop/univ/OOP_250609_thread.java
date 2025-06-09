package oop.univ;

interface Test {
    void run() throws Exception; // 알려주는 용도
}

class Quk implements Runnable {
    // 부모 기준으로 예외처리를 만들어야 하는데, 밖으로 위임할 수 없다.
    public void run() { 
        try {
            for (int i = 0; i  < 10; i ++) {
                System.out.print("* ");
                Thread.sleep(500); // 예외처리 해야함
            }
        }catch (Exception e) {}
    }
}

class Fok implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("- ");
                Thread.sleep(500);
            }
        } catch (Exception e) {}
    }
}
public class OOP_250609_thread {
    public static void main(String[] args) {


        Quk quk = new Quk();
        Fok fok = new Fok();

        Thread myThread1 = new Thread(quk);
        Thread myThread2 = new Thread(fok);

        myThread1.start();
        myThread2.start();

    }
}

