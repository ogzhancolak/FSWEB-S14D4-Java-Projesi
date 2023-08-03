package com.workintech.abstraction.monster;

public class MainMonster {
    public static void main(String[] args) {
        Troll troll = new Troll("Jane", 100,15.4);
        Kraken kraken = new Kraken("Zeus", 250,5.5);
        Goblin goblin = new Goblin("Gollum", 25,1.2);

        System.out.println("Troll's attack damage: " + troll.attack());
        System.out.println("Kraken's attack damage: " + kraken.attack());
        System.out.println("Goblin's attack damage: " + goblin.attack());
    }
}
