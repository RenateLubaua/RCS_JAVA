package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//
//        System.out.println("Hello and welcome!");
//        System.out.println(1 + 2);

        String sveiciens = "Lūdzu ievadiet savu mīļāko krāsu";
        System.out.println (sveiciens);

        Scanner sc = new Scanner (System.in);
        String colour = sc.nextLine();
        System.out.println("Krāsas ir "+" "+colour+" "+colour+" "+colour+" "+colour);

        String sveiciens2 = "Lūdzu ievadiet citu savu mīļāko krāsu";
        System.out.println (sveiciens2);
        String colour1 = sc.nextLine();
        System.out.println( colour1.repeat(4) );


    }
}
