package Lesson_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println("Введите колличество элементов массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Заполнение массива
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число: ");
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Начальный массив: [ ");
       /* for (int i : array)
            System.out.print(i + ", ");

        */

              System.out.print(Stream.of(array).map(String::valueOf).collect(Collectors.joining(", ")));
            System.out.print("]");

        // Сортировка
        for (int i = 0; i < n - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minInd]) {
                    minInd = j;
                }
            }
            int temp;
            temp = array[minInd];
            array[minInd] = array[i];
            array[i] = temp;
        }
        System.out.println();
        System.out.print("Конечный массив: [ ");
      /* for (int i : array)
            System.out.print(i + ", ");

       */
        System.out.print(Stream.of(array).map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.print("]");

    }
}


