package com.mycompany.pokemonneatbens;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GameManager {
    private List<Monster> playerMonsters;
    private List<Monster> WildMonster;

    public GameManager() {
        playerMonsters = new ArrayList<>();
        WildMonster = new ArrayList<>();
    }

    // Metode untuk menambahkan monster pemain
    public void addPlayerMonster(Monster monster) {
        playerMonsters.add(monster);
    }

    // Metode untuk evolusi monster
    public void evolveMonster(Monster monster, Element newElement) throws InvalidEvolutionException {
        if (canEvolve(monster.getElement(), newElement)) {
            monster.setElement(newElement);
            System.out.println(monster.getName() + " berevolusi menjadi elemen " + newElement + "!");
        } else {
            throw new InvalidEvolutionException("Evolusi tidak valid untuk elemen tersebut.");
        }
    }

    // Metode untuk memeriksa apakah evolusi diperbolehkan
    private boolean canEvolve(Element currentElement, Element newElement) {
        // Implementasi aturan evolusi elemen monster
        switch (currentElement) {
            case FIRE:
                return newElement == Element.WIND || newElement == Element.EARTH;
            case WIND:
                return newElement == Element.FIRE || newElement == Element.WATER;
            case WATER:
                return newElement == Element.GRASS || newElement == Element.ICE;
            case ICE:
                return newElement == Element.WIND || newElement == Element.WATER;
            case EARTH:
                return newElement == Element.FIRE || newElement == Element.GRASS;
            case GRASS:
                return newElement == Element.EARTH || newElement == Element.WATER;
            default:
                return false;
        }
    }

    // Metode untuk menyimpan progres game ke file teks
    public void saveProgress() {
        try {
            FileWriter writer = new FileWriter("game_progress.txt");
            writer.write("Progres Game:\n");
            writer.write("Monster Pemain:\n");
            for (Monster monster : playerMonsters) {
                writer.write(monster.getName() + ", Level: " + monster.getLevel() + ", HP: " + monster.getHp() + "/"
                        + monster.getMaxHp() + ", EP: " + monster.getEp() + ", Elemen: " + monster.getElement() + "\n");
            }
            writer.close();
            System.out.println("Progres game berhasil disimpan ke file game_progress.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}