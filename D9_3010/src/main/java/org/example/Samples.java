package org.example;

public class Samples {


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
