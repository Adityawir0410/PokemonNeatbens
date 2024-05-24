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

    private boolean canEvolve(Element currentElement, Element newElement) {
        // Implementasi aturan evolusi elemen monster
        switch (currentElement) {
            case FIRE:
                return newElement == Element.WIND || newElement == Element.EARTH;
            case WIND:
                return newElement == Element.FIRE || newElement == Element.WATER;
            case WATER:
                return newElement == Element.GRASS || newElement == Element.ICE;
            case ICE:
                return newElement == Element.WIND || newElement == Element.WATER;
            case EARTH:
                return newElement == Element.FIRE || newElement == Element.GRASS;
            case GRASS:
                return newElement == Element.EARTH || newElement == Element.WATER;
            default:
                return false;
        }
    }

    public void levelUpMonster() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void healMonster() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        // Metode untuk evolusi monster
   public void evolveMonster(Monster monster, Element newElement) throws InvalidEvolutionException {
       if (canEvolve(monster.getElement(), newElement)) {
           monster.setElement(newElement);
           System.out.println(monster.getName() + " berevolusi menjadi elemen " + newElement + "!");
       } else {
           throw new InvalidEvolutionException("Evolusi tidak valid untuk elemen tersebut.");
       }
   }
    
    
}
class InvalidEvolutionException extends Exception {
   public InvalidEvolutionException(String message) {
       super(message);
   }
}