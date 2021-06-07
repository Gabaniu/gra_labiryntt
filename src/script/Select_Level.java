package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Select_Level extends JPanel implements MouseListener {

    game game;

    public Select_Level(game game) {
        this.game = game;
        setSize(1280, 760);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon im = new ImageIcon("src/png/select_level.png");
        g.drawImage(im.getImage(), 0, 0, 1280, 760, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println(e.getPoint());
        if (e.getX() >= 47 && e.getX() <= 191 && e.getY() >= 636 && e.getY() <= 684) {
            System.out.println("Back");
            game.Bstart = true;
            game.Bselect = false;
        }
        if (e.getX() >= 283 && e.getX() <= 385 && e.getY() >= 240 && e.getY() <= 341) {
            System.out.println("1_level");
            //game.Blvl1 = true;
            game.strt = true;
            game.s = 1;
            //game.timer = true;
            //game.win = false;
            game.Bselect = false;
        }
        if (e.getX() >= 572 && e.getX() <= 687 && e.getY() >= 240 && e.getY() <= 342) {
            System.out.println("2_level");
            //game.Blvl2 = true;
            game.strt = true;
            game.s = 2;
            game.Bselect = false;
        }
        if (e.getX() >= 875 && e.getX() <= 977 && e.getY() >= 239 && e.getY() <= 341) {
            System.out.println("3_level");
            game.strt = true;
            game.s = 3;
            game.Bselect = false;
        }
        if (e.getX() >= 280 && e.getX() <= 385 && e.getY() >= 398 && e.getY() <= 500) {
            System.out.println("4_level");
            game.strt = true;
            game.s = 4;
            game.Bselect = false;
        }
        if (e.getX() >= 573 && e.getX() <= 687 && e.getY() >= 400 && e.getY() <= 500) {
            System.out.println("5_level");
            game.strt = true;
            game.s = 5;
            game.Bselect = false;
        }
        if (e.getX() >= 875 && e.getX() <= 975 && e.getY() >= 400 && e.getY() <= 500) {
            System.out.println("6_level");
            game.strt = true;
            game.s = 6;
            game.Bselect = false;

        }
        if (e.getX() >= 282 && e.getX() <= 386 && e.getY() >= 556 && e.getY() <= 658) {
            System.out.println("7_level");
            game.strt = true;
            game.s = 7;
            game.Bselect = false;
        }
        if (e.getX() >= 572 && e.getX() <= 687 && e.getY() >= 556 && e.getY() <= 657) {
            System.out.println("8_level");
            game.strt = true;
            game.s = 8;
            game.Bselect = false;
        }
        if (e.getX() >= 876 && e.getX() <= 977 && e.getY() >= 555 && e.getY() <= 658) {
            System.out.println("9_level");
            game.strt = true;
            game.s = 9;
            game.Bselect = false;
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