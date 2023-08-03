package com.workintech.abstraction.monster;

public class Goblin extends Monster implements Poisonable {
    public Goblin(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return 0;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}
