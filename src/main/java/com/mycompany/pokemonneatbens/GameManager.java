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
        IsiNamaGui start = new IsiNamaGui(player,dunia);
        start.setVisible(true);
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
                writer.write("Monster " + temp.name + " " + temp.level + " "+ temp.maxHp + " " + temp.hp + " " + temp.ep + " " + temp.element + " " + temp.evolved + " " + temp.boosted + "\n");
            }
            writer.write("\n");
            writer.write("List: \n");
            for (int i = 0; i < dunia.monsterChest.size(); i++) {
                Monster temp = dunia.monsterChest.get(i);
                writer.write("Chest " + temp.name + " " + temp.level + " "+ temp.maxHp + " " + temp.hp + " " + temp.ep + " " + temp.element + " " + temp.evolved + " " + temp.boosted + "\n");
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
                }else if (line.startsWith("Health Potions: ")) {
                    int jumlah = Integer.parseInt(line.substring("Health Potions: ".length()));
                    for (int i = 0; i < jumlah; i++) {
                        player.health.add(new Item("Health Potion", 100, 0, 10));
                    }
                } else if (line.startsWith("Courage Potions: ")) {
                    int jumlah = Integer.parseInt(line.substring("Courage Potions: ".length()));
                    for (int i = 0; i < jumlah; i++) {
                        player.courage.add(new Item("Attack Potion", 0, 0, 50));                    
                    }
                }else if (line.startsWith("Okeball: ")) {
                    int jumlah = Integer.parseInt(line.substring("Okeball: ".length()));
                    for (int i = 0; i < jumlah; i++) {
                        player.okeball.add(new Item("OkeBall", 100, 0, 15));
                    }
                }else if (line.startsWith("Monster ")) {
                    String full = line.substring(8);
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
                    player.playerMonster.add(monster);
                }else if (line.startsWith("Chest ")) {
                    String full = line.substring(6);
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