import java.util.Arrays;

public class Main {
    /*Задание 1
    При старте приложения запускаются три потока.
Первый поток заполняет массив случайными числами. Два других
потока ожидают заполнения. Когда массив заполнен оба потока
запускаются. Первый поток находит сумму элементов массива,
второй поток среднеарифметическое значение в массиве.
Полученный массив, сумма и средне-арифметическое
возвращаются в метод main, где должны быть отображены.*/

    public static void main(String[] args) throws InterruptedException {
        final int size = 10;
        int[] arr = new int[size];

        RandomThread rt = new RandomThread(arr);
        SumThread st = new SumThread(arr);
        AverageThread at = new AverageThread(arr);

        rt.start();
        while (rt.isAlive()){
            try {
                st.sleep(1000);
                at.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        st.start();
        at.start();

        System.out.println("\n" + Arrays.toString(arr));

        System.out.println(st.sum);
        System.out.println(at.aver);
    }
}
