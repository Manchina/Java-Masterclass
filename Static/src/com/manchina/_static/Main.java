package com.manchina._static;

public class Main {
    public static int multiplier = 7;
    public static void main(String[] args) {
//          StaticTest firstInstance = new StaticTest("1st instance");
//          System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//          StaticTest secondTest = new StaticTest("2nd instance");
//          System.out.println(secondTest.getName() + " is instance number " + StaticTest.getNumInstances());
        multiply(6);

    }

    public static void multiply(int num){
        int ans = num * multiplier;
        System.out.println("The answer is " + ans);

    }
}