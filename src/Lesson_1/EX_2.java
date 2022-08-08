package Lesson_1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EX_2 {
    public static void main(String[] args) {
        System.out.println("Введите колличество элементов массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] array = new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение: ");
            array[i] = sc.nextLine();

        }
        System.out.print("[ ");
        System.out.print(String.join(", ", array));
        System.out.print("]");

        // Сортировка
        for (int i = 0; i < n - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < 5; j++) {
                if (array[j].length() < array[minInd].length()) {
                    minInd = j;
                }
            }
            String temp;
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
