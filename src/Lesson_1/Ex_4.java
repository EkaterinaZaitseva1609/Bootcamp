package Lesson_1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_4 {
    public static void main(String[] args) {
        System.out.println("Введите колличество элементов массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите значение массива");
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Начальный массив: [ ");
        System.out.print(Stream.of(array).map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.print("]");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+ 1] = temp;
                }
            }
            System.out.println();
            System.out.print(i + "[ ");
            System.out.print(Stream.of(array).map(String::valueOf).collect(Collectors.joining(", ")));
            System.out.print("]");
        }

    }
}
