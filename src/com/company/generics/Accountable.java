package com.company.generics;

public interface Accountable<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}
