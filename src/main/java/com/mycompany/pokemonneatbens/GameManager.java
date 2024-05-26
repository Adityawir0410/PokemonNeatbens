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
    public void saveProgress(Player player) {
        try {
            FileWriter writer = new FileWriter("Save Okemon.txt");
            writer.write("Player Name: " + player.nama + "\n");
            writer.write("Player Money: " + player.money + "\n");
            writer.write("\n");
            writer.write("Health Potions: " + player.health.size() + "\n");
            writer.write("Courage Potions: " + player.courage.size() + "\n");
            writer.write("Okeball: " + player.okeball.size() + "\n");
            writer.write("\n");
            writer.write("Player Monster: " + player + "\n");
            for (int i = 0; i < player.playerMonster.size(); i++) {
                Monster temp = player.playerMonster.get(i);
                writer.write("Monster ke-" + i +  " " + temp.name + " " + temp.ep + " " + temp.hp + " " + temp.boosted + " " + temp.evolved);
            }
            writer.close();
            System.out.println("Progres berhasil disimpan ke progress.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan progres: " + e.getMessage());
        }
    }

    public Player loadProgress() {
        try {
            Player player = new Player(null, null, null, null, null);
            BufferedReader reader = new BufferedReader(new FileReader("Save Okemon.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Player Name: ")) {
                    player.nama = line.substring("Player Name: ".length());
                } else if (line.startsWith("Player Money: ")) {
                    player.money = Integer.parseInt(line.substring("Player Money: ".length()));
                } else if (line.equals("Health Potions: ")) {
                    // Baca informasi item (Health Potions, Courage Potions, Okeball)
                    // dan tambahkan ke koleksi item pemain
                    // ...
                } else if (line.equals("Player Monster: ")) {
                    // Baca informasi monster (nama, ep, hp, boosted, evolved)
                    // dan tambahkan ke koleksi monster pemain
                    // ...
                }
            }
            reader.close();
            System.out.println("Progres berhasil dimuat dari Save Okemon.txt");
            return player;
        } catch (IOException e) {
            System.out.println("Gagal memuat progres: " + e.getMessage());
            return null;
        }
    }
}