package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class how_to_play extends JPanel implements MouseListener {

        game game;
        public how_to_play (game game){
            this.game = game;
            setSize(1280 + 14, 760);
            addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            ImageIcon ia = new ImageIcon("src/png/how_to_play.png");
            g.drawImage(ia.getImage(),0,0,1280, 760, null);
        }



        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.println(e.getPoint());
            if (e.getX() >= 50 && e.getX() <= 190 && e.getY() >= 675 && e.getY() <= 720) {
                System.out.println("back");

                game.Bstart = true;
                game.Bhow = false;
            }

            if (e.getX() >= 900 && e.getX() <= 1240 && e.getY() >= 625 && e.getY() <= 735) {
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
