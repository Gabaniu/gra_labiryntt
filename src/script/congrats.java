package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class congrats extends JPanel implements MouseListener {
    public game game;


    public congrats(game game) {
        this.game = game;
        setBounds(0, 0, 1280, 760);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon im1 = new ImageIcon("src/png/congrats.png");
        g.drawImage(im1.getImage(),0,0,1280,760,null);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());

        if (e.getX() >= 645 && e.getX() <= 1080  && e.getY() >= 520 && e.getY() <= 580 ) {
            if(game.s == 1) {
                game.s = 2;
            }
            if(game.s == 2) {
                game.s = 3;
            }
            if(game.s == 3) {
                game.s = 4;
            }
            if(game.s == 4) {
                game.s = 5;
            }
            game.strt = true;
            System.out.println("start");
        }

        if (e.getX() >= 245 && e.getX() <= 460  && e.getY() >= 520 && e.getY() <= 580 ) {
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
