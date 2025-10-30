import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("input demoninator: ");
        int demoninator = scanner.nextInt();

        System.out.println(numerator/demoninator);
    }
}
