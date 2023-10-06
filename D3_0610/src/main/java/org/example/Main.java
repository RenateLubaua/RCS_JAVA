package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample4();

    }


    public static void sample4(){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<7; i++){
            System.out.println("Lūdzu ievadi skaitli");
            int num1=sc.nextInt();

            if (num1%2==0) {
                System.out.println(num1 + " ir pāra skaitlis");
            } else {
                System.out.println("0");
            }
        }
    }



    public static void sample3(){
        Scanner sc = new Scanner(System.in);


        for (int i=0; i<5; i++){
            System.out.println("Lūdzu ievadi skaitli");
            int num1=sc.nextInt();

            System.out.println("Rezultāts ir " + (num1+2));
        }


    }

    public static void sample2() {

        for (int i = 0; i < 5; i++) {
            if (i != 1) {
                System.out.println("Hello world");
            } else {
                System.out.println("Goodnight");
            }
        }
    }

    public static void sample1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
            System.out.println(i);
        }
    }
}