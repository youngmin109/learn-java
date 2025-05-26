package oop.univ;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OOP_250526 {
    public static void main(String[] args) throws Exception {

        // Try-with-resource

        try {
            int bar = 0;

            if(bar == 0) {
                throw new IOException("IO Exception 발생");
            }
        } catch (Exception e) {
            if (e instanceof IOException) {
                System.out.println(((IOException) e).getMessage());
            }
        }
    }
}
