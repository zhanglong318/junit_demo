package com.pattern.defaultadapter;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtAppTest {

    public static void main(String[] args) {
        Frame frame = new Frame("缺省适配器模式测试");

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("x: " + e.getX() + " y: " + e.getY());
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("exit");
                System.exit(0);
            }
        });

        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
