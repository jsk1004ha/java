public class Pikachu extends Pokemon{
    public Pikachu(int hp, int atk){
        super("피카츄", hp, atk); //부모클래스의 생성자 호출
        System.out.println("피카피카~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAtk() + 5;
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        System.out.println(name + " -> " + target.getName() + "에게 '10만볼트' 사용! (데미지: " + damage + ")");//name is protected
        //target.setHp(target.getHP() - damage);
        target.receiveDamage(damage);
        System.out.println(target.name + "의 남은 HP: " + target.getHP());
    }
}
