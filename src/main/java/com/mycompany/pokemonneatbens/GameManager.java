package com.mycompany.pokemonneatbens;
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
    public void saveProgress() {
       
    }
}