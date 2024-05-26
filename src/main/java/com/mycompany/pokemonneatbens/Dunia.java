package com.mycompany.pokemonneatbens;

import java.util.*;

public abstract class Dunia {
    public List<Monster> monsterChest = new ArrayList<>(); 
    public int digunakan;
    public Dunia(List<Monster> monsterChest){
        this.monsterChest = monsterChest;
        digunakan = 0;
    }
    public abstract HomeBase GoToHomeBase();
    public abstract Dungeon GoDungeon();
}
