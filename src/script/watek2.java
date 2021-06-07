package script;

public class watek2 extends Thread {
    public game game;

    public lvl1 l1;

    public watek2(game game, lvl1 l1) {
        this.game = game;
        this.l1 = l1;
    }

    public void windows() {
        if (game.Blvl1 == false) {
            game.okno.getContentPane().getComponent(7).setVisible(false);
        }
        if (game.Blvl1 == true) {
            game.okno.getContentPane().getComponent(7).setVisible(true);
        }
        if (game.Blvl2 == false) {
            game.okno.getContentPane().getComponent(8).setVisible(false);
        }
        if (game.Blvl2 == true) {
            game.okno.getContentPane().getComponent(8).setVisible(true);
        }
        if (game.Blvl3 == false) {
            game.okno.getContentPane().getComponent(9).setVisible(false);
        }
        if (game.Blvl3 == true) {
            game.okno.getContentPane().getComponent(9).setVisible(true);
        }
        /*if (game.Blvl4 == false) {
            game.okno.getContentPane().getComponent(7).setVisible(false);
        }
        if (game.Blvl4 == true) {
            game.okno.getContentPane().getComponent(7).setVisible(true);
        }
        if (game.Blvl5 == false) {
            game.okno.getContentPane().getComponent(8).setVisible(false);
        }
        if (game.Blvl5 == true) {
            game.okno.getContentPane().getComponent(8).setVisible(true);
        }
        if (game.Blvl6 == false) {
            game.okno.getContentPane().getComponent(9).setVisible(false);
        }
        if (game.Blvl6 == true) {
            game.okno.getContentPane().getComponent(9).setVisible(true);
        }
        if (game.Blvl7 == false) {
            game.okno.getContentPane().getComponent(7).setVisible(false);
        }
        if (game.Blvl7 == true) {
            game.okno.getContentPane().getComponent(7).setVisible(true);
        }
        if (game.Blvl8 == false) {
            game.okno.getContentPane().getComponent(8).setVisible(false);
        }
        if (game.Blvl8 == true) {
            game.okno.getContentPane().getComponent(8).setVisible(true);
        }
        if (game.Blvl9 == false) {
            game.okno.getContentPane().getComponent(9).setVisible(false);
        }
        if (game.Blvl9 == true) {
            game.okno.getContentPane().getComponent(9).setVisible(true);
        }*/
    }
    public void run(){

        while (true) {
            windows();
            try {
                Thread.sleep(20 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}