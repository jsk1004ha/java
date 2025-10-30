import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input numerator: ");
//        double numerator = scanner.nextInt();
        int numerator = scanner.nextInt();
        System.out.print("input demoninator: ");
//        double demoninator = scanner.nextInt();
        int demoninator = scanner.nextInt();

        if(demoninator == 0){
            System.out.println("분모에는 0이 들어갈 수 없습니다.");
        }else {
            System.out.println(numerator / demoninator);
        }
    }
}
