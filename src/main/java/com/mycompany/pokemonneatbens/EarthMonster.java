/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aditya wirz
 */
class EarthMonster extends Monster {
    public EarthMonster(String name, int level, int maxHp, int hp, int ep) {
        super(name, level, maxHp, hp, ep, Element.EARTH);
    }

    public static EarthMonster EarthMonsterCollection(int index){
        List <EarthMonster> list = new ArrayList<>();
        list.add(new EarthMonster("Agoni", 1 , 100, 100, 100));
        list.add(new EarthMonster("Trachy", 1 , 100, 100, 100));

        if (index == 0) {
            return list.get(0);
        }else{
            return list.get(1);
        }
    }

    @Override
    public void basicAttack(Monster target) {
        int damage = level * 10;
        target.takeDamage(damage);
        System.out.println(
                name + " melakukan serangan dasar kepada " + target.getName() + " dan mengurangi " + damage + " HP.");
    }

    @Override
    public void specialAttack(Monster target) {
        int damage = level * 15;
        int selfDamage = (int) (maxHp * 0.1);
        takeDamage(selfDamage);
        target.takeDamage(damage);
        System.out.println(
                name + " melakukan serangan spesial kepada " + target.getName() + " dan mengurangi " + damage + " HP.");
        System.out.println(name + " juga mengalami damage " + selfDamage + " HP.");
    }

    @Override
    public void elementalAttack(Monster target) {
        int damage;
        if (target.getElement() == Element.WATER) {
            damage = level * 20; // Damage elemen efektif berdasarkan level
        } else {
            damage = level * 10; // Damage elemen normal berdasarkan level
        }
        
        if (boosted) {
            target.takeDamage(damage + 10);
        }else{
            target.takeDamage(damage);
        }
        System.out.println(name + " melakukan serangan elemen api kepada " + target.getName() + " dan mengurangi "
                + damage + " HP.");
    }

    @Override
    public void useItem(Item item) {
//        if (item.getType() == ItemType.HEALTH_POTION) {
//            int healAmount = 50;
//            heal(healAmount);
//            System.out.println(name + " menggunakan Health Potion dan memulihkan " + healAmount + " HP.");
//        } else if (item.getType() == ItemType.ELEMENTAL_POTION) {
//            int damage = level * 15;
//            System.out.println(
//                    name + " menggunakan Elemental Potion dan melakukan serangan api dengan damage " + damage + ".");
//        }
    }

    @Override
    public boolean runAway() {
        int chance = new Random().nextInt(100);
        if (chance < 50) { // 50% peluang berhasil melarikan diri
            System.out.println(name + " berhasil melarikan diri.");
            return true;
        } else {
            System.out.println(name + " gagal melarikan diri.");
            return false;
        }
    }
}
