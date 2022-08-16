package com.koniakhin.files.apples;

public class Main {
    static String method(int a, int b){
        int c = b / a;
        return "Яблук кожному школяреві: " + c;
    }

    public static void main(String[] args) {
        System.out.println(method(5, 14));

    }
}
