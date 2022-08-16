package com.koniakhin.files.hypotenuse;

import java.util.Scanner;

public class Main {

    static double method(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину первой стороны: ");
        int a = scanner.nextInt();
        System.out.print("Введите длину второй стороны: ");
        int b = scanner.nextInt();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;

    }



    public static void main(String[] args) {
        System.out.println("Длина гипотенузы: " + method());

    }
}
