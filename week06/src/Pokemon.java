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

    public String getName(){
        return name;
    }
    public int getHP(){
        return hp;
    }
    public abstract void attack(Pokemon target);

    @Override
    public String toString() {
        return name + " {HP: " + hp + " ATK: "+ atk + "}";
    }
}