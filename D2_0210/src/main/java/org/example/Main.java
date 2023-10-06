package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu, ievadi simbolu virkni");
        String virkne = sc.nextLine();

        if ((virkne.length()) >= 5 && virkne.contains("aba") ) {
            System.out.println("Ievade Veiksmīga");
        } else {
            System.out.println("Kļūda");
        }


    }


    public static void sample1() {
        System.out.println("Pirmais uzdevums");

        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi pirmo skaitli");

        int num1 = sc.nextInt();

        System.out.println("Lūdzu, ievadi otro skaitli");
        int num2 = sc.nextInt();

        System.out.println("Abu ievadīto skaitļu summa ir " + (num1 + num2));

    }

    public static void sample2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli");
        int num1 = sc.nextInt();

        System.out.println("Ievadiet otro skaitli");
        int num2 = sc.nextInt();

        if ((num1 + num2) > 10) {
            System.out.println("###");
        } else {
            System.out.println("####");
        }
    }

    public static void sample3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu, ievadi simbolu virkni");
        String virkne = sc.nextLine();

        if ((virkne.length()) >= 5) {
            System.out.println("Ievade Veiksmīga");
        } else {
            System.out.println("Kļūda");
        }
    }

    public static void sample4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi pirmo skaitli");

        int num1 = sc.nextInt();

        System.out.println("Lūdzu, ievadi otro skaitli");
        int num2 = sc.nextInt();

        int sum = num1 + num2;


        if (sum >= 5 && sum <= 15) {
            System.out.println("Ievade veiksmīga");
        } else {
            System.out.println("Kļūda");
        }
    }
}