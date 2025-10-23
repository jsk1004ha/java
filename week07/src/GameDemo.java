public class GameDemo {
    public static void main(String[] args) {
        Pikachu p1 = new Pikachu(100, 27);
        Pikachu p2 = new Pikachu(100, 28);
        Charizard c1 = new Charizard(200, 40);
        Squirtle s1 = new Squirtle(120, 21);

        System.out.println("배틀 시작");
        System.out.println(p1);
        System.out.println(s1);
        System.out.println("=====================");

        int turn = 1;
        while(!p1.isFainted() && !p2.isFainted()){
            System.out.println("턴" + turn + "시작");
            p1.attack(p2);
            if(p2.isFainted()){
                System.out.println(p2.getName() + "이 기절했습니다! " + p1.getName() + " 승리");
                break;
            }
            s1.attack(p1);
            if(p1.isFainted()){
                System.out.println(p1.getName() + "이 기절했습니다! " + s1.getName() + " 승리");
                break;
            }
            System.out.println("=====================");
            turn++;
        }
        System.out.println("배틀종료");

//        Pikachu  mypikachu = new Pikachu(100, 27);
//        Pikachu  yourpikachu = new Pikachu(100, 28);
//        Squirtle enemysquirtle = new Squirtle(120, 21);
//        System.out.println("게임 시작");
//        mypikachu.attack(enemysquirtle);
//        for (int i=0;i<5;i++) {
//            enemysquirtle.attack(mypikachu);
//        }
//        System.out.println(enemysquirtle);
//        System.out.println(mypikachu);
    }
}
