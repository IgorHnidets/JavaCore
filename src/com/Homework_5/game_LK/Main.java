package com.Homework_5.game_LK;


public class Main {

    public static void main(String[] args) {
        warrior1 warrior1 = new warrior1("Воїн №1", "ніж", 200, 1000);
        System.out.println(warrior1.getName() + "\nhp: " + warrior1.getHp() + "\nзброя: " + warrior1.getWeapon()
                + "(" + warrior1.getPower() + ")");

        System.out.println();

        warrior2 warrior2 = new warrior2("Воїн №2", "шабля", 300, 800);
        System.out.println(warrior2.getName() + "\nhp: " + warrior2.getHp() + "\nзброя: " + warrior2.getWeapon()
                + "(" + warrior2.getPower() + ")");

        System.out.println();

        warrior3 warrior3 = new warrior3("Воїн №3", "пістолет", 500, 500);
        System.out.println(warrior3.getName() + "\nhp: " + warrior3.getHp() + "\nзброя: " + warrior2.getWeapon()
                + "(" + warrior3.getPower() + ")");

        System.out.println("\nБитва!!!\n");

        warrior2.attack(warrior1);
        System.out.println();

        warrior1.attack(warrior3);
        System.out.println();

        warrior3.attack(warrior1);
        System.out.println();

        warrior2.attack(warrior3);
        System.out.println();

        warrior2.attack(warrior1);
        System.out.println();

        System.out.println("Переміг:" + warrior2.getName());
    }
}
