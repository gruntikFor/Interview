package com.company.sorts;

import java.util.Arrays;

public class MergeBaeldung {

    //Разделяем массив пополам, потом ещё пока он не станет длинной в одно число
    //в merge сравниваем левый массив в одного и правый и копируем их вместе
    //и потом их снова сливаем
    // [2,8,4,3]
    // [6,7,1,5]
    // [2,8]
    // [4,3]
    // [2]
    //      [2,8]
    // [8]

    public static void main(String[] args) {
        int[] source = {2, 8, 4, 3, 6, 7, 1, 5};

        mergeSort(source, source.length);
        System.out.println(Arrays.toString(source));
    }

    public static void mergeSort(int[] source, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = source[i];
        }
        for (int i = mid; i < n; i++) {
            rightArr[i - mid] = source[i];
        }
        mergeSort(leftArr, mid);
        mergeSort(rightArr, n - mid);

        merge(source, leftArr, rightArr, mid, n - mid);
    }

    public static void merge(int[] source, int[] leftArr, int[] rightArr, int left, int right) {

        int i = 0, j = 0, k = 0;

        //если левый массив меньше чем правый, то копируем в source
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                source[k++] = leftArr[i++];
            } else {
                source[k++] = rightArr[j++];
            }
        }
        while (i < left) {
            source[k++] = leftArr[i++];
        }
        while (j < right) {
            source[k++] = rightArr[j++];
        }
    }
}
