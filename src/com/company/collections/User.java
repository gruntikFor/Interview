package com.company.collections;

public class User implements Comparable<User> {
    String name;
    int age;

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + "' " +
                "age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(User user) {
        System.out.println(name.compareTo(user.name));
        return name.compareTo(user.name);
    }
}
