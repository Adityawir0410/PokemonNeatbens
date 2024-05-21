package com.mycompany.pokemonneatbens;

public class Item {
    private String name;
    private double effect;
    private int kuantitas;
    private double price;


    public Item(String name, double effect, int kuantitas, double price) {
        this.name = name;
        this.effect = effect;
        this.kuantitas = kuantitas;
        this.price = price;
    }

    // Getter dan setter
    public String getName() {
        return name;
    }

    public double getEffect() {
        return effect;
    }

    public int getKuantitas(){
        return kuantitas;
    }

    public double getPrice(){
        return price;
    }

    
}
