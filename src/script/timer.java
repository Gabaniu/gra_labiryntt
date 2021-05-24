package script;

import javax.swing.*;
import java.awt.*;

public class timer extends JPanel {

    int i = 0;
    String j;
    JLabel jl = new JLabel();

    game game;
    public timer (game game){
        this.game = game;
        setBounds(75,10,250,50);




        jl.setBounds(75,10,250,50);
        jl.setFont(new Font("Arial", Font.PLAIN, 30));
        jl.setForeground(Color.black);
        jl.setVisible(true);
    }

    public void start() {

        while(i < 300){
            j = String.valueOf(i);
            jl.setText(j);
            System.out.println(i);
            i++;
            repaint();
            try {
                Thread.sleep(1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
