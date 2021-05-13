package script;

import javax.swing.*;
import java.awt.*;

public class linki {


    public boolean Bstart = true;
    public boolean Bselect;

    public JFrame okno;
    public linki(){

        Start Start = new Start(this);
        Select_Level Select = new Select_Level(this);

        okno = new JFrame();

        ImageIcon im = new ImageIcon("src/png/logo.png");

        okno.setPreferredSize(new Dimension(1280,760));

        okno.add(Start);
        okno.add(Select);

        okno.getContentPane().getComponent(0).setVisible(true);
        okno.getContentPane().getComponent(1).setVisible(false);

        okno.pack();
        okno.setTitle("Maze Runner");
        okno.setIconImage(im.getImage());
        okno.setBounds(100, 100, 1280, 760);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);
        this.Bstart = true;
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

        watek watek = new watek(this);
        watek.run();
    }

}