package com.Lesson5_abstract_static_final.game_Sasha;

abstract class Warrior {
    private String name;
    private String weapon;
    protected int hp;
    protected int medkit;

    public Warrior(String name, String weapon, int hp, int medkit) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
        this.medkit = medkit;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHp() {
        return hp;
    }

    public abstract int getDamage();

    public abstract boolean hasMedKit();

    public abstract boolean hasHp();

    public abstract  void hit(Warrior other);

    protected abstract void takeDamage(int damage);

    protected abstract int useMedKit();

    protected abstract void getALLInfo();


}