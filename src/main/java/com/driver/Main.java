package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
     static class B extends A {
        // Method overridden from Class A
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        B objB = new B();

        // Calling method from class A using objB
        String resultA = objB.meth(); // Will call the overridden method in Class B
        System.out.println("Result from method of Class A called by objB: " + resultA);

    }
  
}