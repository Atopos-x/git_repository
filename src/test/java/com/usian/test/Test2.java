package com.usian.test;

public class Test2 {
    public static class A
    {
        public String getString()
        {
            return "this is A";
        }
    }
    public static void main(String[] args)
    {
        A obj = new A();
        System.out.println(obj);
        System.out.println(obj.getString());
    }
}
