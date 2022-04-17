package com.company.typewrappers;

public class TypeWrappers {
    public static void main(String[] args) {

        Integer integer1 = new Integer("22");
        Integer integer2 = new Integer(22);
        System.out.println(integer1.equals(integer2));

        Float float1 = new Float("22");
        Float float2 = new Float(22.0);
        Float float3 = new Float(22.0f);

        System.out.println(float1 + " " + float2 + " " + float3);
        System.out.println(float1.equals(float2) && float2.equals(float3));

        Boolean boolean1 = new Boolean("true");
        System.out.println(boolean1);

        Integer integer3 = Integer.valueOf(22);
        Integer integer4 = Integer.valueOf("22");
        Integer integer5Bit = Integer.valueOf("101011", 2);
        System.out.println(integer5Bit);

        int integer6 = Integer.parseInt("11", 2);
        System.out.println(integer6);

        String string1 = Double.toString(22.0);
        System.out.println(string1);

        String string2 = Long.toString(55, 16);
        System.out.println(string2);

        System.out.println(Integer.toHexString(22));
        System.out.println(Integer.toOctalString(22));
        System.out.println(Integer.toBinaryString(22));

        Number number = Integer.valueOf(22);
        System.out.println(number);

        double v = number.doubleValue();
        long long2 = number.intValue();
        long long3 = (long) 23.9;
        System.out.println(long3);

        int a = 8;
        double b = 0.0;
        double c = -0.0;
        double g = Double.NEGATIVE_INFINITY;
        System.out.println(b == c);
        System.out.println(a / b);
        System.out.println(a / c);
        System.out.println(g * 0);

        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);

        System.out.println(i1 == i2);


    }
}
