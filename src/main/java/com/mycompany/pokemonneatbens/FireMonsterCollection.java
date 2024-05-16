package com.mycompany.pokemonneatbens;


import java.util.ArrayList;
import java.util.List;

public class FireMonsterCollection{
    List<FireMonster> list;
    public FireMonsterCollection(){
        list = new ArrayList<>();
        isiMonster();
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
