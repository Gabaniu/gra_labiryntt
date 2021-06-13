package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Strt extends JPanel implements MouseListener {

    game game;

    public Strt(game game) {
        this.game = game;
        setSize( 1280, 760);
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);



        ImageIcon strt = new ImageIcon("src/png/strt.png");
        ImageIcon sett = new ImageIcon("src/png/sett.png");



        ImageIcon im1 = new ImageIcon("src/png/1lvl.png");
        ImageIcon im2 = new ImageIcon("src/png/2lvl.png");
        ImageIcon im3 = new ImageIcon("src/png/3lvl.png");
        ImageIcon im4 = new ImageIcon("src/png/4lvl.png");
        ImageIcon im5 = new ImageIcon("src/png/5lvl.png");
        ImageIcon im6 = new ImageIcon("src/png/6lvl.png");
        ImageIcon im7 = new ImageIcon("src/png/7lvl.png");
        ImageIcon im8 = new ImageIcon("src/png/8lvl.png");
        ImageIcon im9 = new ImageIcon("src/png/9lvl.png");

        if(game.s == 1){
            g.drawImage(im1.getImage(), 0, 0, 1280, 760, null);
        }
        if(game.s == 2){
            g.drawImage(im2.getImage(), 0, 0, 1280, 760, null);
        }
        if(game.s == 3){
            g.drawImage(im3.getImage(), 0, 0, 1280, 760, null);
        }
        if(game.s == 4){
            g.drawImage(im4.getImage(), 0, 0, 1280, 760, null);
        }
        if(game.s == 5){
            g.drawImage(im5.getImage(), 0, 0, 1280, 760, null);
        }
        if(game.s == 6){
            g.drawImage(im6.getImage(), 0, 0, 1280, 760, null);
        }
        if(game.s == 7){
            g.drawImage(im7.getImage(), 0, 0, 1280, 760, null);
        }
        if(game.s == 8){
            g.drawImage(im8.getImage(), 0, 0, 1280, 760, null);
        }
        if(game.s == 9){
            g.drawImage(im9.getImage(), 0, 0, 1280, 760, null);
        }


        //g.drawImage(logo.getImage(), 0, 0, 1280, 760, null);
        g.drawImage(strt.getImage(), 575, 355, 130, 70, null);
        g.drawImage(sett.getImage(),950,-15,260,100,null);
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.getPoint());

        if (e.getX() >= 575 && e.getX() <= 705  && e.getY() >= 355 && e.getY() <= 415) {
            if(game.s == 1){
                game.Blvl1 = true;
                game.strt = false;
                System.out.println("1");
            }
            if(game.s == 2){
                game.Blvl2 = true;
                game.strt = false;
                System.out.println("2");
            }
            if(game.s == 3){
                game.Blvl3 = true;
                game.strt = false;
                System.out.println("3");
            }
            if(game.s == 4){
                game.Blvl4 = true;
                game.strt = false;
                System.out.println("4");
            }
            if(game.s == 5){
                game.Blvl5 = true;
                game.strt = false;
                System.out.println("5");
            }
            if(game.s == 6){
                game.Blvl6 = true;
                game.strt = false;
                System.out.println("6");
            }
            if(game.s == 7){
                game.Blvl7 = true;
                game.strt = false;
                System.out.println("7");
            }
            if(game.s == 8){
                game.Blvl8 = true;
                game.strt = false;
                System.out.println("8");
            }
            if(game.s == 9){
                game.Blvl9 = true;
                game.strt = false;
                System.out.println("9");
            }
            System.out.println("start");
        }
        if (e.getX() >= 945 && e.getX() <= 1210 && e.getY() >= 25 && e.getY() <= 58) {
            game.Bsettings = true;
            System.out.println("settings");
        }
        repaint();
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
}