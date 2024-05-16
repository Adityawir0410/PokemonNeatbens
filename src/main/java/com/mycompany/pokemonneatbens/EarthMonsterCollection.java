package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class EarthMonsterCollection{
    List<EarthMonster> list;
    public EarthMonsterCollection(){
        list = new ArrayList<>();
        isiMonster();
        
    }

    public void isiMonster(){

        list = new ArrayList<>();
        list.add(new EarthMonster("Agoni", 1 , 100, 100, 100));
        list.add(new EarthMonster("Trachy", 1 , 100, 100, 100));
    }

    public EarthMonster getMonster(int index){
        EarthMonster monster = list.get(index);
        return monster;
    }
}
