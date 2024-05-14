package com.mycompany.pokemonneatbens;

public class Item {
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
