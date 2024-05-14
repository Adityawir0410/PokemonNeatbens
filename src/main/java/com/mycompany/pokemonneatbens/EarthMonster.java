/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;

/**
 *
 * @author aditya wirz
 */
// Class konkret untuk monster tanah
class EarthMonster extends Monster {
    public EarthMonster(String name, int level, int maxHp, int hp, int ep) {
        super(name, level, maxHp, hp, ep, Element.EARTH);
    }

    @Override
    public void basicAttack(Monster target) {
        // Implementasi serangan dasar
    }

    @Override
    public void specialAttack(Monster target) {
        // Implementasi serangan spesial
    }

    @Override
    public void elementalAttack(Monster target) {
        // Implementasi serangan elemen
    }

    @Override
    public void useItem(Item item) {
        // Implementasi penggunaan item
    }

    @Override
    public boolean runAway() {
        // Implementasi melarikan diri
        return true;
    }
}