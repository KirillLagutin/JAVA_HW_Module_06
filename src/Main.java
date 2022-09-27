import java.util.Scanner;

public class Main {
    /*Задание 1
    При старте приложения запускаются три потока.
Первый поток заполняет массив случайными числами. Два других
потока ожидают заполнения. Когда массив заполнен оба потока
запускаются. Первый поток находит сумму элементов массива,
второй поток среднеарифметическое значение в массиве.
Полученный массив, сумма и средне-арифметическое
возвращаются в метод main, где должны быть отображены.*/

    public static void main(String[] args) {
        final int size = 10;
        int[] arr = new int[size];

        RandomThread rt = new RandomThread();
        SumThread st = new SumThread();
        AvarageThread at = new AvarageThread();

        rt.start();
        st.start();
        at.start();

        rt.rand(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(st.sum(arr));
        System.out.println(at.aver(arr));
    }
}
