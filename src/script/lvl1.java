package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class lvl1 extends JPanel implements KeyListener, MouseListener {

    public int i = 0;
    public String j;
    public JLabel jl = new JLabel();


    game game;
    public lvl1 (game game){
        this.game = game;
        setSize(1280 + 14, 960 + 14 + 23);
        addKeyListener(this);
        addMouseListener(this);

        jl.setBounds(75,10,250,50);
        jl.setFont(new Font("Arial", Font.PLAIN, 30));
        jl.setForeground(Color.black);
        jl.setVisible(true);
    }



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon im1 = new ImageIcon("src/png/lvl1.png");
        ImageIcon sett = new ImageIcon("src/png/sett.png");
        ImageIcon strt = new ImageIcon("src/png/strt.png");
        ImageIcon logo = new ImageIcon("src/png/logo.png");

       /* g.drawImage(logo.getImage(), 0, 0, 1280, 760, null);
        g.drawImage(strt.getImage(), 575, 355, 130, 70, null);
        g.drawImage(sett.getImage(), 950, -15, 260, 100, null);
*/

        g.drawImage(im1.getImage(), 0, -40, 1280, 960, null);
        g.drawImage(sett.getImage(), 950, -5, 260, 100, null);


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

        /*if (e.getX() >= 575 && e.getX() <= 345 && e.getY() >= 705 && e.getY() <= 415) {
            setter = true;
            System.out.println("setter");
        }*/

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
