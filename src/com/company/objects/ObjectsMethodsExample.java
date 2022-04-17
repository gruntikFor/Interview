package com.company.objects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ObjectsMethodsExample {
    public static void main(String[] args) throws InterruptedException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Pet cat = new Pet("sema");
        Pet cat2 = cat.clone();

        System.out.println(cat);
        System.out.println(cat2);

        Object object = new Object();
        System.out.println(cat.getClass());

        System.out.println(List.of(Pet.class.getInterfaces()));
        System.out.println(List.of(Pet.class.getPackage()));
        System.out.println(List.of(Pet.class.getConstructors()));
        System.out.println(List.of(Pet.class.getClassLoader()));
        System.out.println(List.of(Pet.class.toGenericString()));
        System.out.println(List.of(Pet.class.isLocalClass()));

        Method method = Pet.class.getMethod("printMe");
        method.invoke(cat);

    }
}

class Pet implements Cloneable {
    public String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public void printMe() {
        System.out.println("print me");
    }

    @Override
    public Pet clone() {
        try {
            Pet clone = (Pet) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }


}

