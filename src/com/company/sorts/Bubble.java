package com.company.sorts;

import java.util.Arrays;

import static com.company.sorts.Common.swap;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 8, 2, 4, 9};
        int[] arr2 = new int[]{13, 8, 2, 4, 9};
        int[] arr3 = new int[]{13, 8, 4, 2, 9};

        System.out.println(Arrays.toString(arr));

        //если левое больше - по возрастанию 1 2 3
        //если правое больше - по убыванию 3 2 1

        //сравниваем последний элемент и предпоследний, если предпоследний больше, то меняем
        for (int i = 0; i < arr.length - 1; i++) { //i = 0
            for (int j = 0; j < arr.length - 1; j++) { //j = 4
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
                System.out.println("i: " + i + "(" + arr[j] + ")" + " > j:" + j + "(" + arr[j + 1] + ")\t" + Arrays.toString(arr));
            }
        }
        System.out.println("-------------------------- right to left");

        for (int i = 0; i < arr2.length - 1; i++) { //i = 0
            for (int j = arr2.length - 1; j > i; j--) { //j = 4
                if (arr2[j - 1] > arr2[j]) {
                    swap(arr2, j - 1, j);
                }
                System.out.println("i: " + i + "(" + arr2[j - 1] + ")" + " > j:" + j + "(" + arr2[j] + ")\t" + Arrays.toString(arr2));
            }
        }

        System.out.println("--------------------------");

        System.out.println(Arrays.toString(arr3));

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;

            for (int i = 1; i < arr3.length; i++) {
                if (arr3[i] < arr3[i - 1]) {
                    swap(arr3, i, i - 1);
                    needIteration = true;
                    System.out.println("need: " + arr3[i] + " > " + arr3[i - 1]);
                }
                System.out.println("i: " + i + "\t(" + arr3[i] + ")" + "  " + "(" + arr3[i - 1] + ")\t" + Arrays.toString(arr3));
            }
        }

    }

}
