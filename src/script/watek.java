package script;

public class watek extends Thread {
    public game game;

    public lvl1 l1;

    public watek(game game, lvl1 l1) {
        this.game = game;
        this.l1 = l1;
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
        /*if (game.Blvl3 == false) {
            game.okno.getContentPane().getComponent(9).setVisible(false);
        }
        if (game.Blvl3 == true) {
            game.okno.getContentPane().getComponent(9).setVisible(true);
        }
        if (game.Blvl4 == false) {
            game.okno.getContentPane().getComponent(10).setVisible(false);
        }
        if (game.Blvl4 == true) {
            game.okno.getContentPane().getComponent(10).setVisible(true);
        }
        if (game.Blvl5 == false) {
            game.okno.getContentPane().getComponent(11).setVisible(false);
        }
        if (game.Blvl5 == true) {
            game.okno.getContentPane().getComponent(11).setVisible(true);
        }
        if (game.Blvl6 == false) {
            game.okno.getContentPane().getComponent(12).setVisible(false);
        }
        if (game.Blvl6 == true) {
            game.okno.getContentPane().getComponent(12).setVisible(true);
        }
        if (game.Blvl7 == false) {
            game.okno.getContentPane().getComponent(13).setVisible(false);
        }
        if (game.Blvl7 == true) {
            game.okno.getContentPane().getComponent(13).setVisible(true);
        }
        if (game.Blvl8 == false) {
            game.okno.getContentPane().getComponent(14).setVisible(false);
        }
        if (game.Blvl8 == true) {
            game.okno.getContentPane().getComponent(14).setVisible(true);
        }
        if (game.Blvl9 == false) {
            game.okno.getContentPane().getComponent(15).setVisible(false);
        }
        if (game.Blvl9 == true) {
            game.okno.getContentPane().getComponent(15).setVisible(true);
        }
        if (game.congrats == false) {
            game.okno.getContentPane().getComponent(16).setVisible(false);
        }
        if (game.congrats == true) {
            game.okno.getContentPane().getComponent(16).setVisible(true);
        }
        if (game.over == false) {
            game.okno.getContentPane().getComponent(17).setVisible(false);
        }
        if (game.over == true) {
            game.okno.getContentPane().getComponent(17).setVisible(true);
        }*/
    }

    public void podloga(){
        //sprawdzanie czy jest pogloga na dole
            /*if (game.strt == false /*&& l1.jumpp == false && l1.jmove == false) {
                if ((l1.plansza[l1.k + 32] == 0)) {
                    for (int k = 1; k <= 10; k++) {
                        l1.y += 4;
                        l1.kier = 2;
                    }
                    l1.k += 32;
                    l1.repaint();
                }


                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }*/
    }
    public void bok(){
        /*if (game.strt == false && ) {
                if ((l1.plansza[l1.k + 1] == 0)) {

                }


                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }*/
    }

    public void run() {

        while (true) {
            windows();
            podloga();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}