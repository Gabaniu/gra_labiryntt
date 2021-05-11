package script;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Start st = new Start();
        ImageIcon im = new ImageIcon("src/png/logo.png");
        jf.add(st);
        jf.setTitle("Maze Runner");
        jf.setIconImage(im.getImage());
        jf.setBounds(100, 100, 1280, 760);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static class KeyListener {
    }
}
