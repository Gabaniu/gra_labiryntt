package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class lvl1 extends JPanel implements KeyListener, MouseListener {

    game game;
    public lvl1 (game game){
        this.game = game;
        setSize(1280,760);
        addKeyListener(this);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon im1 = new ImageIcon("src/png/lvl1.png");
        ImageIcon sett = new ImageIcon("src/png/sett.png");


        g.drawImage(im1.getImage(), 0, 0, 1280, 760, null);
        g.drawImage(sett.getImage(), 950, -15, 260, 100, null);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());

        if (e.getX() >= 945 && e.getX() <= 1210 && e.getY() >= 10 && e.getY() <= 68) {

            game.Bsettings = true;


            System.out.println("settings");
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
