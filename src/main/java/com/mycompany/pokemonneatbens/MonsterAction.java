/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pokemonneatbens;

/**
 *
 * @author aditya wirz
 */
interface MonsterAction {
    void basicAttack(Monster target);

    void specialAttack(Monster target);

    void elementalAttack(Monster target);

    void useItem(Item item);

    boolean runAway();
}
