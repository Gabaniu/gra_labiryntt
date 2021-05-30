package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class Select_Level extends JPanel implements MouseListener {

        game game;
        public Select_Level(game game) {
            this.game = game;
            setSize(1280 + 14, 960 + 14 + 23);
            addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon im = new ImageIcon("src/png/select_level.png");
            g.drawImage(im.getImage(), 0, -60, 1280, 960, null);
        }


        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.println(e.getPoint());
            if (e.getX() >= 50 && e.getX() <= 185 && e.getY() >= 745 && e.getY() <= 800) {
                System.out.println("Back");
                game.Bstart = true;
                game.Bselect = false;
            }
            if (e.getX() >= 280 && e.getX() <= 380 && e.getY() >= 245 && e.getY() <= 365) {
                System.out.println("1_level");
                game.Blvl1 = true;
                game.timer = true;
                game.Bselect = false;
            }
            if (e.getX() >= 580 && e.getX() <= 680 && e.getY() >= 245 && e.getY() <= 365) {
                System.out.println("2_level");
                game.Blvl2 = true;
                game.Bselect = false;
            }
            if (e.getX() >= 880 && e.getX() <= 980 && e.getY() >= 245 && e.getY() <= 365) {
                System.out.println("3_level");
            }
            if (e.getX() >= 280 && e.getX() <= 380 && e.getY() >= 440 && e.getY() <= 560) {
                System.out.println("4_level");
            }
            if (e.getX() >= 580 && e.getX() <= 680 && e.getY() >= 440 && e.getY() <= 560) {
                System.out.println("5_level");
            }
            if (e.getX() >= 880 && e.getX() <= 980 && e.getY() >= 440 && e.getY() <= 560) {
                System.out.println("6_level");
            }
            if (e.getX() >= 280 && e.getX() <= 380 && e.getY() >= 645 && e.getY() <= 765) {
                System.out.println("7_level");
            }
            if (e.getX() >= 580 && e.getX() <= 680 && e.getY() >= 645 && e.getY() <= 765) {
                System.out.println("8_level");
            }
            if (e.getX() >= 880 && e.getX() <= 980 && e.getY() >= 645 && e.getY() <= 765) {
                System.out.println("9_level");
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

