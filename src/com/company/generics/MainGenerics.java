package com.company.generics;

public class MainGenerics {
    public static void main(String[] args) {
        Account<String> account = new Account<>("igor", 22);
        Account<Integer> account2 = new Account<>(10, 40);

        System.out.println(account);
        System.out.println(account2);

        AccountT<Integer> accountT = new AccountT<>(12, 30);
        AccountT<Float> accountT2 = new AccountT<>(12.0f, 30);

        System.out.println(accountT.getId().getClass());
        System.out.println(accountT2.getId().getClass());

        Accountable<String> accountWithInterface = new AccountWithInterface<String>("idNumber", 22);
        Accountable<Integer> accountWithInterface2 = new AccountWithInterface<Integer>(14, 22);

        System.out.println(accountWithInterface);
        System.out.println(accountWithInterface2);

        AccountTS<Integer, String> accountTS = new AccountTS<>(12, "mash");
        AccountTS<String, String> accountTS2 = new AccountTS<>("igor", "gruntoff");

        System.out.println(accountTS);
        System.out.println(accountTS2);

//        Integer[] arr = {1, 2, 3, 4, 5};
//        String[] arr2 = {"a", "b", "c", "d", "e"};
//
//        MainGenerics mainGenerics = new MainGenerics();
//        mainGenerics.printer(arr);
//        mainGenerics.printer(arr2);

    }

    public <T> void printer(T[] arr) {
        for (T val : arr) {
            System.out.println(val);
        }
    }
}
