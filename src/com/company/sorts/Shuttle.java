package com.company.sorts;

import java.util.Arrays;

import static com.company.sorts.Common.swap;

public class Shuttle {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 1, 4, 6, 8};

        //проходим впёрд и сравниваем [1] и [0] элемент, если [0] > [1] то меняем
        //проходим дальше и меняем так же и возвращаемся назад
        //почти то же самое, что insert sort но здесь не запоминаем позицию, а сразу меняем

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (arr[z] < arr[z - 1]) {
                        swap(arr, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
