package lambda.start;
//내코드
public abstract class checkTime {
    abstract void task();
    public final void run() {
        long startNs = System.nanoTime();
        task();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");

    }

}
