package Learning.CalcutateExecutionTime;
/*
time units
    millisecond 10^(-3) = 1/1,000
    microsecond 10^(-6) = 1/1,000,000
    nanosecond  10^(-9) = 1/1,000,000,000
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        // Do something
        Thread.sleep(3000);

        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(duration + "ms");
    }
}
