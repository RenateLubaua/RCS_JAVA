package org.example;

import java.util.Scanner;

public class Homework {
    public static void Uzdevums1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadi vēlamo masīva garumu");
        int garums = sc.nextInt();

        int[] masīvs= new int[garums];

        for (int i = 0; i < masīvs.length; i++) {
            System.out.println("Lūdzu ievadi masīva datus");
            masīvs[i] = sc.nextInt();
        }

        int skaitļi=masīvs.length;
        double sum=0;
        for (int i = 0; i < masīvs.length; i++) {
            sum = sum + masīvs[i];
        }
        double vidējais = sum/skaitļi;

            System.out.println("Ievadīto skaitļu vidējā vērtība ir " + vidējais);

            System.out.println("Ievadi, kādu skaitli vēlies atrast datu sistēmā");
            int meklēt = sc.nextInt();

               boolean found=false;
        for (int i = 0; i < masīvs.length; i++) {
            if (masīvs[i] == meklēt) {
                System.out.println("Meklētā skaitļa indekss ir " + i);
            }
        }

            if(found == false){
                System.out.println("Ievadītais skaitlis datu sistēmā nav atrasts");
            }

            }
        }





