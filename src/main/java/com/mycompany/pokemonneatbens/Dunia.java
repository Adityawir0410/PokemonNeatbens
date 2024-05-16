package com.mycompany.pokemonneatbens;

import com.mycompany.pokemonneatbens.Dungeon;

public abstract class Dunia {
    public Monster monsterChest[] = new Monster[15];
    public Dunia(Monster monsterChest[]){
        monsterChest = this.monsterChest;
    }
    public abstract HomeBase GoToHomeBase();
    public abstract Dungeon GoDungeon();
}
