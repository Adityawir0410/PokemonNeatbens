package com.mycompany.pokemonneatbens;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GameManager {
    public Dunia dunia;
    public Player player;

    public GameManager() {

    }

    public void StartNewGame(){
        Scanner input = new Scanner(System.in);
        dunia = new HomeBase(new ArrayList<>());
        System.out.println("Selamat Datang di Dunia Okemon");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.println("Pilih 1 Okemon dari 3 Okemon berikut");
        System.out.println("1.Megali, Elemen: Api");
        System.out.println("2.Naida, Elemen: Air");
        System.out.println("3.Anemos, Elemen: Angin");
        System.out.printf("Pilihan Anda (1-3): ");
        int pilihan = 4;
        while (pilihan > 3 || pilihan < 1) {
            pilihan = input.nextInt();
            switch (pilihan) {
            case 1:
                player = new Player(nama, new ArrayList<>() , new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
                player.FirstOkemon(FireMonster.FireMonsterCollection(1,1));
                break;
            case 2:
                player = new Player(nama, new ArrayList<>() , new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
                player.FirstOkemon(WaterMonster.WaterMonsterCollection(0,1));
                break;
            case 3:
                player = new Player(nama, new ArrayList<>() , new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
                player.FirstOkemon(WindMonster.WindMonsterCollection(0,1));
                break;
            default:
                System.out.println("Pilihan Tidak Terdapat pilih (1-3)");
                break;
            }
        }
        player.money = 100;
        HomeBaseGUI rumah = new HomeBaseGUI(dunia, player);
        rumah.setVisible(true);
    }

    

    // Metode untuk menyimpan progres game ke file teks
    public void saveProgress(Player player, Dunia dunia) {
        try {
            FileWriter writer = new FileWriter("Save Okemon.txt");
            writer.write("Player Name: " + player.nama + "\n");
            writer.write("Player Money: " + player.money + "\n");
            writer.write("\n");
            writer.write("Health Potions: " + player.health.size() + "\n");
            writer.write("Courage Potions: " + player.courage.size() + "\n");
            writer.write("Okeball: " + player.okeball.size() + "\n");
            writer.write("\n");
            writer.write("Player Monster: \n");
            for (int i = 0; i < player.playerMonster.size(); i++) {
                Monster temp = player.playerMonster.get(i);
                writer.write("Monster " + temp.name + " " + temp.level + " "+ temp.maxHp + " " + temp.hp + " " + temp.ep + " " + temp.element + " " + temp.evolved + " " + temp.boosted);
            }
            writer.write("\n");
            writer.write("\n");
            writer.write("Monster Chest List: \n");
            for (int i = 0; i < dunia.monsterChest.size(); i++) {
                Monster temp = dunia.monsterChest.get(i);
                writer.write("Monster Chest " + temp.name + " " + temp.level + " "+ temp.maxHp + " " + temp.hp + " " + temp.ep + " " + temp.element + " " + temp.evolved + " " + temp.boosted);
            }
            writer.close();
            System.out.println("Progres berhasil disimpan ke progress.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan progres: " + e.getMessage());
        }
    }

    public Player loadProgress() {
        try {
            List<Item> health = new ArrayList<>();
            List<Item> courage = new ArrayList<>();
            List<Item> okeball = new ArrayList<>();
            List<Monster> monsterPlayer = new ArrayList<>();
            player = new Player("", health, courage, okeball, monsterPlayer);
            dunia = new HomeBase(new ArrayList<>());
            BufferedReader reader = new BufferedReader(new FileReader("Save Okemon.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Player Name: ")) {
                    player.nama = line.substring("Player Name: ".length());
                } else if (line.startsWith("Player Money: ")) {
                    player.money = Integer.parseInt(line.substring("Player Money: ".length()));
                } else if (line.equals("Health Potions: ")) {
                    int jumlah = Integer.parseInt(line.substring("Health Potions: ".length()));
                    for (int i = 0; i < jumlah; i++) {
                        health.add(new Item("Health Potion", 100, 0, 10));
                    }
                } else if (line.equals("Courage Potions: ")) {
                    int jumlah = Integer.parseInt(line.substring("Health Potions: ".length()));
                    for (int i = 0; i < jumlah; i++) {
                        courage.add(new Item("Attack Potion", 0, 0, 50));                    
                    }
                }else if (line.equals("Okeball : ")) {
                    int jumlah = Integer.parseInt(line.substring("Health Potions: ".length()));
                    for (int i = 0; i < jumlah; i++) {
                        okeball.add(new Item("OkeBall", 100, 0, 15));
                    }
                }else if (line.equals("Monster : ")) {
                    String full = line.substring(9);
                    String [] bagian = full.split(" ");
                    String nama = bagian[0];
                    int level = Integer.parseInt(bagian[1]);
                    int maxHp = Integer.parseInt(bagian[2]);
                    int hp = Integer.parseInt(bagian[3]);
                    int ep = Integer.parseInt(bagian[4]);
                    Monster monster = null;
                    switch (bagian[5]) {
                        case "FIRE":
                            monster = new FireMonster(nama, level, maxHp, hp, ep);
                            break;
                        case "WATER":
                            monster = new WaterMonster(nama, level, maxHp, hp, ep);
                            break;
                        case "WIND":
                            monster = new WindMonster(nama, level, maxHp, hp, ep);
                            break;
                        case "ICE":
                            monster = new IceMonster(nama, level, maxHp, hp, ep);
                            break;
                        case "Earth":
                            monster = new EarthMonster(nama, level, maxHp, hp, ep);
                            break;
                        default:
                            break;
                    }
                    if (bagian[6].equalsIgnoreCase("true")) {
                        monster.evolved = true;
                    }else{
                        monster.evolved = false;
                    }

                    if (bagian[7].equalsIgnoreCase("true")) {
                        monster.boosted = true;
                    }else{
                        monster.boosted = false;
                    }
                    monsterPlayer.add(monster);
                }else if (line.equals("Monster Chest : ")) {
                    String full = line.substring(15);
                    String [] bagian = full.split(" ");
                    String nama = bagian[0];
                    int level = Integer.parseInt(bagian[1]);
                    int maxHp = Integer.parseInt(bagian[2]);
                    int hp = Integer.parseInt(bagian[3]);
                    int ep = Integer.parseInt(bagian[4]);
                    Monster monster = null;
                    switch (bagian[5]) {
                        case "FIRE":
                            monster = new FireMonster(nama, level, maxHp, hp, ep);
                            break;
                        case "WATER":
                            monster = new WaterMonster(nama, level, maxHp, hp, ep);
                            break;
                        case "WIND":
                            monster = new WindMonster(nama, level, maxHp, hp, ep);
                            break;
                        case "ICE":
                            monster = new IceMonster(nama, level, maxHp, hp, ep);
                            break;
                        case "Earth":
                            monster = new EarthMonster(nama, level, maxHp, hp, ep);
                            break;
                        default:
                            break;
                    }
                    if (bagian[6].equalsIgnoreCase("true")) {
                        monster.evolved = true;
                    }else{
                        monster.evolved = false;
                    }

                    if (bagian[7].equalsIgnoreCase("true")) {
                        monster.boosted = true;
                    }else{
                        monster.boosted = false;
                    }
                    dunia.monsterChest.add(monster);
                }
            }
            reader.close();
            System.out.println("Progres berhasil dimuat dari Save Okemon.txt");
            HomeBaseGUI rumah = new HomeBaseGUI(dunia, player);
            rumah.setVisible(true);
            return player;
        } catch (IOException e) {
            System.out.println("Gagal memuat progres: " + e.getMessage());
            return null;
        }
    }
}