package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class FireMonsterCollection extends FireMonster{
    public FireMonsterCollection(String name, int level, int maxHp, int hp, int ep){
        super(name, level, maxHp, hp, ep);
        
    }

    public void isiMonster(){

        List<FireMonster> list = new ArrayList<>();
        list.add(new FireMonster("Fotia", 1 , 100, 100, 100));
        list.add(new FireMonster("Megali", 1 , 100, 100, 100));
    }
}
