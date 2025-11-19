public class MultiTreadExample {
    private static void runTask(String name){
        for(int i = 1; i<=5; i++){
            System.out.println(name + "쓰레드" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        class MyThread implements Runnable{

            private String threadName;

            public MyThread(String name) {
                this.threadName = name;
            }

            @Override
            public void run() {
                for(int i = 1; i<=5; i++){
                    System.out.println(threadName + " 스레드 " + i);
                    try {
                        Thread.sleep(500); // 0.5초 대기
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(threadName + "스레드 완료");
            }
        }

        Thread t1 = new Thread(new MyThread("첫번째"));
        Thread t2 = new Thread(new MyThread("두번째"));

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("순차 처리 총 시간: " + duration + "ms");
    }
}
