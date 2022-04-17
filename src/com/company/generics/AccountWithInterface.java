package com.company.generics;

public class AccountWithInterface<T> implements Accountable<T> {
    private T id;
    private int sum;

    public AccountWithInterface(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
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
