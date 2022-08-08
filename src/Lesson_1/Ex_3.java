package Lesson_1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_3 {
    public static void main(String[] args) {
       /* System.out.println("Введите колличество элементов массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите число сдвига");
        int k = sc.nextInt();

        //Заполнение массива
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число: ");
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Начальный массив: [ ");
        System.out.print(Stream.of(array).map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.print("]");
*/
        Integer[] array = {5, 3, 7, 4, 6};
        int kp = 3;
        int k = kp - 1;

        // Сдвиг
        if (k > 0) {
            for (int i = 0; i < k; i++) {
                int tmp = array[0];
                for (int j = 0; j < array.length - 1; j++)
                    array[j] = array[j + 1];
                array[array.length - 1] = tmp;
            }
        }
        else {
            for (int i = array.length; i < k; i++) {
                int tmp = array[0];
                for (int j = 0; j < array.length -1; j++)
                    array[j] = array[j + 1];
                array[array.length - 1] = tmp;
            }
        }


        System.out.println();
        System.out.print("Конечный массив: [ ");
        System.out.print(Stream.of(array).map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.print("]");
    }
}

