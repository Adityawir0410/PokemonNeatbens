/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokemonneatbens;

/**
 *
 * @author aditya wirz
 */
import java.io.*;
import java.util.*;

// Enum untuk elemen monster
enum Element {
    FIRE,
    WIND,
    WATER,
    ICE,
    EARTH,
    GRASS
}

// Class untuk item



// Class Exception buatan sendiri
class InvalidEvolutionException extends Exception {
    public InvalidEvolutionException(String message) {
        super(message);
    }
}

// Class untuk menangani game


// Class utama untuk menjalankan game
public class PokemonNeatbens {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        Scanner scanner = new Scanner(System.in);

        // Membuat monster pemain
        System.out.println("Masukkan nama monster pemain:");
        String playerMonsterName = scanner.nextLine();
        System.out.println("Pilih elemen monster (0 = api, 1 = angin):");
        int elementChoice = scanner.nextInt();
        Monster playerMonster;
        if (elementChoice == 0) {
            playerMonster = new FireMonster(playerMonsterName, 1, 100, 100, 0);
        } else {
            playerMonster = new WindMonster(playerMonsterName, 1, 80, 80, 0);
        }
        gameManager.addPlayerMonster(playerMonster);

        boolean gameRunning = true;
        while (gameRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Petualangan di Dungeon");
            System.out.println("2. Evolusi Monster");
            System.out.println("3. Simpan Progres");
            System.out.println("4. Keluar");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Menghasilkan monster liar...");
                    gameManager.generateWildMonsters();
                    if (gameManager.getWindMonster() != null) {
                        
                    }else if (gameRunning) {
                        
                    }else if (gameRunning) {
                        
                    }else if (gameRunning) {
                        
                    }else{
                        
                    }
                    System.out.println("Anda menemukan " + gameManager.getWildMonsters().size() + " monster liar!");

                    for (int i = 0; i < gameManager.getWildMonsters().size(); i++) {
                        Monster wildMonster = gameManager.getWildMonsters().get(i);
                        System.out.println((i + 1) + ". " + wildMonster.getName() + " (Level " + wildMonster.getLevel()
                                + ", Elemen " + wildMonster.getElement() + ")");
                    }

                    System.out.println("Pilih monster liar untuk dihadapi (masukkan nomor):");
                    int monsterIndex = scanner.nextInt() - 1;
                    if (monsterIndex >= 0 && monsterIndex < gameManager.getWildMonsters().size()) {
                        Monster wildMonster = gameManager.getWildMonsters().get(monsterIndex);
                        gameManager.startBattle(playerMonster, wildMonster);
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 2:
                    System.out.println("Pilih elemen baru untuk " + playerMonster.getName()
                            + " (0 = api, 1 = angin, 2 = air, 3 = es, 4 = tanah, 5 = rumput):");
                    int newElementChoice = scanner.nextInt();
                    Element newElement = null;
                    switch (newElementChoice) {
                        case 0:
                            newElement = Element.FIRE;
                            break;
                        case 1:
                            newElement = Element.WIND;
                            break;
                        case 2:
                            newElement = Element.WATER;
                            break;
                        case 3:
                            newElement = Element.ICE;
                            break;
                        case 4:
                            newElement = Element.EARTH;
                            break;
                        case 5:
                            newElement = Element.GRASS;
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    }

                    if (newElement != null) {
                        try {
                            gameManager.evolveMonster(playerMonster, newElement);
                        } catch (InvalidEvolutionException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 3:
                    gameManager.saveProgress();
                    break;
                case 4:
                    gameRunning = false;
                    System.out.println("Terima kasih telah bermain!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}