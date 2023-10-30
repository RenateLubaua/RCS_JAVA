package org.example;

import java.util.Scanner;

public class Samples {

    public static void sample2() {
//Uztaisīt metodi, kas ar return padod masīvu, kuru ir ievadījis lietotājs

        int[] a = genArr();
        printArr(a);

    }

    private static int[] genArr() {
        Scanner sc = new Scanner(System.in);
        int[] numMasivs = new int[3];

        for (int i=0; 1<numMasivs.length; i++){
            System.out.println("Lūdzu ievadiet skaitli");
            numMasivs[i]= sc.nextInt();
        }
        return numMasivs;

    }




    public static void sample1(){
        int[] a ={1, 6, 7, 9, 10, 1, 6};
        int[] b = {42, 31, 55, 68, 23, 17, 18};

        printArr(a);
        printArr(b);


    }
    private static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
