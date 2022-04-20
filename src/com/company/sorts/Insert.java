package com.company.sorts;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 3, 1, 7, 6, 4};

        System.out.println("before");
        System.out.println(Arrays.toString(arr));
        System.out.println("\n");

        insertSort(arr);

        System.out.println("\nafter\n");
        System.out.println(Arrays.toString(arr));

    }

    public static void insertSort(int[] arr) {

        //идём слева направо и проверяем, если левый элемент больше правого,
        //то меняем их местами и идём назад и проверяем остальные и так же меняем
        for (int i = 1; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr) + "\t current: " + arr[i]);

            int temp = arr[i]; // 3
            int j = i - 1; // inx 0
            while (j >= 0 && arr[j] > temp) { // если предыдуший больше следующего
                System.out.println("move: " + arr[j + 1] + " " + arr[j]);
                System.out.println("-----" + Arrays.toString(arr) + "-----");
                arr[j + 1] = arr[j]; //дублируем
                j--; //передвигаемся назад
            } 
            arr[j + 1] = temp;
        }
    }
}
