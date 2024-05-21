/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;

import java.util.Random;

/**
 *
 * @author piosg
 */
public class Dungeon extends Dunia{

    public Dungeon(Monster[] monsterChest) {
        super(monsterChest);
    }

    @Override
    public HomeBase GoToHomeBase() {
        return new HomeBase(super.monsterChest);
    }
    @Override
    public Dungeon GoDungeon() {
        throw new UnsupportedOperationException("Kamu berada di Dungeon"); 
    }

     public void generateWildMonsters() {
        Random random = new Random();
        int numMonsters = 1;

        for (int i = 0; i < numMonsters; i++) {
            int type = random.nextInt(5);
            Monster monster = null;
            int pokemonRandom = random.nextInt(2);
            switch (type) {
                case 0:
                    monster = FireMonster.FireMonsterCollection(pokemonRandom);
                    break;
                case 1:
                    monster = EarthMonster.EarthMonsterCollection(pokemonRandom);
                    break;
                case 2:
                    monster = IceMonster.IceMonsterCollection(pokemonRandom);
                    break;
                case 3:
                    monster = WindMonster.WindMonsterCollection(pokemonRandom);
                    break;
                case 4:
                    monster = WaterMonster.WaterMonsterCollection(pokemonRandom);
                    break;
                default:
                    break;
            }
        }
    }
    
}
