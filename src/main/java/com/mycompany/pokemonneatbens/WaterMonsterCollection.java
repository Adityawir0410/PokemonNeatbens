package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class WaterMonsterCollection extends WaterMonster{
    List<WaterMonster> list;
    public WaterMonsterCollection(String name, int level, int maxHp, int hp, int ep){
        super(name, level, maxHp, hp, ep);
        list = new ArrayList<>();
    }

    public void isiMonster(){
        list.add(new WaterMonster("Krya", 1 , 100, 100, 100));
        list.add(new WaterMonster("Pagomenos", 1 , 100, 100, 100));
    }
}
