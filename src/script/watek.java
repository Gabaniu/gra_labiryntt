package script;

public class watek extends Thread{
    public game game;

    public watek(game game) {
        this.game = game;
    }

    public void windows() {
        if (game.Bstart == false) {
            game.okno.getContentPane().getComponent(0).setVisible(false);
        }
        if (game.Bstart == true) {
            game.okno.getContentPane().getComponent(0).setVisible(true);
        }
        if (game.Bselect == false) {
            game.okno.getContentPane().getComponent(1).setVisible(false);
        }
        if (game.Bselect == true) {
            game.okno.getContentPane().getComponent(1).setVisible(true);
        }
        if (game.Bhow == false) {
            game.okno.getContentPane().getComponent(2).setVisible(false);
        }
        if (game.Bhow == true) {
            game.okno.getContentPane().getComponent(2).setVisible(true);
        }
        if (game.Bsplayer == false) {
            game.okno.getContentPane().getComponent(3).setVisible(false);
        }
        if (game.Bsplayer == true) {
            game.okno.getContentPane().getComponent(3).setVisible(true);
        }
        if (game.Bsettings == false) {
            game.okno.getContentPane().getComponent(4).setVisible(false);
        }
        if (game.Bsettings == true) {
            game.okno.getContentPane().getComponent(4).setVisible(true);
        }
        if (game.timer == false) {
            game.okno.getContentPane().getComponent(5).setVisible(false);
        }
        if (game.timer == true) {
            game.okno.getContentPane().getComponent(5).setVisible(true);
        }
        if (game.strt == false) {
            game.okno.getContentPane().getComponent(6).setVisible(false);
        }
        if (game.strt == true) {
            game.okno.getContentPane().getComponent(6).setVisible(true);
        }
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