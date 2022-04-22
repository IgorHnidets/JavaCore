package com.Lesson5_abstract_static_final.game_Sasha;

class SecretAgent extends Warrior{

    private int damage;

    public SecretAgent(String name, String weapon, int hp, int damage, int medKit) {
        super(name, weapon, hp, medKit);
        this.damage = damage;
        this.medkit = medKit;
    }

    public int getMedKit() {
        return medkit;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public boolean hasMedKit() {
        if (medkit >= 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void hit(Warrior other) {
        other.takeDamage(damage);
    }

    @Override
    protected void takeDamage(int damage) {

        this.hp = this.hp - this.damage;
        System.out.println(getName() + " is hit!");
        System.out.println("HP of " + getName() + " : "  + this.hp);
    }

    public int useMedKit() {
        if (medkit > 0) {
            this.hp = hp + 300;
            medkit = medkit - 1;
            System.out.println(getName() + " just used medKit!\nNow his health is " + hp);
        }
        return this.hp;
    }

    @Override
    public boolean hasHp() {
        if (hp > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void getALLInfo() {
        System.out.println(getName() + " info: \nHP : " + getHp() + "\n" + "Weapon type : " + getWeapon() + "\n" + "MedKit amount:" + getMedKit() + "\n");
    }

}
