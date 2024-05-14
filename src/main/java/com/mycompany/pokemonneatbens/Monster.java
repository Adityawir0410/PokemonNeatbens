package com.mycompany.pokemonneatbens;

import com.mycompany.pokemonneatbens.MonsterAction;

abstract class Monster implements MonsterAction {
    protected String name;
    protected int level;
    protected int maxHp;
    protected int hp;
    protected int ep;
    protected Element element;

    public Monster(String name, int level, int maxHp, int hp, int ep, Element element) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.hp = hp;
        this.ep = ep;
        this.element = element;
    }

    public abstract void basicAttack(Monster target);

    public abstract void specialAttack(Monster target);

    public abstract void elementalAttack(Monster target);

    public abstract void useItem(Item item);

    public abstract boolean runAway();

    // Getter dan setter
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public int getEp() {
        return ep;
    }

    public Element getElement() {
        return element;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    // Metode untuk mengurangi HP monster
    public void takeDamage(int damage) {
        hp = Math.max(hp - damage, 0);
    }

    // Metode untuk menambah HP monster
    public void heal(int amount) {
        hp = Math.min(hp + amount, maxHp);
    }
}
