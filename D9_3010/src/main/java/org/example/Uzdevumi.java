package org.example;

import java.util.Scanner;

public class Uzdevumi {

    public static void task1() {
        Scanner sc = new Scanner(System.in);

        String[] array = new String[8];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Lūdzu ievadi masīva datus");
            array[i] = sc.nextLine();

        }

        symbols(array);
    }

    private static void symbols(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += i.length;
        }
        System.out.println("Ievadīto simbolu skaits ir: " +count);

    }
}

