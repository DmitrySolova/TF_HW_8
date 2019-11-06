package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        long n = in.nextInt();
        in.close();

        //        Деление на 15 без остатка

        Checker checkerFor15 = (number) -> {
            if (number % 15 == 0) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println("Число " + n + " делится на 15 без остатка? - " + checkerFor15.check(n));

        //        Число положительное

        Checker checkerForPlus = (number) -> {
            if (number > 0) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println("Число " + n + " положительное? - " + checkerForPlus.check(n));

//        Проверка на не принадлежит к числам Фибоначчи

        Checker checkerForFinum = (number) -> {
            long a = 0;
            long b = 1;

            while (b < number) {
                long c = a;
                a = b;
                b = c + b;
            }

            if (b != number) {
                return true;
            } else {
                return false;
            }

        };


        System.out.println("Число " + n + " не принадлежит к числам Фибоначчи? - " + checkerForFinum.check(n));


    }
}
