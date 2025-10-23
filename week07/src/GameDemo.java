public class GameDemo {
    public static void main(String[] args) {
        Jetpack jetpack = new Jetpack();

        Pikachu p1 = new Pikachu(100, 27);
        p1.setFlyingTool(new NoFly());
        p1.performFlyable();
        p1.setFlyingTool(jetpack);
        p1.performFlyable();
        //Pikachu p2 = new Pikachu(100, 28);
        Charizard c1 = new Charizard(200, 40);
        c1.setFlyingTool(new Wings());
        c1.performFlyable();
        //Squirtle s1 = new Squirtle(120, 21);

        System.out.println("배틀 시작");
        System.out.println(p1);
        System.out.println(c1);
        System.out.println("=====================");

        int turn = 1;
        while(!p1.isFainted() && !c1.isFainted()){
            System.out.println("턴" + turn + "시작");
            p1.attack(c1);
            if(c1.isFainted()){
                System.out.println(c1.getName() + "이 기절했습니다! " + p1.getName() + " 승리");
                break;
            }
            c1.attack(p1);
            if(p1.isFainted()){
                System.out.println(p1.getName() + "이 기절했습니다! " + c1.getName() + " 승리");
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
