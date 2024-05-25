package com.mycompany.pokemonneatbens;


abstract class Monster implements MonsterAction {
    protected String name;
    protected int level;
    protected int levelBefore;
    protected int maxHp;
    protected int maxEp;
    protected int hp;
    protected int ep;
    protected Element element;
    protected boolean boosted;
    protected boolean ketangkap;

    public Monster(String name, int level, int maxHp, int hp, int ep, Element element) {
        this.name = name;
        this.level = level;
        this.levelBefore = level;
        this.maxHp = maxHp + (((level-1)*100) * 1/4);
        this.maxEp = maxHp + (((level-1)*100) * 1/4);
        this.hp = this.maxHp;
        this.ep = ep;
        this.element = element;
        boosted = false;
        ketangkap = false;
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

    public int getLevelBefore() {
        return levelBefore;
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
        if(this.ep >= maxEp){
            this.level++;
            this.maxHp = maxHp + (((level-1)*100) * 1/4);
            this.maxEp = maxHp + (((level-1)*100) * 1/4);
        }
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
