package com.company.sorts;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 1, 4, 6, 8};

        System.out.println("before");
        System.out.println(Arrays.toString(arr));
        System.out.println("\n");

        insertSort(arr);

        System.out.println("\nafter\n");
        System.out.println(Arrays.toString(arr));

    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr) + "\t current: " + arr[i]);

            int temp = arr[i]; // 3
            int j = i - 1; // inx 0
            while (j >= 0 && arr[j] > temp) { // 2 > 3 пока левый элемент больше правого перемещаемся назад
                System.out.println("move: " + arr[j + 1] + " " + arr[j]);
                System.out.println("-----" + Arrays.toString(arr) + "-----");
                arr[j + 1] = arr[j]; //дублируем
                j--; //передвигаемся назад
            } 
            arr[j + 1] = temp;
        }
    }
}
