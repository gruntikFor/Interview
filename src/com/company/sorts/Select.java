package com.company.sorts;

import java.util.Arrays;

import static com.company.sorts.Common.*;

public class Select {
    static int[] arr = new int[]{13, 8, 2, 4, 9};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));

        //взять первый элемент
        //сказать, что он самый маленький
        //сравнить с ним следующий
        //если он меньше, сказать, что он самый маленький
        //пройти до конца и посмотреть есть ли меньше
        //потом поменять

        for (int left = 0; left < arr.length; left++) {
            int minInd = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i] < arr[minInd]) {
                    minInd = i;
                }
                System.out.println("i: " + left + "(" + arr[left] + ")" + " > j:" + minInd + "(" + arr[minInd] + ")\t" + Arrays.toString(arr));
            }
            swap(arr, left, minInd);
        }

    }
}
