package com.company.generics;

public class Account<T> {
    private String id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id.toString();
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", sum=" + sum +
                '}';
    }
}
