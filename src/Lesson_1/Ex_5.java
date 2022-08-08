package Lesson_1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_5 {
    public static void main(String[] args) {
        Integer[] arr = {0, -5, 2, 3, 5, 9, -1, 7};
        Integer[] res = QuickSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.print("отсортированный массив: [ ");
        System.out.print(Stream.of(res).map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.print("]");
    }


    public static Integer[] QuickSort(Integer[] inputArray, int minIndex, int maxIndex) {
        if(minIndex >= maxIndex) return  inputArray;
        int pivot = GetPivotIndex(inputArray, minIndex, maxIndex);
        QuickSort(inputArray, minIndex, pivot - 1);
        QuickSort(inputArray, pivot + 1, maxIndex);
        return inputArray;
    }

    public static Integer GetPivotIndex(Integer[] inputArray, int minIndex, int maxIndex) {
        int pivotIndex = minIndex - 1;
        for (int i = minIndex; i < maxIndex; i++) {
            if (inputArray[i] <= inputArray[maxIndex]) {
                pivotIndex++;
                Swap( inputArray, i, pivotIndex);
            }
        }
       pivotIndex++;
        Swap(inputArray, pivotIndex, maxIndex);
        return pivotIndex;
    }
    public static void Swap(Integer[] inputArray, Integer leftValue, Integer rightValue) {
        int temp = inputArray[leftValue];
        inputArray[leftValue] = inputArray[rightValue];
        inputArray[rightValue] = temp;
    }
}
