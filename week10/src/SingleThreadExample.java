public class SingleThreadExample {
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

        runTask("첫번째");
        runTask("두번째");

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("순차 처리 총 시간: " + duration + "ms");
    }
}
