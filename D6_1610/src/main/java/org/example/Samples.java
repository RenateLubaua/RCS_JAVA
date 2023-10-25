package org.example;
import java.util.Scanner;

public class Samples {

    public static void uzdevums(){
        System.out.println("Sveiciens");
    }

    public  static int uzdevums2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ievadiet skaitli");
        int a= sc.nextInt();

        System.out.println("Ievadiet skaitli");
        int b= sc.nextInt();

        return a + b;
    }

    public static void uzdevums3(String a, String b, String c){
        System.out.println(a + b + c);
    }

    public static int uzdevums4(int a, int b){
        return a+b;
    }

}
