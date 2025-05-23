package oop.univ;

import java.io.IOException;
import java.security.cert.CertificateException;

public class OOP_250519 {
    public static void main(String[] args) {


        int pos = 0;
        try {
            System.out.println("1");

            if (pos == 0) throw new Exception();
            if (pos == 1) throw new CertificateException();
            if (pos == 2) throw new IOException();

        } catch (CertificateException e) {
            System.out.println("Certification");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("exception");
        }

        System.out.println("3");
        }
    }

class Aus {
    void prt() throws IOException{
        throw new IOException();
    }
}