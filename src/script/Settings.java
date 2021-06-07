package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Settings extends JPanel implements MouseListener {

    game game;
    public Settings(game game) {
        this.game = game;
        setSize(1280, 760);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon im = new ImageIcon("src/png/settings.png");
        ImageIcon set = new ImageIcon("src/png/sett.png");

        ImageIcon im1 = new ImageIcon("src/png/1lvl.png");
        ImageIcon im2 = new ImageIcon("src/png/2lvl.png");


        if(game.s == 1){
            g.drawImage(im1.getImage(), 0, 0, 1280, 760, null);
            g.drawImage(set.getImage(), 950, -15, 260, 100, null);

        }
        if(game.s == 2){
            g.drawImage(im2.getImage(), 0, 0, 1280, 760, null);
            g.drawImage(set.getImage(), 950, -15, 260, 100, null);

        }

        g.drawImage(im.getImage(), 320, 130, 640, 480, null);


    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());
        if (e.getX() >= 0 && e.getX() <= 950 && e.getY() >= 0 && e.getY() <= 129) {
            game.strt = true;
            game.Bsettings = false;
            }
        if (e.getX() >= 0 && e.getX() <= 329 && e.getY() >= 0 && e.getY() <= 760) {
            game.strt = true;
            game.Bsettings = false;
        }
        if (e.getX() >= 0 && e.getX() <= 950 && e.getY() >= 611 && e.getY() <= 760) {
            game.strt = true;
            game.Bsettings = false;
        }
        if (e.getX() >= 960 && e.getX() <= 1280 && e.getY() >= 0 && e.getY() <= 760) {
            game.strt = true;
            game.Bsettings = false;
        }

        if (e.getX() >= 570 && e.getX() <= 680 && e.getY() >= 260 && e.getY() <= 270) {
            System.out.println("restart");
            game.strt = true;
            game.Blvl1 = false;
            game.xy = true;
            game.Bsettings = false;
        }
        if (e.getX() >= 545 && e.getX() <= 730 && e.getY() >= 325 && e.getY() <= 340) {
            System.out.println("back to game");
            game.Blvl1 = true;
            game.Bsettings = false;
        }
        if (e.getX() >= 540 && e.getX() <= 730 && e.getY() >= 365 && e.getY() <= 375) {
            System.out.println("change lvl");
            game.Bselect = true;
            game.Bsettings = false;
        }
        if (e.getX() >= 535 && e.getX() <= 735 && e.getY() >= 400 && e.getY() <= 415) {
            System.out.println("change player");
            game.Bsplayer = true;
            game.Bsettings = false;
        }
        if (e.getX() >= 550 && e.getX() <= 730 && e.getY() >= 440 && e.getY() <= 455) {
            System.out.println("h t p?");
            game.Bhow = true;
            game.Bsettings = false;
        }
        if (e.getX() >= 565 && e.getX() <= 710 && e.getY() >= 475 && e.getY() <= 490) {
            System.out.println("g t m");
            game.Bstart = true;
            game.Bsettings = false;
        }
        if (e.getX() >= 605 && e.getX() <= 670 && e.getY() >= 550 && e.getY() <= 560) {
            System.out.println("quit");
            System.exit(0);
        }

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
}

