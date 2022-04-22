package com.Lesson5_abstract_static_final.game_Sasha;


public class Main {

    public static void main(String[] args) {
        RifleMan rifleman = new RifleMan("Rifleman","rifle",1000,300,1);
        rifleman.getALLInfo();

        BzukaMan bazukaMan = new BzukaMan("Bazukaman", "bazuka",2000,600,1);
        bazukaMan.getALLInfo();

        SecretAgent secretAgent = new SecretAgent("SecretAgent","Sniper rifle", 900,700,2);
        secretAgent.getALLInfo();

        fight(rifleman,bazukaMan,secretAgent);
    }


    public static void fight(Warrior w1, Warrior w2, Warrior w3){
        System.out.println("FIGHT");
        while ((w1.hasHp() && w2.hasHp()) || (w1.hasHp() && w3.hasHp()) || (w2.hasHp() && w3.hasHp())) {
            if (w1.hasHp()) {
                if (w2.hasHp()) {
                    w1.hit(w2);
                }
                if (w3.hasHp()) {
                    w1.hit(w1);
                }
            }
            if (w2.hasHp()) {
                if (w1.hasHp()) {
                    w2.hit(w1);
                }
                if (w3.hasHp()) {
                    w2.hit(w3);
                }
            }

            if (w3.hasHp()) {
                if (w2.hasHp()) {
                    w3.hit(w2);
                }
                if (w1.hasHp()) {
                    w3.hit(w1);
                }
            }
            if (w1.hasMedKit()) {
                if (w1.hasHp()) {
                    w1.useMedKit();
                }
            }
            if (w2.hasMedKit()) {
                if (w2.hasHp()) {
                    w2.useMedKit();
                }
            }
            if (w3.hasMedKit()) {
                if (w3.hasHp()) {
                    w3.useMedKit();
                }
            }
        }
        if (w1.hasHp() == false && w2.hasHp() == false) {
            System.out.println("Winner is " + w3.getName());
        } else if (w1.hasHp() == false && w3.hasHp() == false) {
            System.out.println("Winner is " + w2.getName());
        } else {
            System.out.println("Winner is " + w1.getName());
        }
    }
}
