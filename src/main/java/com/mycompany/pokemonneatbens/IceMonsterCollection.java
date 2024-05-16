package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class IceMonsterCollection{
    List<IceMonster> list;
    public IceMonsterCollection(){
        list = new ArrayList<>();
        isiMonster();
    }

    public void isiMonster(){
        list.add(new IceMonster("Krya", 1 , 100, 100, 100));
        list.add(new IceMonster("Pagomenos", 1 , 100, 100, 100));
    }

    public IceMonster getMonster(int index){
        IceMonster monster = list.get(index);
        return monster;
    }
}
