package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class IceMonsterCollection extends IceMonster{
    List<IceMonster> list;
    public IceMonsterCollection(String name, int level, int maxHp, int hp, int ep){
        super(name, level, maxHp, hp, ep);
        list = new ArrayList<>();
    }

    public void isiMonster(){
        list.add(new IceMonster("Krya", 1 , 100, 100, 100));
        list.add(new IceMonster("Pagomenos", 1 , 100, 100, 100));
    }
}
