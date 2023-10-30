package org.example;

import java.util.Scanner;
import java.util.Random;

public class Uzdevumi {


public static void task2() {

    int[] a = genRandom();
    printArr(a);
}

private static int[] genRandom(){
    Random rand = new Random();

    int[] arr = new int[5];
    for (int i=0; i<arr.length; i++){
        arr[i] = rand.nextInt(7);
    }

    return arr;

}



    private static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }




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
            count = count + array[i].length();
        }
        System.out.println("Ievadīto simbolu skaits ir: " +count);

    }
}

