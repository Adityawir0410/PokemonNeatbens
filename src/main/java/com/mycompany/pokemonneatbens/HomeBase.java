/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;

/**
 *
 * @author piosg
 */
public class HomeBase extends Dunia{
    boolean changeElm;
    Monster monsterChest[] = new Monster[15];
    Item shop[] = new Item[5];
    
    @Override
    public HomeBase GoToHomeBase() {
        System.out.println("You are in homebase!");
    }

    @Override
    public void GoDungeon() {
        
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
