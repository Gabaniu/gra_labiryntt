package script;

import javax.swing.*;
import java.awt.*;

public class game {


    public boolean Bstart;
    public boolean Bselect;
    public boolean Bhow;
    public boolean Bsplayer;
    public boolean Bsettings;

    public boolean move;

    public boolean timer;

    public boolean Blvl1;
    public boolean Blvl2;
    public boolean Blvl3;
    public boolean Blvl4;
    public boolean Blvl5;
    public boolean Blvl6;
    public boolean Blvl7;
    public boolean Blvl8;
    public boolean Blvl9;

    public boolean basic;
    public boolean select1A;
    public boolean select1B;
    public boolean select2A;
    public boolean select2B;


    public boolean ch_n;
    public boolean ch_th;
    public boolean ch_mi;
    public boolean ch_t;

    public boolean n_o;
    public boolean tho_o;
    public boolean te_o;
    public boolean m_o;

    public boolean strt;

    public boolean xy = false;

    public int s = 0;
    int p = 1;

    public int fx = 0;
    public int fy = 0;
    public int fk = 0;

    public JFrame okno;
    public game(){

        Start Start = new Start(this);
        how_to_play how = new how_to_play(this);
        Select_Level Select = new Select_Level(this);
        Select_Player splayer = new Select_Player(this);
        Settings sett = new Settings(this);
        //move mv = new move(this);
        Strt st = new Strt(this);
        timer tim = new timer(this);


        lvl1 l1 = new lvl1(this);
        lvl2 l2 = new lvl2(this);
        lvl3 l3 = new lvl3(this);
        /*lvl4 l4 = new lvl4(this);
        lvl5 l5 = new lvl5(this);
        lvl6 l6 = new lvl6(this);
        lvl4 l7 = new lvl4(this);
        lvl5 l8 = new lvl5(this);
        lvl6 l9 = new lvl6(this);*/

        okno = new JFrame();

        ImageIcon im = new ImageIcon("src/png/logo.png");

        okno.setPreferredSize(new Dimension(1280,760));

        okno.add(Start);
        okno.add(Select);
        okno.add(how);
        okno.add(splayer);
        okno.add(sett);

        okno.add(tim);

        okno.add(st);

        okno.add(l1);
        okno.add(l2);
        okno.add(l3);
        /*okno.add(l4);
        okno.add(l5);
        okno.add(l6);
        okno.add(l7);
        okno.add(l8);
        okno.add(l9);*/

        //okno.add(mv);

        okno.getContentPane().getComponent(0).setVisible(true);
        okno.getContentPane().getComponent(1).setVisible(false);
        okno.getContentPane().getComponent(2).setVisible(false);
        okno.getContentPane().getComponent(3).setVisible(false);
        okno.getContentPane().getComponent(4).setVisible(false);
        okno.getContentPane().getComponent(5).setVisible(false);
        okno.getContentPane().getComponent(6).setVisible(false);
        okno.getContentPane().getComponent(7).setVisible(false);
        okno.getContentPane().getComponent(8).setVisible(false);
        /*okno.getContentPane().getComponent(9).setVisible(false);
        okno.getContentPane().getComponent(10).setVisible(false);
        okno.getContentPane().getComponent(11).setVisible(false);
        okno.getContentPane().getComponent(12).setVisible(false);
        okno.getContentPane().getComponent(13).setVisible(false);
        okno.getContentPane().getComponent(14).setVisible(false);
        okno.getContentPane().getComponent(15).setVisible(false);*/


        okno.addKeyListener(l1);
        okno.addKeyListener(l2);
        okno.addKeyListener(l3);
        /*okno.addKeyListener(l4);
        okno.addKeyListener(l5);
        okno.addKeyListener(l6);
        okno.addKeyListener(l7);
        okno.addKeyListener(l8);
        okno.addKeyListener(l9);*/


        okno.addMouseListener(l1);
        okno.addMouseListener(l2);
        okno.addMouseListener(l3);
        /*okno.addMouseListener(l4);
        okno.addMouseListener(l5);
        okno.addMouseListener(l6);
        okno.addMouseListener(l7);
        okno.addMouseListener(l8);
        okno.addMouseListener(l9);*/

        okno.pack();
        okno.setTitle("Maze Runner");
        okno.setIconImage(im.getImage());
        okno.setBounds(100, 100, 1280 + 14, 760 + 14 + 23);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);

        this.Bstart = true;

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

        watek watek = new watek(this, l1);
        watek.start();

        watek2 watek2 = new watek2(this, l1);
        watek2.start();

    }

}