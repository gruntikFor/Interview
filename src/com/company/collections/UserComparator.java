package com.company.collections;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        System.out.println("name1: " + user1.name + " name2:" + user2.name + " compare:" + user1.name.compareTo(user2.name));
        return user1.name.compareTo(user2.name);
    }
}
