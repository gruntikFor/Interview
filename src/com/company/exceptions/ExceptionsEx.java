package com.company.exceptions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExceptionsEx {
    public static void main(String[] args) {
        int[] arr = new int[1];

        try {
            arr[2] = 3;
            int i = Integer.parseInt("igor");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Err: Выход за пределы массива");
        } catch (NumberFormatException e) {
            System.out.println("Err: Ошибка преобразования в число");
        } finally {
            System.out.println("Наконец-то ошибка");
        }

        try {
            System.out.println("before comparing\nenter message: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                String str = br.readLine();
                if (str.equals("err")) {
                    throw new Exception("hello im error from console");
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Text after arrays");

    }
}
