package com.company.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparatorExample {

    public static void main(String[] args) {
        TreeSet<User> treeSet = new TreeSet<>();
        treeSet.add(new User("igor"));
        treeSet.add(new User("andry"));
        System.out.println(treeSet);

        //if vasya before then arki return -value
        //if vasya later then arki return +value
        //если то, что мы передали идёт раньше, то возвращаем +value
        System.out.println(new User("vasya").compareTo(new User("zarki")));
        System.out.println("-------------");

        TreeSet<User> treeSet1 = new TreeSet<>(new UserComparator());
        treeSet1.add(new User("mari"));
        treeSet1.add(new User("basy"));
        treeSet1.add(new User("arty"));

        System.out.println(treeSet1);

        Comparator<User> userComparator = new UserNameComparator().thenComparing(new UserAgeComparator());
        TreeSet<User> treeSet2 = new TreeSet<>(userComparator);
        treeSet2.add(new User("igor",22));
        treeSet2.add(new User("igor",15));
        treeSet2.add(new User("sasha",22));

        System.out.println(treeSet2);


    }
}
