public class Charizard extends Pokemon{
    public Charizard(int hp, int atk, Wings wings){
        super("리자몽", hp, atk, wings); //부모클래스의 생성자 호출
        System.out.println("자몽자몽~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAtk() + 5;
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        System.out.println(name + " -> " + target.getName() + "에게 '연옥' 사용! (데미지: " + damage + ")");//name is protected
        //target.setHp(target.getHP() - damage);
        target.receiveDamage(damage);
        System.out.println(target.name + "의 남은 HP: " + target.getHP());
    }
}