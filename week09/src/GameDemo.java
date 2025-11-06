import fly.NoFly;
import fly.Wings;
import pokemons.Charizard;
import pokemons.Pikachu;
import pokemons.Pokemon;
import pokemons.Squirtle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
//        int randomNumber = (int) (Math.random() * 3); // 0~2
//        System.out.println(randomNumber);
    Pokemon playerPokemon = null;
    Scanner scaner = new Scanner(System.in);
    while (true) {
        try {
//            pokemons.Pokemon playerPokemon;
//            Scanner scaner = new Scanner(System.in);
            System.out.print("플레이어 포켓몬 선택\n1) 피카츄 2) 꼬부기 3) 리자몽: ");
            int number = scaner.nextInt();
            if (number == 1) {
                playerPokemon = new Pikachu(100, 27, new NoFly());
                break;
            } else if (number == 2) {
                playerPokemon = new Squirtle(120, 21, new NoFly());
                break;
            } else if (number == 3) {
                playerPokemon = new Charizard(200, 40, new Wings());
                break;
            } else
                System.out.println("메뉴에서 골라주세요.");

        }catch (InputMismatchException err) {
                System.out.println("메뉴에서 골라서 숫자로 입력하세요.");
                System.out.println(err.getMessage());
                scaner.nextLine(); // 버퍼에 남아있는 값 제거
        }
    }
        Pokemon enemyPokemon;
        int randomNumber = (int) (Math.random() * 3); // 0~2
        System.out.println("야생의 포켓몬이 나타났다!");
        if (randomNumber == 0)
            enemyPokemon = new Pikachu(100, 27, new NoFly());
        else if (randomNumber == 1)
            enemyPokemon = new Squirtle(120, 21, new NoFly());
        else if (randomNumber == 2)
            enemyPokemon = new Charizard(200, 40, new Wings());

//        pokemons.Pokemon playerPokemon = new pokemons.Pikachu(100, 27, new fly.NoFly());
//        pokemons.Pokemon playerPokemon = new pokemons.Charizard(200, 40, new fly.Wings());
//        pokemons.Pokemon playerPokemon = new pokemons.Squirtle(120, 21, new fly.NoFly());
//        fly.Jetpack jetpack = new fly.Jetpack();
//
//        pokemons.Pikachu p1 = new pokemons.Pikachu(100, 27,new fly.NoFly());
//        //p1.setFlyingTool(new fly.NoFly());
//        p1.performFlyable();
//        p1.setFlyingTool(jetpack);
//        p1.performFlyable();
//        //pokemons.Pikachu p2 = new pokemons.Pikachu(100, 28);
//        pokemons.Charizard c1 = new pokemons.Charizard(200, 40, new fly.Wings());
//        //c1.setFlyingTool(new fly.Wings());
//        c1.performFlyable();
//        //pokemons.Squirtle s1 = new pokemons.Squirtle(120, 21);
//
//        System.out.println("배틀 시작");
//        System.out.println(p1);
//        System.out.println(c1);
//        System.out.println("=====================");
//
//        int turn = 1;
//        while(!p1.isFainted() && !c1.isFainted()){
//            System.out.println("턴" + turn + " 시작");
//            p1.attack(c1);
//            if(c1.isFainted()){
//                System.out.println(c1.getName() + "이 기절했습니다! " + p1.getName() + " 승리");
//                break;
//            }
//            c1.attack(p1);
//            if(p1.isFainted()){
//                System.out.println(p1.getName() + "이 기절했습니다! " + c1.getName() + " 승리");
//                break;
//            }
//            System.out.println("=====================");
//            turn++;
//        }
//        System.out.println("배틀종료");
//
//        pokemons.Pikachu  mypikachu = new pokemons.Pikachu(100, 27);
//        pokemons.Pikachu  yourpikachu = new pokemons.Pikachu(100, 28);
//        pokemons.Squirtle enemysquirtle = new pokemons.Squirtle(120, 21);
//        System.out.println("게임 시작");
//        mypikachu.attack(enemysquirtle);
//        for (int i=0;i<5;i++) {
//            enemysquirtle.attack(mypikachu);
//        }
//        System.out.println(enemysquirtle);
//        System.out.println(mypikachu);
    }
}
