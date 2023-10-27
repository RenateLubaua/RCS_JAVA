package org.example;

import java.util.Scanner;

public class Tasks {

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadi vēlamo masīva garumu");
        int garums = sc.nextInt();

        int[] numMasīvs = new int[garums];

        for (int i = 0; i < numMasīvs.length; i++) {
            System.out.println("Lūdzu ievadi masīva datus");
            numMasīvs[i] = sc.nextInt();
        }

        System.out.println("Ievadītie dati ir: ");

        for (int i = 0; i < numMasīvs.length; i++) {
            System.out.print(numMasīvs[i] + " ");
        }
    }
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        String[] ievade = new String[5];

        for ( int i=0; i<ievade.length; i++){
            System.out.println("Lūdzu ievadi savu frāzi");
            ievade[i] = sc.nextLine();
        }

        System.out.println("Ievadītās frāzes ir: ");

        for (int i = 0; i < ievade.length; i++) {
            System.out.print(ievade[i] + " ");
        }
    }
}

