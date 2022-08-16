package com.koniakhin.files.nextNnumber;
import java.util.Scanner;

public class Main {
    static void method(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int num = scanner.nextInt();
        System.out.println("The next number for the number " + num + " is " + (num + 1) + ".");
        int num1 = num - 1;
        System.out.printf("The previous number for the number %d is %d.", num, num - 1);
    }

}
