import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = 0;
        int demoninator = 0;

        try{
            System.out.print("input numerator: ");
//        double numerator = scanner.nextInt();
            numerator = scanner.nextInt();
            System.out.print("input demoninator: ");
//        double demoninator = scanner.nextInt();
            demoninator = scanner.nextInt();
        }catch (InputMismatchException err){
            System.out.println("숫자를 입력하세요.");
        }


        if(demoninator == 0){
            System.out.println("분모에는 0이 들어갈 수 없습니다.");
        }else {
            System.out.println(numerator / demoninator);
        }
    }
}
