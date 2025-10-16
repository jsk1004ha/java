public class Pikachu extends Pokemon{
    public Pikachu(int hp){
        super("피카츄", hp); //부모클래스의 생성자 호출
        System.out.println("피카피카~");
    }

    @Override
    public void attack(Pokemon target) {
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        System.out.println(name + " -> " + target.getName() + "에게 '백만볼트' 사용!"); //name is protected
    }
}
