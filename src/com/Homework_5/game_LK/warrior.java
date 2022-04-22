package com.Homework_5.game_LK;

public class warrior {
    private String name ;
    private String weapon;
    private double hp;
    private double power;

    public warrior(String name, String weapon, double hp, double power) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
        this.power = power;
    }

    public void attack(warrior target){
        target.power -= this.hp;
        System.out.println(this.name + " поцілив у " + target.name);
        System.out.println(target.name + " power: " + target.power);

        if(target.power <=0 ) {
            System.out.println(target.name + "Prograv");
        }
        if (target.power > 0) {
            System.out.println(target.name + "Winner");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
