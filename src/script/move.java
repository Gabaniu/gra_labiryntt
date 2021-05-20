package script;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class move extends JPanel  implements KeyListener {

    game game;
    public move (game game) {
        this.game = game;
        setSize(1280,760);
        addKeyListener(this);
    }

    ImageIcon th = new ImageIcon("src/png/th2.png" );

    int i;
    int x;
    int y;
    int kier;
    Image imgRes;
    public move(){
        setSize(60,112);
        i = 0;
        int x = 0;
        int y = 0;
        kier = 0;
        imgRes = th.getImage().getScaledInstance((274*2), (528*2), Image.SCALE_DEFAULT);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (kier == 0) {
            g.drawImage(th.getImage(), 0 + x, 0, 15 + x, 28, 0, 0 + (i * 24), 15, 24 + (i * 24), null);
            System.out.println("right");
        }

        if (kier == 1) {
            g.drawImage(th.getImage(), 15 + x, 0, 0 + x, 28, 0, 0 + (i * 24), 15, 24 + (i * 24), null);
            System.out.println("left");
        }

       /* if (kier == 2) {
            g.drawImage(imgRes, 0, 15, 0, 0, 28, 0, 0 + (i * 15), 28 + (i * 28), null);
            System.out.println("jump?");
        }

        if (kier == 3){
            g.drawImage(imgRes, 80 + x, 0, 0 + x, 88, 0, 0 + (i * 88), 80, 88 + (i * 88), null);
            System.out.println("crouch?");
        }*/
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if(e.getKeyCode()==38) {y+=2;kier=2;}
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(i < 5)
            i++;
        else
            i=0;

        if(e.getKeyCode()==39) {x+=2;kier=0;}
        if(e.getKeyCode()==37) {x-=2;kier=1;}
        if(e.getKeyCode()==38) {y+=2;kier=2;}
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        i=0;
        repaint();
    }
}