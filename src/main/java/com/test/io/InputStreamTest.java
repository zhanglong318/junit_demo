package com.test.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("hello.txt");

        byte[] buffer = new byte[200];
        int length;

        while (-1 != (length = is.read(buffer, 0, 200))) {
            String str = new String(buffer, 0, length);
            System.out.println(str);
        }

        is.close();
    }
}
