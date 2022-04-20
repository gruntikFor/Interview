package com.company.sorts;

import java.util.Arrays;

import static com.company.sorts.Common.swap;

public class Shell {

    public static void main(String[] args) {
        int[] arr = new int[]{13, 8, 2, 4, 9};
        System.out.println(Arrays.toString(arr));

        //создаём промещуток длинной в два раза меньше длинны массива
        //ищем элементы с указаным промежуток
        //если левый больше правого, то меняем
        //уменьшаем промежуток

        int gap = arr.length / 2;

        while (gap >= 1) {
            for (int right = 0; right < arr.length; right++) {
                int cc = right - gap;
                System.out.println("bf: " + cc);
                cc -= gap;
                System.out.println("af: " + cc);
                for (int c = right - gap; c >= 0; c -= gap) {
                    System.out.println("_here c:" + c + " c+gap:" + (c + gap));
                    if (arr[c] > arr[c + gap]) {
                        swap(arr, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
