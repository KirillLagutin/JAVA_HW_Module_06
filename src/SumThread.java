public class SumThread extends Thread {
    public int sum;
    private int[] array;
    public SumThread(int[] array) {
        this.array = array;
    }

    public void run() {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    }
}
