import java.util.Random;

public class RandomThread extends Thread {
    private int[] array;
    public RandomThread(int[] array) {
        this.array = array;
    }

    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }
    }
}
