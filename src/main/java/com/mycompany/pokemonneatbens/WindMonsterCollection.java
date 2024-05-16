package com.mycompany.pokemonneatbens;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WindMonsterCollection extends WindMonster{
    public WindMonsterCollection(String name, int level, int maxHp, int hp, int ep){
        super(name, level, maxHp, hp, ep);
        
    }

    public void isiMonster(){
        Random random = new Random();

        List<WindMonster> list = new ArrayList<>();
        list.add(new WindMonster("Anemos", 1 , 100, 100, 100));
        list.add(new WindMonster("Ishchyroi", 1 , 100, 100, 100));
    }
}
