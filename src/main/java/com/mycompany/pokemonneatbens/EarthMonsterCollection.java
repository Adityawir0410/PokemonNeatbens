package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class EarthMonsterCollection extends EarthMonster{
    public EarthMonsterCollection(String name, int level, int maxHp, int hp, int ep){
        super(name, level, maxHp, hp, ep);
        
    }

    public void isiMonster(){

        List<EarthMonster> list = new ArrayList<>();
        list.add(new EarthMonster("Agoni", 1 , 100, 100, 100));
        list.add(new EarthMonster("Trachy", 1 , 100, 100, 100));
    }
}
