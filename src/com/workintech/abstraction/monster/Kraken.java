package com.workintech.abstraction.monster;

public class Kraken extends Monster implements Bleedable, Poisonable {
    public Kraken(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}
