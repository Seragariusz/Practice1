package com.koniakhin.files.apples_02;

public class Main {
    static String method(int a, int b) {
        int c = b % a;
        return "Яблук залишилося в кошику: " + c;
    }

    public static void main(String[] args) {
        System.out.println(method(5, 24));
    }
}
