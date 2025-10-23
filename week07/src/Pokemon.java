public abstract class Pokemon {
    //private String name;
    protected String name;
    private int hp;
    private int atk;

    public Pokemon(String name, int hp, int atk){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public String getName(){return name;}
    public int getAtk() {return atk;}
    public int getHP(){return hp;}

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void receiveDamage(int damage){
        this.hp = hp - damage;
        if(hp < 0) hp = 0;
    }
    public boolean isFainted(){
        return hp <= 0;
    }
    public abstract void attack(Pokemon target);

    @Override
    public String toString() {
        return name + " {HP: " + hp + " ATK: "+ atk + "}";
    }
}