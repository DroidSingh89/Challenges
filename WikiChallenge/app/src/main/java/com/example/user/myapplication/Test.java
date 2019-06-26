package com.example.user.myapplication;

public class Test {

    public static void main(String[] args) {

        System.out.println(findFibonacci(5

        ));
    }

    public static int findFibonacci(int n) {

        if(n<=1) return 1;

        int n1 = 1, n2=1, n3 = 0;


        for (int i = 1; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n3;


    }
}
