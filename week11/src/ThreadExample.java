import java.util.InputMismatchException;

public class ThreadExample {
    private static void printTask(String name){
        System.out.println(name + "시작");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + "완료");
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Thread T1 = new Thread() {
            public void run() {
                printTask("상속 쓰레드");
            }
        };

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printTask("Runnable 쓰레드");
            }
        });

        Thread T3 = new Thread(()->printTask("람다 쓰레드"));

        T1.start();
        T2.start();
        T3.start();

        try {
            T1.join();
            T2.join();
            T3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        long duration = System.currentTimeMillis() - startTime;
        System.out.println("병렬 처리 총 시간: " + duration + "ms");
    }
}
