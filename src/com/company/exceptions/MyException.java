package com.company.exceptions;

import lombok.AllArgsConstructor;

public class MyException extends Exception {
    int num;
    String message;

    public MyException(String message, int num) {
//        super(message);
        this.num = num;
        System.out.println("\u001B[31m" + "Your number can't be less then 1: " + num + "\u001B[0m");
    }
}
