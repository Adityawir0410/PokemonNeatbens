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
       int pilihan = sc.nextInt();
       switch (pilihan) {
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
            System.out.println("Monster Sudah di Evolve di level ini !");
       }else if(monster.level == 1){
            System.out.println("Tidak bisa Evolve di level 1, Tingkatkan level Monstermu !");
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
                        System.out.println("Invalid Input");
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
                            System.out.println("Invalid Input");
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
                        System.out.println("Invalid Input");
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
                        System.out.println("Invalid Input");
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
                        System.out.println("Invalid Input");
                            throw new InvalidEvolutionException("Invalid Elemen");
                    }
                    break;
            
                default:
                    break;
            }
            System.out.println("Monster Berhasil di Evolve");
            monster.evolved = true;
       }
   }
   
   public void bukaChestMonster(Player player, Dunia dunia){
        Scanner input = new Scanner(System.in);
        for(int i = 1; i <= dunia.monsterChest.size(); i++){
            System.out.println(i + ". " + dunia.monsterChest.get(i-1).name + " Level: " + dunia.monsterChest.get(i-1).level + " Elemen: " + dunia.monsterChest.get(i-1).element);
        }
        System.out.println("Apakah kamu ingin mengambil Okemon dari chest untuk kamu bawa?");
        System.out.printf("Pilih Okemon sesuai no urut nya jika tidak ingin mengambil pilih 0: ");
        int pilihan = input.nextInt();
        if(pilihan-1 != -1 && pilihan <= dunia.monsterChest.size()){
            if(player.playerMonster.size() < 3){
                player.playerMonster.add(dunia.monsterChest.get(pilihan-1));
            }else{
                System.out.println("Monster yang ada di tas kamu penuh pilih monster untuk dikeluarkan");
                for(int i = 1; i <= player.playerMonster.size(); i++){
                    System.out.println(i + ". " + player.playerMonster.get(i-1).name + " Level: " + player.playerMonster.get(i-1).level + " Elemen: " + player.playerMonster.get(i-1).element);
                }
                System.out.print("Pilih berdasarkan no urut: ");
                int pilihanKeluar = input.nextInt();
                while (pilihanKeluar-1 > 3 && pilihanKeluar-1 < 0) {
                    System.out.println("No urut tidak tersedia coba lagi: ");
                    pilihanKeluar = input.nextInt();
                }
                System.out.println(player.playerMonster.get(pilihanKeluar-1).name + " dimasukkan ke chest rumah");
                dunia.monsterChest.add(player.playerMonster.get(pilihanKeluar-1));
                player.playerMonster.remove(pilihanKeluar-1);
                player.playerMonster.add(dunia.monsterChest.get(pilihan-1));
            }
            dunia.monsterChest.remove(pilihan-1);
            System.out.println(player.playerMonster.get(player.playerMonster.size()-1).name+ " berhasil ditambahkan");
        }else{
            System.out.println("Gagal menambahkan Okemon");
        }
   }
    
}
class InvalidEvolutionException extends Exception {
   public InvalidEvolutionException(String message) {
       super(message);
   }
}