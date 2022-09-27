import java.util.Random;

public class RandomThread extends Thread {
    public int[] rand(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }
}
