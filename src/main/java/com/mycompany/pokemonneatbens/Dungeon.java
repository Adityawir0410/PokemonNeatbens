/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;

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
    
}
