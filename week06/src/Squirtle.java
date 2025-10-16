public class Squirtle extends Pokemon{
    public Squirtle(int hp, int atk){
        super("꼬부기", hp, atk); //부모클래스의 생성자 호출
        System.out.println("꼬북꼬북~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAtk() + 2   ;
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        System.out.println(name + " -> " + target.getName() + "에게 '물대포' 사용! (데미지: " + damage + ")"); //name is protected
        //target.setHp(target.getHP() - damage);
        target.receiveDamage(damage);
        System.out.println(target.name + "의 남은 HP: " + target.getHP());
    }
}