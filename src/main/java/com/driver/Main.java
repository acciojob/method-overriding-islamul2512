package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
     public static class B extends A {
        // Method overridden from Class A
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
       B b = new B();
        System.out.println(b.meth());
        B s = new B();
        System.out.println(s.meth());
    }
  
}