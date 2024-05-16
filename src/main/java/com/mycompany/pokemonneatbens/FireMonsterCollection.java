package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class FireMonsterCollection extends FireMonster{
    List<FireMonster> list;
    public FireMonsterCollection(String name, int level, int maxHp, int hp, int ep){
        super(name, level, maxHp, hp, ep);
        
    }

    public void isiMonster(){

        list = new ArrayList<>();
        list.add(new FireMonster("Fotia", 1 , 100, 100, 100));
        list.add(new FireMonster("Megali", 1 , 100, 100, 100));
    }

    public FireMonster getMonster(int index){
        FireMonster monster = list.get(index);
        return monster;
    }
}
