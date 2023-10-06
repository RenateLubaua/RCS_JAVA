package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample3();

    }

    public static void sample3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadi skaitli");

        int num1=sc.nextInt();

        for (int i=num1; i<=6; i++){
            System.out.println(i);
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