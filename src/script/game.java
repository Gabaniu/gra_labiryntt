package script;

import javax.swing.*;
import java.awt.*;

public class game {


    public boolean Bstart;
    public boolean Bselect;
    public boolean Bhow;
    public boolean Bsplayer;

    public boolean select1A;
    public boolean select1B;
    public boolean select2A;
    public boolean select2B;


    public JFrame okno;
    public game(){

        Start Start = new Start(this);
        how_to_play how = new how_to_play(this);
        Select_Level Select = new Select_Level(this);
        Select_Player splayer = new Select_Player(this);

        okno = new JFrame();

        ImageIcon im = new ImageIcon("src/png/logo.png");

        okno.setPreferredSize(new Dimension(1280,760));

        okno.add(Start);
        okno.add(Select);
        okno.add(how);
        okno.add(splayer);

        okno.getContentPane().getComponent(0).setVisible(true);
        okno.getContentPane().getComponent(1).setVisible(false);
        okno.getContentPane().getComponent(2).setVisible(false);
        okno.getContentPane().getComponent(3).setVisible(false);

        okno.pack();
        okno.setTitle("Maze Runner");
        okno.setIconImage(im.getImage());
        okno.setBounds(100, 100, 1280, 760);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);

        this.Bstart = true;
        this.Bhow = false;
        this.Bselect = false;
        this.Bsplayer = false;

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

        watek watek = new watek(this);
        watek.run();
    }

}