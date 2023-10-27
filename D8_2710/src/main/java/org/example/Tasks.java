package org.example;

import java.util.Scanner;

public class Tasks {
    public static void task1() {
        String[] ievade = new String[5];

        for ( int i=0; i<ievade.length; i++){
            Scanner sc = new Scanner(System.in);

            System.out.println("Lūdzu ievadi savu frāzi");
            ievade[i] = sc.nextLine();

        }


        System.out.println("Ievadītās frāzes ir: ");
        for (int i = 0; i < ievade.length; i++) {

            System.out.println(ievade[i] + " ");
        }

    }
}
