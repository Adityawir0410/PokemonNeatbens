/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;

import java.util.Random;

/**
 *
 * @author aditya wirz
 */
class FireMonster extends Monster {
    public FireMonster(String name, int level, int maxHp, int hp, int ep) {
        super(name, level, maxHp, hp, ep, Element.FIRE);
    }

    @Override
    public void basicAttack(Monster target) {
        int damage = level * 10; // Damage dasar berdasarkan level
        target.takeDamage(damage);
        System.out.println(
                name + " melakukan serangan dasar kepada " + target.getName() + " dan mengurangi " + damage + " HP.");
    }

    @Override
    public void specialAttack(Monster target) {
        int damage = level * 15; // Damage spesial berdasarkan level
        int selfDamage = (int) (maxHp * 0.1); // Damage ke diri sendiri (10% dari max HP)
        takeDamage(selfDamage);
        target.takeDamage(damage);
        System.out.println(
                name + " melakukan serangan spesial kepada " + target.getName() + " dan mengurangi " + damage + " HP.");
        System.out.println(name + " juga mengalami damage " + selfDamage + " HP.");
    }

    @Override
    public void elementalAttack(Monster target) {
        int damage;
        if (target.getElement() == Element.GRASS || target.getElement() == Element.ICE) {
            damage = level * 20; // Damage elemen efektif berdasarkan level
        } else {
            damage = level * 10; // Damage elemen normal berdasarkan level
        }
        target.takeDamage(damage);
        System.out.println(name + " melakukan serangan elemen api kepada " + target.getName() + " dan mengurangi "
                + damage + " HP.");
    }

    @Override
    public void useItem(Item item) {
        if (item.getType() == ItemType.HEALTH_POTION) {
            int healAmount = 50; // Jumlah HP yang akan dipulihkan
            heal(healAmount);
            System.out.println(name + " menggunakan Health Potion dan memulihkan " + healAmount + " HP.");
        } else if (item.getType() == ItemType.ELEMENTAL_POTION) {
            int damage = level * 15; // Damage serangan elemen berdasarkan level
            System.out.println(
                    name + " menggunakan Elemental Potion dan melakukan serangan api dengan damage " + damage + ".");
        }
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

