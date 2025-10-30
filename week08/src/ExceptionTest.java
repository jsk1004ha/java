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
            int[] array = {99, -7, 33};
            System.out.println(array[1]);

            System.out.println(numerator / demoninator);
        }catch (InputMismatchException err){
            System.out.println("숫자를 입력하세요.");
            System.out.println(err.getMessage());
        }catch (ArithmeticException err) {
            System.out.println("분모에는 0이 들어갈 수 없습니다.");
            System.out.println(err.getMessage());
        }catch (ArrayIndexOutOfBoundsException err){
            System.out.println("인덱스 범위 초과");
            System.out.println(err.getMessage());
        }catch (Exception err){ // 위에서 알 수 없는 에러 처리
            System.out.println("에러발생");
            System.out.println(err.getMessage());
        }finally {
            System.out.println("프로그램을 종료합니다.");
            // 자원 해체등에 필요할때 사용
        }

    }
}
