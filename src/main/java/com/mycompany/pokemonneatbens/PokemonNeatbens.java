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
class Item {
    private String name;
    private ItemType type;

    public Item(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    // Getter dan setter
    public String getName() {
        return name;
    }

    public ItemType getType() {
        return type;
    }
}

// Enum untuk tipe item
enum ItemType {
    HEALTH_POTION,
    ELEMENTAL_POTION,
    OTHER
}

// Class Exception buatan sendiri
class InvalidEvolutionException extends Exception {
    public InvalidEvolutionException(String message) {
        super(message);
    }
}

// Class untuk menangani game
class GameManager {
    private List<Monster> playerMonsters;
    private List<Monster> wildMonsters;

    // Getter untuk wildMonsters
    public List<Monster> getWildMonsters() {
        return wildMonsters;
    }

    public GameManager() {
        playerMonsters = new ArrayList<>();
        wildMonsters = new ArrayList<>();
    }

    // Metode untuk menambahkan monster pemain
    public void addPlayerMonster(Monster monster) {
        playerMonsters.add(monster);
    }

    // Metode untuk menghasilkan monster liar secara acak
    public void generateWildMonsters() {
        Random random = new Random();
        int numMonsters = random.nextInt(5) + 1; // Jumlah monster liar antara 1 hingga 5

        for (int i = 0; i < numMonsters; i++) {
            int type = random.nextInt(2); // Jenis monster (0 = api, 1 = angin)
            String name = "Wild Monster " + (i + 1);
            int level = random.nextInt(20) + 1; // Level monster liar antara 1 hingga 20
            int maxHp = level * 50; // Max HP berdasarkan level
            int hp = maxHp;
            int ep = 0;

            Monster monster;
            if (type == 0) {
                monster = new FireMonster(name, level, maxHp, hp, ep);
            } else {
                monster = new WindMonster(name, level, maxHp, hp, ep);
            }

            wildMonsters.add(monster);
        }
    }

    // Metode untuk memulai pertarungan
    public void startBattle(Monster playerMonster, Monster wildMonster) {
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

                switch (choice) {
                    case 1:
                        playerMonster.basicAttack(wildMonster);
                        break;
                    case 2:
                        playerMonster.specialAttack(wildMonster);
                        break;
                    case 3:
                        playerMonster.elementalAttack(wildMonster);
                        break;
                    case 4:
                        System.out.println("Masukkan item yang ingin digunakan:");
                        String itemName = scanner.next();
                        ItemType itemType;

                        if (itemName.equalsIgnoreCase("health potion")) {
                            itemType = ItemType.HEALTH_POTION;
                        } else if (itemName.equalsIgnoreCase("elemental potion")) {
                            itemType = ItemType.ELEMENTAL_POTION;
                        } else {
                            itemType = ItemType.OTHER;
                        }

                        Item item = new Item(itemName, itemType);
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

                int choice = new Random().nextInt(3); // Memilih aksi secara acak (0 = serangan dasar, 1 = serangan
                                                      // spesial, 2 = serangan elemen)
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