package HomeWork.ThreadTask;

public class ThreadSummator extends Thread {
    private int start, end;
    private int[] array;
    private int sum = 0;

    public ThreadSummator(int start, int end, int[] array) {
        super();
        this.start = start;
        this.end = end;
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}