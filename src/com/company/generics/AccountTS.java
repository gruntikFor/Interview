package com.company.generics;

public class AccountTS<T, S> {
    private T id;
    private S sum;

    public AccountTS(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
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
