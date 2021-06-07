package script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class lvl5 extends JPanel implements KeyListener, MouseListener {
    //674
    //0
    //645
    int k = 674;
    int kier = 0;
    int i = 108;
    int x = 0;
    int y = 645;

    String j;
    //public JLabel jl = new JLabel();

    boolean jumpp = false;
    boolean right = false;



    game game;

    public lvl5(game game) {
        this.game = game;
        setBounds(0, 0, 1280, 760);
        addKeyListener(this);
        addMouseListener(this);

        /*jl.setBounds(75,10,250,50);
        jl.setFont(new Font("Arial", Font.PLAIN, 30));
        jl.setForeground(Color.black);
        jl.setVisible(true);*/

        Main();

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


    public void Main(){
        if(game.xy == true){
            x =0;
            y = 645;
            k = 674;
        }
        //for(int t = 0; t<9000; t++) {

        // }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);



        ImageIcon im1 = new ImageIcon("src/png/5lvl.png");
        ImageIcon sett = new ImageIcon("src/png/sett.png");

        g.drawImage(im1.getImage(),0,0,1280,760,null);
        g.drawImage(sett.getImage(),950,-15,260,100,null);



        if(game.s == 1) {
            ImageIcon run = new ImageIcon("src/png/newtv6.png");
            ImageIcon jump = new ImageIcon("src/png/n-jump.png");

            //g.drawImage(run.getImage(), 80+x,0+y,110+x,y+54,0,i*108,60,(i*108)+108,null);


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

            //g.drawImage(run.getImage(), 80+x,0+y,110+x,y+54,0,i*108,60,(i*108)+108,null);


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
                right = true;
                for(int f = 0; f<1; f++){
                    x+=5;
                    kier=0;
                    if(x%40 == 0){
                        k++;
                    }
                }

                //System.out.println("0");
                //right = false;
            }
            if(plansza[k+1] == 1){
                System.out.println("1");
            }

        }
        if(e.getKeyCode()==68) {
            if(plansza[k+1] == 0){
                right = true;
                for(int f = 0; f<1; f++){
                    x+=5;
                    kier=0;
                    if(x%40 == 0){
                        k++;
                    }
                }

                //System.out.println("0");
                //right = false;
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
        if(e.getKeyCode()==65) {
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
                    y -= 4;
                    kier = 2;
                }
                if(x%40 == 0){
                    k-=32;
                }
                jumpp = false;
            }
            if(e.getKeyCode()==32 && jumpp == false) {
                if(plansza[k-32] == 0) {
                    jumpp = true;
                    for (int k = 1; k <= 10; k++) {
                        y -= 4;
                        kier = 2;
                    }
                    if(x%40 == 0){
                        k-=32;
                    }
                    jumpp = false;
                }
            /*if(right == true) {
                   if (plansza[k + 32] == 0 && plansza[k + 33] == 0 && plansza[k + 64] == 0) {
                       jumpp = true;
                       for (int k = 1; k <= 10; k++) {
                           y -= 4;
                           x += 7;
                           kier = 2;
                       }
                       jumpp = false;
                    }
                }*/
            }
        }
        //r.jump
        if(e.getKeyCode()==69 && jumpp == false) {
            if (plansza[k - 32] == 0 && plansza[k - 33] == 0 && plansza[k - 64] == 0) {
                jumpp = true;
                for (int k = 1; k <= 10; k++) {
                    y -= 4;
                    x+=7;
                    kier = 2;
                }
                if (x % 40 == 0) {
                    k -= 32;
                }

                jumpp = false;
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //jump
        if(e.getKeyCode()==38) {
            /*if (plansza[k + 32] == 0) {
                for (int k = 1; k <= 10; k++) {
                    y += 4;
                    kier = 2;
                }
                k += 32;
                jumpp = false;
                kier = 0;
            }
            if (plansza[k + 32] == 1){
                jumpp = false;
                kier = 0;
            }*/
            if(e.getKeyCode()==69) {
                if (plansza[k + 32] == 0 && plansza[k + 33] == 0 && plansza[k + 64] == 0) {
                    for (int k = 1; k <= 10; k++) {
                        y += 4;
                        x -= 7;
                        kier = 2;
                    }
                    jumpp = false;
                }
            }
        }
        repaint();
        //System.out.println(plansza[k]);
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
