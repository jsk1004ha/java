package pokemons;

public class Skill {
    private String name;
    private int damage;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
