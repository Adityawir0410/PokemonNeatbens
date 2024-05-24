/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;

import java.util.List;

/**
 *
 * @author piosg
 */
public class HomeBase extends Dunia{
    Item shop[] = new Item[5];
    
    public HomeBase(List<Monster> monsterChest){
        super(monsterChest);
    }
    
    @Override
    public HomeBase GoToHomeBase() {
        throw new UnsupportedOperationException("Sudah berada di Home Base");
    }

    @Override
    public Dungeon GoDungeon() {
        return new Dungeon(super.monsterChest);
    }

    public void levelUpMonster() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void healMonster() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void changeElement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
