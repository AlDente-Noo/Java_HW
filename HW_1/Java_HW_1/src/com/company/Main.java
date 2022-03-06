package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(mod(111,3)); //Firstly Dividend then divider
        System.out.println(div(111,3)); //Firstly Dividend then divider
        System.out.println(Fibonacci(11));
    }

    private static int div(int dividend, int divider) {
        int quotient = 0;
        while (dividend - divider >= 0){
            quotient++;
            dividend-=divider;
        }
        return quotient;
    }
    private static int mod(int dividend, int divider) {
        int remainder = 0;
        while (dividend - divider >= 0){
            dividend-=divider;
        }
        remainder = dividend;
        return remainder;
    }
    private static int Fibonacci(final int n){

        if (n==1) {
            return 1;
        }
        if (n==0){
            return 0;
        }
        else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
    private static  void FizzBuzz(int n) {
        if (n%5 == 0 && n%3 == 0) {
            System.out.println("fizzbuzz");
            return;
        }
        if (n%3 == 0) {
            System.out.println("fizz");
            return;
        }
        if (n%5 == 0) {
            System.out.println("buzz");
            return;
        }

    }
}
