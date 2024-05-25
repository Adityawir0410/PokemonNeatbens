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
    Dunia dunia;
    Player player;

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

    public Monster generateWildMonsters(Player player) {
        Random random = new Random();
        int numMonsters = 1;
        Monster monster = null;
        int maxLevel = player.playerMonster.get(0).level;
        for(int i = 0; i < player.playerMonster.size(); i++){
            if(maxLevel < player.playerMonster.get(i).level){
                maxLevel = player.playerMonster.get(i).level;
            }
        }
        
        for (int i = 0; i < numMonsters; i++) {
            int type = random.nextInt(5);
            monster = null;
            int pokemonRandom = random.nextInt(2);
            int randomLevel = random.nextInt(1,maxLevel + 2); 
            switch (type) {
                case 0:
                    monster = FireMonster.FireMonsterCollection(pokemonRandom,randomLevel);
                    break;
                case 1:
                    monster = EarthMonster.EarthMonsterCollection(pokemonRandom, randomLevel);
                    break;
                case 2:
                    monster = IceMonster.IceMonsterCollection(pokemonRandom,randomLevel);
                    break;
                case 3:
                    monster = WindMonster.WindMonsterCollection(pokemonRandom,randomLevel);
                    break;
                case 4:
                    monster = WaterMonster.WaterMonsterCollection(pokemonRandom,randomLevel);
                    break;
                default:
                    break;
            }
        }
        return monster;
    }


    public int startBattle(Player player) {
        Scanner scanner = new Scanner(System.in);
        boolean playerTurn = true;
        System.out.println("Pilih Monster mu!");
        Monster playerMonster = null;
        int pilihan = 0;
        for(int i = 0; i < player.playerMonster.size(); i++){
            System.out.println(i+". " + player.playerMonster.get(i).name);
        }

        if (player.playerMonster.size() == 1) {
            playerMonster = player.playerMonster.get(0);
        }else if(player.playerMonster.size() == 2){
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                playerMonster = player.playerMonster.get(0);
                    break;
                case 2:
                playerMonster = player.playerMonster.get(1);
                    break;
                default:
                    System.out.println("Pilihan Invalid");
                    break;
            }
        }else {
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    playerMonster = player.playerMonster.get(0);
                    break;
                case 2:
                    playerMonster = player.playerMonster.get(1);
                    break;
                case 3:
                    playerMonster = player.playerMonster.get(2);
                    break;
                default:
                    System.out.println("Pilihan Invalid");
                    break;
            }
        }
        System.out.println("Kamu Mengeluarkan " + playerMonster.name );
        return pilihan;
    }

    public void playerDoingBasicAttack(Player player, Monster wildMonster, int index){ 
        player.playerMonster.get(index).basicAttack(wildMonster);
        int choice = new Random().nextInt(3);
        switch (choice) {
            case 0:
                wildMonster.basicAttack(player.playerMonster.get(index));
                break;
            case 1:
                wildMonster.specialAttack(player.playerMonster.get(index));
                break;
            case 2:
                wildMonster.elementalAttack(player.playerMonster.get(index));
                break;
        }
        if (player.playerMonster.get(index).getHp() <= 0) {
            System.out.println("\nMonster Anda kalah dalam pertarungan!");
            System.out.println("Kamu Kalah");
        } else if(wildMonster.getHp() <= 0){
            System.out.println("\nSelamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            player.playerMonster.get(index).setEp(player.playerMonster.get(index).getEp() + epGained);
            System.out.println(player.playerMonster.get(index).getName() + " mendapatkan " + epGained + " EP.");
            player.money += wildMonster.getLevel() * 10;
        }
    }
    public void playerDoingSpecialAttack(Player player, Monster wildMonster, int index){ 
        player.playerMonster.get(index).specialAttack(wildMonster);
        int choice = new Random().nextInt(3);
        switch (choice) {
            case 0:
                wildMonster.basicAttack(player.playerMonster.get(index));
                break;
            case 1:
                wildMonster.specialAttack(player.playerMonster.get(index));
                break;
            case 2:
                wildMonster.elementalAttack(player.playerMonster.get(index));
                break;
        }
        if (player.playerMonster.get(index).getHp() <= 0) {
            System.out.println("\nMonster Anda kalah dalam pertarungan!");
            System.out.println("Kamu Kalah");
        }  else if(wildMonster.getHp() <= 0){
            System.out.println("\nSelamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            player.playerMonster.get(index).setEp(player.playerMonster.get(index).getEp() + epGained);
            System.out.println(player.playerMonster.get(index).getName() + " mendapatkan " + epGained + " EP.");
            player.money += wildMonster.getLevel() * 10;
        }
    }
    public void playerDoingElementalAttack(Player player, Monster wildMonster, int index){ 
        player.playerMonster.get(index).elementalAttack(wildMonster);
        int choice = new Random().nextInt(3);
        switch (choice) {
            case 0:
                wildMonster.basicAttack(player.playerMonster.get(index));
                break;
            case 1:
                wildMonster.specialAttack(player.playerMonster.get(index));
                break;
            case 2:
                wildMonster.elementalAttack(player.playerMonster.get(index));
                break;
        }
        if (player.playerMonster.get(index).getHp() <= 0) {
            System.out.println("\nMonster Anda kalah dalam pertarungan!");
            System.out.println("Kamu Kalah");
        } else if(wildMonster.getHp() <= 0){
            System.out.println("\nSelamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            player.playerMonster.get(index).setEp(player.playerMonster.get(index).getEp() + epGained);
            System.out.println(player.playerMonster.get(index).getName() + " mendapatkan " + epGained + " EP.");
            player.money += wildMonster.getLevel() * 10;
        }
    }
    public boolean playerRun(Player player, Monster wildMonster, int index){
        if (player.playerMonster.get(index).runAway()) {
            System.out.println("Anda berhasil melarikan diri dari pertarungan.");
            return true;
        }
        int choice = new Random().nextInt(3);
        switch (choice) {
            case 0:
                wildMonster.basicAttack(player.playerMonster.get(index));
                break;
            case 1:
                wildMonster.specialAttack(player.playerMonster.get(index));
                break;
            case 2:
                wildMonster.elementalAttack(player.playerMonster.get(index));
                break;
        }
        if (player.playerMonster.get(index).getHp() <= 0) {
            System.out.println("\nMonster Anda kalah dalam pertarungan!");
            System.out.println("Kamu Kalah");
        } else if(wildMonster.getHp() <= 0){
            System.out.println("\nSelamat! Monster Anda menang dalam pertarungan!");
            int epGained = wildMonster.getLevel() * 10; // EP yang diperoleh berdasarkan level monster liar
            player.playerMonster.get(index).setEp(player.playerMonster.get(index).getEp() + epGained);
            System.out.println(player.playerMonster.get(index).getName() + " mendapatkan " + epGained + " EP.");
            player.money += wildMonster.getLevel() * 10;
        }
        return false;
    }
    public boolean playerUseItem(Player player, Monster wildMonster, int index){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan item yang ingin digunakan:");
        System.out.println("1. Health Potion \n2. Attack Potion\n3. OkeBall");
        Item item;
        switch (scanner.nextInt()) {
            case 1:
                if (player.health.size() > 0) {
                    item = player.health.get(0);
                    player.playerMonster.get(index).hp += item.getEffect();
                    if(player.playerMonster.get(index).hp > player.playerMonster.get(index).maxHp){
                        player.playerMonster.get(index).hp = player.playerMonster.get(index).maxHp;
                    }
                    player.health.remove(0);
                }else{
                    System.out.println("Kamu Tidak Punya Health Potion");
                }
                break;
            case 2:
                if (player.courage.size() > 0) {
                    item = player.courage.get(0);
                    player.playerMonster.get(index).boosted = true;
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
                        return true;
                    }
                    player.okeball.remove(0);
                }else{
                    System.out.println("Kamu Tidak Punya okeball");
                }
                break;
                        
            default:
                break;
        }
        return false;
    }
}
