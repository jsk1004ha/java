public class GameDemo {
    public static void main(String[] args) {
        Pikachu  mypikachu = new Pikachu(100);
        Pikachu  yourpikachu = new Pikachu(100);
        Squirtle enemysquirtle = new Squirtle(120);
        System.out.println("게임 시작");
        mypikachu.attack(enemysquirtle);
        enemysquirtle.attack(mypikachu);
    }
}
