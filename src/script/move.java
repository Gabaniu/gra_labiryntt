/*package script;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class move extends JPanel  implements KeyListener, MouseListener {

    game game;
    public move (game game){
        this.game = game;
        setSize(1280,760);
        addMouseListener(this);
    }


    int i;
    int x;
    int y;
    int z;
    int kier;


    public move(){
        setSize(60,135);
        i = 108;
        int x = 0;
        y = 645;
        kier = 0;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //ImageIcon im = new ImageIcon("src/png/lvl1.png");
        ImageIcon run = new ImageIcon("src/png/newtv6.png");

       // g.drawImage(im.getImage(), 0, 0, 1280, 760, null);



        if(kier == 0){
            g.drawImage(run.getImage(), 80+x,0+y,110+x,y+54,0,i-108,60,0+i,null);
        }
        if(kier == 1) {
            g.drawImage(run.getImage(), 110 + x, 0+y, 80 + x, y+54, 0, i - 108, 60, 0 + i, null);
        }
        if(kier==2){
            g.drawImage(run.getImage(), 80 + x, 0+y, 110 + x, y+54, 0, i - 108, 60, 0 + i, null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode());


    }

    @Override
    public void keyPressed(KeyEvent e) {


        if(i < 540)
            i+=108;
        else
            i=108;
        //right
        if(e.getKeyCode()==39) {x+=5;kier=0;}
        if(e.getKeyCode()==68) {x+=5;kier=0;}
        //left
        if(e.getKeyCode()==37) {x-=5;kier=1;}
        if(e.getKeyCode()==65) {x-=5;kier=1;}
        //jump
        if(e.getKeyCode()==38) {
            z = y;
            for(int k = 1; k<=5 ; k++) {
                y += 3;
                kier=2;
                if(y<=z+15){
                    for(int l = 5; l>=1; l--){
                        y -=3;
                    }
                }
            }
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        i=108;
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}*/
