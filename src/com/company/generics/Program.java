package com.company.generics;

public class Program {

    public static void main(String[] args) {

        Account2 acc1 = new Account2("1235rwr", 3000);
        Account2 acc2 = new Account2("2373", 4300);
        Transaction<Account2> tran1 = new Transaction<Account2>(acc1, acc2, 1560);
        tran1.execute();
    }
}

interface Accountable2 {
    String getId();

    int getSum();

    void setSum(int sum);
}

class Account2 implements Accountable2 {

    private String id;
    private int sum;

    Account2(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

class Transaction<T extends Account2 & Accountable2> {

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        System.out.printf("Account sum %d",
                from.getSum() + to.getSum());
    }
}
