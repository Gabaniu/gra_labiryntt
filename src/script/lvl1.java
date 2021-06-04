package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class lvl1 extends JPanel implements KeyListener, MouseListener {

    int k = 674;
    int kier = 0;
    int i = 108;
    int x = 0;
    int y = 645;

    String j;
    //public JLabel jl = new JLabel();

    boolean jumpp = false;



    game game;

    public lvl1(game game) {
        this.game = game;
        setBounds(0, 0, 1280, 760);
        addKeyListener(this);
        addMouseListener(this);

        /*jl.setBounds(75,10,250,50);
        jl.setFont(new Font("Arial", Font.PLAIN, 30));
        jl.setForeground(Color.black);
        jl.setVisible(true);*/


    }

    public int[] plansza = {

            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1, 1,
            1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1,
            1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1,
            1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,

    };



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        /*if(game.xy == true){
            x = game.fx;
            y = game.fy;
            k = game.fk;
        }*/

        ImageIcon im1 = new ImageIcon("src/png/1lvl.png");
        ImageIcon sett = new ImageIcon("src/png/sett.png");

        g.drawImage(im1.getImage(),0,0,1280,760,null);
        g.drawImage(sett.getImage(),950,-15,260,100,null);

        if(game.s == 1) {
            ImageIcon run = new ImageIcon("src/png/newtv6.png");
            ImageIcon jump = new ImageIcon("src/png/n-jump.png");

            if(kier == 0){
                g.drawImage(run.getImage(), 80+x,0+y,110+x,y+54,0,i*108,60,(i*108)+108,null);
            }
            if(kier == 1) {
                g.drawImage(run.getImage(), 110 + x, 0+y, 80 + x, y+54, 0,i*108,60,(i*108)+108, null);
            }
            if(kier==2){
                g.drawImage(jump.getImage(), 80 + x, 0+y, 110 + x, y+54, 0,i*108,60,(i*108)+108, null);
            }
        }
        if(game.s == 2) {
            ImageIcon run = new ImageIcon("src/png/thomas.png");

            if(kier == 0){
                g.drawImage(run.getImage(), 80+x,0+y,110+x,y+54,0,i*108,60,(i*108)+108,null);
            }
            if(kier == 1) {
                g.drawImage(run.getImage(), 110 + x, 0+y, 80 + x, y+54, 0,i*108,60,(i*108)+108, null);
            }
            /*if(kier==2){
                g.drawImage(jump.getImage(), 80 + x, 0+y, 110 + x, y+54, 0,i*108,60,(i*108)+108, null);
            }*/
        }

            //sprawdzanie czy jest pogloga na dole
        /*while(game.strt == false) {
            if (plansza[k + 32] == 0) {
                for (int k = 1; k <= 10; k++) {
                    y += 3;
                    kier = 2;
                }
                k+=32;
                jumpp = false;
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(i < 4)
            i++;
        else
            i=0;
        //right
        if(e.getKeyCode()==39) {
            if(plansza[k+1] == 0){
                for(int f = 0; f<1; f++){
                    x+=5;
                    kier=0;
                    if(x%40 == 0){
                        k++;
                    }
                }

                //System.out.println("0");
            }
            if(plansza[k+1] == 1){
                System.out.println("1");
            }

        }
        //left
        if(e.getKeyCode()==37) {
            if(plansza[k-1] == 0){
                for(int f = 0; f<1; f++) {
                    x-=5;
                    kier=1;
                    if(x%40 == 0){
                        k--;
                    }
                }
                //System.out.println("0");
            }
            if(plansza[k-1] == 1){
                System.out.println("1");
            }
            kier=1;
        }
        //jump
        if(e.getKeyCode()==38 && jumpp == false) {
            if(plansza[k-32] == 0) {
                jumpp = true;
                for (int k = 1; k <= 10; k++) {
                    y -= 3;
                    kier = 2;
                }
                k-=32;
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //jump
        if(e.getKeyCode()==38) {
            for (int k = 1; k <= 10; k++) {
                y += 3;
                kier = 2;
            }
            k+=32;
            jumpp = false;
            kier = 0;
        }
        repaint();
        System.out.println(plansza[k]);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());

        if (e.getX() >= 575 && e.getX() <= 705  && e.getY() >= 355 && e.getY() <= 415 ) {
            game.strt = false;
            System.out.println("start");
        }

        if (e.getX() >= 945 && e.getX() <= 1210 && e.getY() >= 25 && e.getY() <= 58) {
            game.Bsettings = true;
            System.out.println("settings");
            game.fx = 0;
            game.fy = 645;
            game.fk = 674;
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
