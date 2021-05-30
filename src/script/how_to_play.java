package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class how_to_play extends JPanel implements MouseListener {

        game game;
        public how_to_play (game game){
            this.game = game;
            setSize(1280 + 14, 480 + 14 + 23);
            addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            ImageIcon ia = new ImageIcon("src/png/how_to_play.png");
            g.drawImage(ia.getImage(),-10,-100,1280, 960, null);
        }



        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.println(e.getPoint());
            if (e.getX() >= 40 && e.getX() <= 140 && e.getY() >= 750 && e.getY() <= 810) {
                System.out.println("back");

                game.Bstart = true;
                game.Bhow = false;
            }

            if (e.getX() >= 890 && e.getX() <= 1230 && e.getY() >= 685 && e.getY() <= 830) {
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
