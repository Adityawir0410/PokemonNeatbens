/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;
import java.util.*;
/**
 *
 * @author piosg
 */
public class Player {
    String nama;
    List <Item> health; 
    List <Item> courage;
    List <Item> okeball;
    List <Monster> playerMonster;

    public Player(String nama){
        this.nama = nama;
        health = new ArrayList<Item>();
        courage = new ArrayList<Item>();
        okeball =new ArrayList<Item>();
        playerMonster = new ArrayList<>();
    }

    public void tangkapOkemon(Monster WildMonster){
        if (WildMonster.hp / WildMonster.maxHp * 100 < 25) {
            //ketangkap jir terus ini ditambahin ke mana gatau wkwkwkwk
            System.out.println("Kamu menangkap " + WildMonster.name);
            WildMonster.ketangkap = true;
        }else{
            System.out.println(WildMonster.name + " Tidak Ketangkap");
        }
    }
}
