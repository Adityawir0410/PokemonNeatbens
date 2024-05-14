package com.mycompany.pokemonneatbens;

public interface MonsterAction {
    void basicAttack(Monster target);

    void specialAttack(Monster target);

    void elementalAttack(Monster target);

    void useItem(Item item);

    boolean runAway();
}
