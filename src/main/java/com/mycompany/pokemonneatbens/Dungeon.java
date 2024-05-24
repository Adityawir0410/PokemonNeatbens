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
public class Dungeon extends Dunia{

    public Dungeon(List<Monster> monsterChest) {
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


    public void startBattle(Player player, Monster wildMonster) {
        Scanner scanner = new Scanner(System.in);
        boolean playerTurn = true;
        System.out.println("Pilih Monster mu!");
        Monster playerMonster = null;
        if (player.playerMonster.size() == 1) {
            playerMonster = player.playerMonster.get(0);
        }else if(player.playerMonster.size() == 2){
            Monster mons1 = player.playerMonster.get(0);
            Monster mons2 = player.playerMonster.get(1);
            System.out.println("1. " + mons1.name + "\n" + "2. " + mons2.name);
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                playerMonster = mons1;
                    break;
                case 2:
                playerMonster = mons2;
                    break;
                default:
                    System.out.println("Pilihan Invalid");
                    break;
                }
            }else {
                Monster mons1 = player.playerMonster.get(0);
                Monster mons2 = player.playerMonster.get(1);
                Monster mons3 = player.playerMonster.get(2);
                int pilihan = scanner.nextInt();
                switch (pilihan) {
                    case 1:
                    playerMonster = mons1;
                        break;
                    case 2:
                    playerMonster = mons2;
                        break;
                    case 3:
                    playerMonster = mons3;
                        break;
                    default:
                        System.out.println("Pilihan Invalid");
                        break;
                    }
            }
            System.out.println("Kamu Mengeluarkan " + playerMonster.name );
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
                                        monsterChest.add(wildMonster);
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
            if (player.playerMonster.size() > 1) {
                int pilihan = player.playerMonster.indexOf(playerMonster);
                Monster mons1 = null;
                Monster mons2 = null;
                for (int i = 0; i < player.playerMonster.size(); i++) {
                    if (i != pilihan && mons1 == null) {
                        mons1 = player.playerMonster.get(i);
                        if (mons1.hp == 0) {
                            mons1 = null;
                        }
                    }else if (i != pilihan && mons1 != null) {
                        mons2 = player.playerMonster.get(i);
                        if (mons2.hp == 0) {
                            mons2 = null;
                        }
                    }
                }
                if (mons1 == null && mons2 == null) {
                    System.out.println("Kamu Kalah!");
                }else if(mons1 == null && mons2 != null) {
                    playerMonster = mons2;
                    System.out.println(mons2.name + " Keluar!");
                }else if(mons1 != null && mons2 == null) {
                    playerMonster = mons1;
                    System.out.println(mons1.name + " Keluar!");
                }else{
                    System.out.println("Pilih Monster Pengganti! \n" + "1. " + mons1.name + "\n2. " + mons2.name);
                    int choose = scanner.nextInt();
                    switch (choose) {
                        case 1:
                            playerMonster = mons1;
                            System.out.println("Kamu Memilih " + mons1.name);
                            break;
                        case 2:
                            playerMonster = mons2;
                            System.out.println("Kamu Memilih " + mons2.name);
                            break;
                        default:
                            System.out.println("Pilihan Invalid");
                            break;
                    }
                }
            }else{
                System.out.println("\nMonster Anda kalah dalam pertarungan!");
                System.out.println("Kamu Kalah");
            }
        } else {
            System.out.println("\nSelamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            playerMonster.setEp(playerMonster.getEp() + epGained);
            System.out.println(playerMonster.getName() + " mendapatkan " + epGained + " EP.");
        }
    }
}
