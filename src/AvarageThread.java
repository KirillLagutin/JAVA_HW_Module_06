public class AvarageThread extends Thread {
    public double aver(int[] array) {
        double res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res / array.length;
    }
}
