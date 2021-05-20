package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class how_to_play extends JPanel implements MouseListener {

        game game;
        public how_to_play (game game){
            this.game = game;
            setSize(1280,760);
            addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            ImageIcon ia = new ImageIcon("src/png/pixil-frame-0 (3).png");
            g.drawImage(ia.getImage(),-30,-30,1280, 760, null);
        }



        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(e.getPoint());
            if (e.getX() >= 20 && e.getX() <= 160 && e.getY() >= 645 && e.getY() <= 690) {
                System.out.println("back");

                game.Bstart = true;
                game.Bhow = false;
            }

            if (e.getX() >= 870 && e.getX() <= 1210 && e.getY() >= 590 && e.getY() <= 705) {
                System.out.println("start");

                game.Bselect = true;
                game.Bhow = false;


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
