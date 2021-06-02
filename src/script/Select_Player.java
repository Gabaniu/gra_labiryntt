package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Select_Player extends JPanel implements MouseListener {

    game game;

    public Select_Player(game game) {
        this.game = game;
        setSize(1280, 760);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon im = new ImageIcon("src/png/select-player.png");
        ImageIcon im1 = new ImageIcon("src/png/select-1A.png");
        ImageIcon im2 = new ImageIcon("src/png/select-1B.png");
        ImageIcon im3 = new ImageIcon("src/png/select-2A.png");
        ImageIcon im4 = new ImageIcon("src/png/select-2B.png");

        ImageIcon im5 = new ImageIcon("src/png/ch.newt.png");
        ImageIcon im6 = new ImageIcon("src/png/ch_th.png");
        ImageIcon im7 = new ImageIcon("src/png/ch_mi.png");
        ImageIcon im8 = new ImageIcon("src/png/ch_t.png");

        ImageIcon o1 = new ImageIcon("src/png/n_o.png");
        ImageIcon o2 = new ImageIcon("src/png/tho_o.png");
        ImageIcon o3 = new ImageIcon("src/png/te_o.png");
        ImageIcon o4 = new ImageIcon("src/png/m_o.png");


        game.basic = true;

        game.ch_n = true;
        game.ch_th = true;
        game.ch_mi = true;
        game.ch_t = true;

        game.n_o = true;
        game.tho_o = true;
        game.te_o = true;
        game.m_o = true;

        if (game.basic == true) {
            g.drawImage(im.getImage(), 0, 0, 1280, 760, null);
        }
        if (game.select1A == true) {
            g.drawImage(im1.getImage(), 0, 0, 1280, 760, null);
        }
        if (game.select1B == true) {
            g.drawImage(im2.getImage(), 0, 0, 1280, 760, null);
        }
        if (game.select2A == true) {
            g.drawImage(im3.getImage(), 0, 0, 1280, 760, null);
        }
        if (game.select2B == true) {
            g.drawImage(im4.getImage(), 0, 0, 1280, 760, null);
        }


        if (game.ch_n == true) {
            g.drawImage(im5.getImage(), 230, 230, 90, 148, null);
        }
        if (game.ch_th == true) {
            g.drawImage(im6.getImage(), 640, 230, 90, 156, null);
        }
        if (game.ch_mi == true) {
            g.drawImage(im7.getImage(), 230, 410, 90, 162, null);
        }
        if (game.ch_t == true) {
            g.drawImage(im8.getImage(), 640, 410, 90, 162, null);
        }


        if (game.n_o == true) {
            g.drawImage(o1.getImage(), 250, 220, 380, 180, null);
        }
        if (game.tho_o == true) {
            g.drawImage(o2.getImage(), 600, 220, 530, 230, null);
        }
        if (game.te_o == true) {
            g.drawImage(o3.getImage(), 570, 400, 530, 230, null);
        }
        if (game.m_o == true) {
            g.drawImage(o4.getImage(), 180, 400, 530, 230, null);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println(e.getPoint());
        if (e.getX() >= 90 && e.getX() <= 275 && e.getY() >= 665 && e.getY() <= 728) {
            System.out.println("Back");

            game.Bstart = true;
            game.Bsplayer = false;
        }
        if (e.getX() >= 880 && e.getX() <= 1192 && e.getY() >= 660 && e.getY() <= 734) {
            System.out.println("confirm");
            game.Bselect = true;
            game.Bsplayer = false;
        }


        if (e.getX() >= 228 && e.getX() <= 634 && e.getY() >= 220 && e.getY() <= 390) {
            System.out.println("1 player");

            game.select1A = true;
            game.select1B = false;
            game.select2A = false;
            game.select2B = false;

            repaint();
        }
        if (e.getX() >= 643 && e.getX() <= 1050 && e.getY() >= 220 && e.getY() <= 390) {
            System.out.println("2 player");

            game.select1B = true;
            game.select1A = false;
            game.select2A = false;
            game.select2B = false;

            repaint();
        }
        if (e.getX() >= 228 && e.getX() <= 633 && e.getY() >= 397 && e.getY() <= 572) {
            System.out.println("3 player");

            game.select2A = true;
            game.select1B = false;
            game.select1A = false;
            game.select2B = false;

            repaint();
        }
        if (e.getX() >= 643 && e.getX() <= 1049 && e.getY() >= 397 && e.getY() <= 572) {
            System.out.println("4 player");

            game.select2B = true;
            game.select1B = false;
            game.select1A = false;
            game.select2A = false;

            repaint();
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