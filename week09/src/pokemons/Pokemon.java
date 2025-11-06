package pokemons;

import fly.Flyable;

public abstract class Pokemon {
    //private String name;
    protected String name;
    private int hp;
    private int atk;
    protected Flyable flyingTool; // has-a (Aggregation)
    public Skill[] skills;

    public Pokemon(String name, int hp, int atk, Flyable flyingTool, Skill[] skills){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.flyingTool = flyingTool;
        this.skills = skills;
    }

    public String getName(){return name;}
    public int getAtk() {return atk;}
    public int getHP(){return hp;}

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFlyingTool(Flyable flyingTool) {
        this.flyingTool = flyingTool;
    }

    public void performFlyable(){
        this.flyingTool.fly(this);
    }

    public abstract void attack(Pokemon target, int choice);
    public void receiveDamage(int damage){
        this.hp = hp - damage;
        if(hp < 0) hp = 0;
    }
    public boolean isFainted(){
        return hp <= 0;
    }

    @Override
    public String toString() {
        return name + " {HP: " + hp + " ATK: "+ atk + "}";
    }
}