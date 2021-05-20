package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class lvl2 extends JPanel implements KeyListener {

    game game;
    public lvl2 (game game){
        this.game = game;
        setSize(1280,760);
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon im = new ImageIcon("src/png/lvl2.png");


        g.drawImage(im.getImage(), 0, 0, 1280, 760, null);
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
}
