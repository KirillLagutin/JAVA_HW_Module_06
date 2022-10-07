public class AverageThread extends Thread {
    public double aver;
    private int[] array;
    public AverageThread(int[] array) {
        this.array = array;
    }

    public void run() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        aver = sum / array.length;
    }
}
