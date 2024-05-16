package com.mycompany.pokemonneatbens;

import java.util.ArrayList;
import java.util.List;

public class WindMonsterCollection{
    List<WindMonster> list;
    public WindMonsterCollection(){
        list = new ArrayList<>();
        isiMonster();
    }

    public void isiMonster(){
        list.add(new WindMonster("Anemos", 1 , 100, 100, 100));
        list.add(new WindMonster("Ishchyroi", 1 , 100, 100, 100));
    }

    public WindMonster getMonster(int index){
        WindMonster monster = list.get(index);
        return monster;
    }
}
