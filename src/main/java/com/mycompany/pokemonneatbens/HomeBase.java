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
public class HomeBase extends Dunia{
    List <Item> itemShop = new ArrayList<>();
    
    public HomeBase(List<Monster> monsterChest){
        super(monsterChest);
        itemShop.add(new Item("Health Potion", 100, 0, 10));
        itemShop.add(new Item("Attack Potion", 0, 0, 50));
        itemShop.add(new Item("OkeBall", 100, 0, 15));
    }
    
    @Override
    public HomeBase GoToHomeBase() {
        throw new UnsupportedOperationException("Sudah berada di Home Base");
    }

    @Override
    public Dungeon GoDungeon() {
        return new Dungeon(super.monsterChest);
    }

    // private boolean canEvolve(Monster monster) {
    //     if (monster.evolved) {
    //         return false;
    //     }else{
    //         return true;
    //     }
    // }

    public void Shop(Player player){
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di ZelShop");
        for(int i = 0; i < itemShop.size(); i++){
            System.out.println( i+1 + ". " + itemShop.get(i).getName() + " Harga: $" + itemShop.get(i).getPrice());
        }
        System.out.print("Pilih item yang ingin dibeli menggunakan angka (1-3): ");
        int pilihan = input.nextInt();
        input.close();
        switch (pilihan) {
            case 1:
                player.health.add(new Item("Health Potion", 100, 0, 10));
                break;
            case 2:
                player.courage.add(new Item("Attack Potion", 0, 0, 50));
                break;
            case 3:
                player.okeball.add(new Item("OkeBall", 100, 0, 15));
            default:
                break;
        }
    }

    public void healMonster(Player player) {
        for(int i = 0; i < player.playerMonster.size(); i++){
            player.playerMonster.get(i).setHp(player.playerMonster.get(i).maxHp);
        }
    }

   public void evolveMonster(Player player) throws InvalidEvolutionException {
       Scanner sc = new Scanner(System.in);
       Monster monster = null;
       int index = 0;
       System.out.println("Pilih Monster yang di Evolve: ");
       for (int i = 0; i < player.playerMonster.size(); i++) {
            monster = player.playerMonster.get(i);    
            System.out.println((i+1) + ". " + monster.name);
       }
       switch (sc.nextInt()) {
        case 1:
            monster = player.playerMonster.get(0);
            index = 0;
            break;
        case 2:
            monster = player.playerMonster.get(1);
            index = 1;
            break;
        case 3:
            monster = player.playerMonster.get(2);
            index = 2;
            break;
       
        default:
            break;
       }

        if (monster.evolved) {
            System.out.println("Monster Sudah di Evolve di level ini");
       }else{
            switch (monster.element) {
                case FIRE:
                    System.out.println("Evolve ke Elemen apa \n 1. Angin \n 2. Tanah" );
                    switch (sc.nextInt()) {
                        case 1:
                            monster = new WindMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                            break;
                        case 2:
                            monster = new EarthMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                            break;
                        default:
                            sc.close();
                            throw new InvalidEvolutionException("Invalid Elemen");
                    }
                    break;
                case WIND:
                    System.out.println("Evolve ke Elemen apa \n 1. Api \n 2. Air" );
                    switch (sc.nextInt()) {
                        case 1:
                            monster = new FireMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                            break;
                        case 2:
                            monster = new WaterMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                            break;
                        default:
                            sc.close();
                            throw new InvalidEvolutionException("Invalid Elemen");
                    }
                    break;
                case WATER:
                    System.out.println("Evolve ke Elemen apa \n 1. Angin \n 2. Es" );
                    switch (sc.nextInt()) {
                        case 1:
                            monster = new WindMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                            break;
                        case 2:
                            monster = new IceMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                            break;
                        default:
                        sc.close();
                            throw new InvalidEvolutionException("Invalid Elemen");
                    }
                    break;
                case ICE:
                    System.out.println("Evolve ke Elemen apa \n 1. Air \n 2. Tanah" );
                    switch (sc.nextInt()) {
                        case 1:
                            monster = new WaterMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                        break;
                        case 2:
                            monster = new EarthMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                        break;
                        default:
                        sc.close();
                            throw new InvalidEvolutionException("Invalid Elemen");
                    }
                    break;
                case EARTH:
                    System.out.println("Evolve ke Elemen apa \n 1. Api \n 2. Es" );
                    switch (sc.nextInt()) {
                        case 1:
                            monster = new FireMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                        break;
                        case 2:
                            monster = new IceMonster(monster.name, monster.level, monster.maxHp, monster.hp, monster.ep);
                            player.playerMonster.add(index,monster);
                            player.playerMonster.remove(index + 1);
                        break;
                        default:
                        sc.close();
                            throw new InvalidEvolutionException("Invalid Elemen");
                    }
                    break;
            
                default:
                    break;
            }
            System.out.println("Monster Berhasil di Evolve");
            monster.evolved = true;
            sc.close();
       }
   }
    
    
}
class InvalidEvolutionException extends Exception {
   public InvalidEvolutionException(String message) {
       super(message);
   }
}