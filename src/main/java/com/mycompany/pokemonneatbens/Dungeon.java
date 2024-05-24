/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemonneatbens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author piosg
 */
public class Dungeon extends Dunia{

    public Dungeon(Monster[] monsterChest) {
        super(monsterChest);
    }

    @Override
    public HomeBase GoToHomeBase() {
        return new HomeBase(super.monsterChest);
    }
    @Override
    public Dungeon GoDungeon() {
        throw new UnsupportedOperationException("Kamu berada di Dungeon"); 
    }

     public void generateWildMonsters() {
        Random random = new Random();
        int numMonsters = 1;

        for (int i = 0; i < numMonsters; i++) {
            int type = random.nextInt(5);
            Monster monster = null;
            int pokemonRandom = random.nextInt(2);
            switch (type) {
                case 0:
                    monster = FireMonster.FireMonsterCollection(pokemonRandom);
                    break;
                case 1:
                    monster = EarthMonster.EarthMonsterCollection(pokemonRandom);
                    break;
                case 2:
                    monster = IceMonster.IceMonsterCollection(pokemonRandom);
                    break;
                case 3:
                    monster = WindMonster.WindMonsterCollection(pokemonRandom);
                    break;
                case 4:
                    monster = WaterMonster.WaterMonsterCollection(pokemonRandom);
                    break;
                default:
                    break;
            }
        }
    }


    public void startBattle(Player player, Monster playerMonster, Monster wildMonster) {
        Scanner scanner = new Scanner(System.in);
        boolean playerTurn = true;

        while (playerMonster.getHp() > 0 && wildMonster.getHp() > 0) {
            if (playerTurn) {
                System.out.println("\nGiliran Anda! Pilih aksi:");
                System.out.println("1. Serangan Dasar");
                System.out.println("2. Serangan Spesial");
                System.out.println("3. Serangan Elemen");
                System.out.println("4. Gunakan Item");
                System.out.println("5. Melarikan Diri");

                int choice = scanner.nextInt();
                Item item = null;
                switch (choice) {
                    case 1:
                        playerMonster.basicAttack(wildMonster);
                        break;
                    case 2:
                        playerMonster.specialAttack(wildMonster);
                        break;
                    case 3:
                        playerMonster.elementalAttack(wildMonster);
                        playerMonster.boosted = false;
                        break;
                    case 4:
                        System.out.println("Masukkan item yang ingin digunakan:");
                        System.out.println("1. Health Potion \n2. Attack Potion\n 3. OkeBall");
                        switch (scanner.nextInt()) {
                            case 1:
                                if (player.health.size() > 0) {
                                    item = player.health.get(0);
                                    playerMonster.hp += item.getEffect();
                                    player.health.remove(0);
                                }else{
                                    System.out.println("Kamu Tidak Punya Health Potion");
                                }
                                break;
                            case 2:
                                if (player.courage.size() > 0) {
                                    item = player.courage.get(0);
                                    playerMonster.boosted = true;
                                    player.courage.remove(0);
                                }else{
                                    System.out.println("Kamu Tidak Punya Courage Potion");
                                }
                                break;
                                case 3:
                                if (player.okeball.size() > 0) {
                                    item = player.courage.get(0);
                                    player.tangkapOkemon(wildMonster);
                                    if (wildMonster.ketangkap && digunakan != 15) {
                                        monsterChest[++digunakan] = wildMonster;
                                    }
                                    player.okeball.remove(0);
                                }else{
                                    System.out.println("Kamu Tidak Punya Courage Potion");
                                }
                                break;
                        
                            default:
                                break;
                        }
                        playerMonster.useItem(item);
                        break;
                    case 5:
                        if (playerMonster.runAway()) {
                            System.out.println("Anda berhasil melarikan diri dari pertarungan.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }

                playerTurn = false;
            } else {
                System.out.println("\nGiliran Monster Liar!");

                int choice = new Random().nextInt(3);
                switch (choice) {
                    case 0:
                        wildMonster.basicAttack(playerMonster);
                        break;
                    case 1:
                        wildMonster.specialAttack(playerMonster);
                        break;
                    case 2:
                        wildMonster.elementalAttack(playerMonster);
                        break;
                }

                playerTurn = true;
            }

            System.out.println("\nStatus:");
            System.out.println(playerMonster.getName() + " HP: " + playerMonster.getHp());
            System.out.println(wildMonster.getName() + " HP: " + wildMonster.getHp());
        }

        if (playerMonster.getHp() <= 0) {
            System.out.println("\nMonster Anda kalah dalam pertarungan!");
        } else {
            System.out.println("\nSelamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            playerMonster.setEp(playerMonster.getEp() + epGained);
            System.out.println(playerMonster.getName() + " mendapatkan " + epGained + " EP.");
        }
    }
}
