package pokemons;

import fly.Wings;

public class Charizard extends Pokemon {
    public Charizard(int hp, int atk, Wings wings, Skill[] skills){
        super("리자몽", hp, atk, wings, skills); //부모클래스의 생성자 호출
        System.out.println("자몽자몽~");
    }

    @Override
    public void attack(Pokemon target, int choice) {
        int damage = getAtk() + 5 + this.skills[choice].getDamage();
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        System.out.println(name + " -> " + target.getName() + "에게 '"+ this.skills[choice].getName() + "' 사용! (데미지: " + damage + ")");//name is protected
        //target.setHp(target.getHP() - damage);
        target.receiveDamage(damage);
        System.out.println(target.name + "의 남은 HP: " + target.getHP());
    }
}