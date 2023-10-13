package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        sample3();
    }

    public static void sample3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu, norādi cik frāzes vēlies ievadīt");
        int num1 = sc.nextInt();
        sc.nextLine();

        int longest = 0;
        for (int i = 0; i <= num1; i++) {
            System.out.println("Lūdzu ievadi savu frāzi");
            String frāze = sc.nextLine();
            longest = longest + frāze.length();


            if ((frāze.length()) > 5) {
                System.out.println("Garākā frāze ir " + frāze);
            }
        }


//        System.out.println("Garākā frāze ir");

    }

    public static void sample2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu, norādi, cik skaitļus vēlies ievadīt");
        int num1 = sc.nextInt();

        double rezultāts=0;
        for (int i=0; i<num1; i++){
            System.out.println("Lūdzu ievadi savu skaitli");
            double num2=sc.nextDouble();
            rezultāts = rezultāts +num2;
        }
        System.out.println("Šo skaitļu vidējais ir " + rezultāts/num1);


    }

    public static void sample1() {
        for (int i = 99; i < 150; i++) {
            System.out.println(i+1);
        }
    }
}