package com.company.exceptions;

public class FactorialEx {
    public static void main(String[] args) {

        factorial(-1);
    }

    public static void factorial(int num) {

        try {
            if (num < 1) throw new MyException("Number can't be less then 1", num);
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println("factorial " + num + " = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
