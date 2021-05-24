/*package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Strt extends JPanel implements MouseListener {

    game game;
    public Strt (game game){
        this.game = game;
        setSize(1280,760);
        addMouseListener(this);
    }

    boolean setter;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon sett = new ImageIcon("src/png/sett.png");
        ImageIcon strt = new ImageIcon("src/png/strt.png");
        ImageIcon logo = new ImageIcon("src/png/logo.png");

        g.drawImage(logo.getImage(), 0, 0, 1280, 760, null);
        g.drawImage(strt.getImage(), 575, 355, 130, 70, null);
        g.drawImage(sett.getImage(), 950, -15, 260, 100, null);

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());

        if (e.getX() >= 575 && e.getX() <= 345 && e.getY() >= 705 && e.getY() <= 415) {
            game.Blvl1 = true;
            game.Bstrt = false;
        }

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
}*/
