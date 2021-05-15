package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Start extends JPanel implements MouseListener {

game game;
public Start(game game) {
    this.game = game;
    setSize(1280,760);
    addMouseListener(this);
}

    @Override
    public void paintComponent (Graphics g){

        super.paintComponent(g);
        ImageIcon ii = new ImageIcon("src/png/start.png");
        g.drawImage(ii.getImage(), 0, 0, 1280, 760, null);

    }

    @Override
    public void mouseClicked (MouseEvent e) {
        //System.out.println(e.getPoint());


         if (e.getX()>=470 && e.getX()<=745 && e.getY()>=410 && e.getY()<=500) {

             System.out.println("Start");

             game.Bselect = true;
             game.Bstart = false;
             //game.Bhow = false;

         }

         if (e.getX()>=468 && e.getX()<=747 && e.getY()>=540 && e.getY()<=611){

             System.out.println("Quit");

             System.exit(0);

         }
         if (e.getX()>=160 && e.getX()<=370 && e.getY()>=465 && e.getY()<=535){
            System.out.println("Select Player");
            game.Bsplayer = true;
            game.Bstart = false;
         }

         if (e.getX()>=860 && e.getX()<=1070 && e.getY()>=465 && e.getY()<=540){
            System.out.println("How To Play");

             game.Bhow = true;
             game.Bstart = false;
             //game.Bselect = false;

         }
    }

    @Override
    public void mousePressed (MouseEvent e){

    }

    @Override
    public void mouseReleased (MouseEvent e){

    }

    @Override
    public void mouseEntered (MouseEvent e){

    }

    @Override
    public void mouseExited (MouseEvent e){

    }
}