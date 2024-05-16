package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class WaterMonsterCollection{
    List<WaterMonster> list;
    public WaterMonsterCollection(){
        list = new ArrayList<>();
        isiMonster();
    }

    public void isiMonster(){
        list.add(new WaterMonster("Krya", 1 , 100, 100, 100));
        list.add(new WaterMonster("Pagomenos", 1 , 100, 100, 100));
    }

    public WaterMonster getMonster(int index){
        WaterMonster monster = list.get(index);
        return monster;
    }
}
